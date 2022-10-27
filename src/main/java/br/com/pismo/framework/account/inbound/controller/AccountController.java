package br.com.pismo.framework.account.inbound.controller;

import br.com.pismo.application.account.core.Account;
import br.com.pismo.application.account.ports.in.CreateAccountUseCasePort;
import br.com.pismo.framework.account.inbound.record.AccountRecord;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final CreateAccountUseCasePort createAccountPort;
    private final ConversionService conversionService;

    @GetMapping("/{id}")
    public ResponseEntity<AccountRecord> get(@PathVariable final int id) {
        System.out.println("works");
        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<AccountRecord> post(@RequestBody @Valid final AccountRecord record) {
        final Account account = conversionService.convert(record, Account.class);
        final Account created = createAccountPort.createAccount(account);
        final AccountRecord toReturn = conversionService.convert(created, AccountRecord.class);
        return ResponseEntity.created(URI.create("http://localhost:8080/account/" + created.getId())).body(toReturn);
    }
}
