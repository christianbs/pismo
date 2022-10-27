package br.com.pismo.framework.account.inbound.record;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotNull;

public record AccountRecord(
        @CPF
        @NotNull
        String document
) {
}
