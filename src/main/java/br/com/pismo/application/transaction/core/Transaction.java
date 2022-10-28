package br.com.pismo.application.transaction.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@AllArgsConstructor
public class Transaction {

    private int id;

    private int accountId;

    private int operationTypeId;

    private BigDecimal amount;

    private Instant eventDate;

    void create() {
        eventDate = Instant.now();
    }

}
