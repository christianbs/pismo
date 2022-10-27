package br.com.pismo.framework.account.outbound.repository;

import br.com.pismo.framework.account.outbound.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
}
