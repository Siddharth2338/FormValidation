package in.sid.SpringDataJpaCompositKey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sid.SpringDataJpaCompositKey.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
