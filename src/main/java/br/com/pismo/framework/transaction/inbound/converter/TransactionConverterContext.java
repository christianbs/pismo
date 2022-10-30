package br.com.pismo.framework.transaction.inbound.converter;

import br.com.pismo.application.account.core.Account;
import br.com.pismo.application.operationtype.core.OperationType;
import br.com.pismo.framework.transaction.inbound.record.TransactionRecord;

public record TransactionConverterContext(
        Account account,
        OperationType operationType,
        TransactionRecord transactionRecord
) {
}
