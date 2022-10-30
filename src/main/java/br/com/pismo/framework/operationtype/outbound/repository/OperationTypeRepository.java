package br.com.pismo.framework.operationtype.outbound.repository;

import br.com.pismo.framework.operationtype.outbound.entity.OperationTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationTypeRepository extends JpaRepository<OperationTypeEntity, Integer> {

}
