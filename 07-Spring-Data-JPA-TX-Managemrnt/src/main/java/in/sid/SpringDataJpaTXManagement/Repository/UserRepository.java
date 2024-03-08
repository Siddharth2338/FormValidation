package in.sid.SpringDataJpaTXManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sid.SpringDataJpaTXManagement.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
