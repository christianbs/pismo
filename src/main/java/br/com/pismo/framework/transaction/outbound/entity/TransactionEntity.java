package br.com.pismo.framework.transaction.outbound.entity;

import br.com.pismo.framework.account.outbound.entity.AccountEntity;
import br.com.pismo.framework.operationtype.outbound.entity.OperationTypeEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "transaction")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private AccountEntity account;

    @ManyToOne
    @JoinColumn(name = "operation_type_id")
    private OperationTypeEntity operationType;

    private BigDecimal amount;

    private Instant eventDate;

}
