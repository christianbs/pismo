package br.com.pismo.framework.transaction.inbound.record;

import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.Instant;

public record TransactionRecord(
        @Positive
        int accountId,
        @Positive
        int operationTypeId,
        @Positive
        BigDecimal amount,

        Instant eventDate
) {
}
