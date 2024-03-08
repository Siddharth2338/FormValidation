package in.sid.SpringDataJpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
	
	public List<User> findByCountry(String cname);
	
	public List<User> findByAge(Integer age);
	
	public List<User> findByAgeGreaterThanEqual(Integer age);
	
	@Query(value="From User")
	public List<User> getAllUserHql();
	
	@Query(value="select * from USER_MASTER",nativeQuery=true)
	public List<User> getAllUserSql();
	
	@Query(value="From User where country=:cname")
	public List<User> getAllUserByCountryHql(String cname);
	
	@Query(value="From User where country=:cname and age=:age")
	public List<User> getAllUserByCountrySql(String cname,Integer age);

}
