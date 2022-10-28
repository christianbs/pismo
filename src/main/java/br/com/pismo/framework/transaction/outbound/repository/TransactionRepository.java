package br.com.pismo.framework.transaction.outbound.repository;

import br.com.pismo.framework.transaction.outbound.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer> {

}
