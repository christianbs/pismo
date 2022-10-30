package br.com.pismo.framework.operationtype.outbound.entity;

import br.com.pismo.application.operationtype.core.OperationTypeDescription;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "operation_type")
public class OperationTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private OperationTypeDescription description;

}
