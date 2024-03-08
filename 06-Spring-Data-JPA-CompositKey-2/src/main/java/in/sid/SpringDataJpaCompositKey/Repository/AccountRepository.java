package in.sid.SpringDataJpaCompositKey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sid.SpringDataJpaCompositKey.Entity.Account;
import in.sid.SpringDataJpaCompositKey.Service.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK>{

}
