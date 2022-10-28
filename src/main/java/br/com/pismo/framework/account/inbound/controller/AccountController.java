package br.com.pismo.framework.account.inbound.controller;

import br.com.pismo.application.account.core.Account;
import br.com.pismo.application.account.ports.in.CreateAccountUseCasePort;
import br.com.pismo.application.account.ports.in.FindAccountUseCasePort;
import br.com.pismo.framework.account.inbound.record.AccountRecord;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.net.URI;

@Validated
@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final CreateAccountUseCasePort createAccountPort;

    private final FindAccountUseCasePort findAccountPort;

    private final ConversionService conversionService;

    @GetMapping("/{id}")
    public ResponseEntity<AccountRecord> get(@PathVariable @Positive final int id) {
        return findAccountPort.findById(id)
                .map((account) -> conversionService.convert(account, AccountRecord.class))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AccountRecord> post(@RequestBody @Valid final AccountRecord record) {
        final Account account = conversionService.convert(record, Account.class);
        final Account created = createAccountPort.createAccount(account);
        final AccountRecord toReturn = conversionService.convert(created, AccountRecord.class);
        return ResponseEntity.created(URI.create("http://localhost:8080/account/" + created.getId())).body(toReturn);
    }

}
