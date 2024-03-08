package in.sid.SpringDataJpaCompositKey.Service;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import in.sid.SpringDataJpaCompositKey.Entity.Account;
import in.sid.SpringDataJpaCompositKey.Repository.AccountRepository;

@Service
public class AccountService {
	
	private AccountRepository accRepo;
	
	public AccountService(AccountRepository accRepo)
	{
		this.accRepo=accRepo;
	}
	
	public void getDataUsingPK()
	{
		
		  AccountPK pk = new AccountPK();
		  pk.setAccId(101); 
		  pk.setAccType("Currunt");
		  pk.setHolderName("IBM");
		 
//		  AccountPK pk1 = new AccountPK();
//		  pk1.setAccId(102); 
//		  pk1.setAccType("Saving");
//		  pk1.setHolderName("IBM");
		  //accRepo.saveAll(pk1);
		  
		Optional<Account> findById = ((CrudRepository<Account, AccountPK>) accRepo).findById(pk);
		if(findById.isPresent())
		{
			System.out.println(findById.get());
		}
	}
	
	public void saveAllData()
	{
		AccountPK pk = new AccountPK();
		pk.setAccId(105);
		pk.setAccType("Currunt");
		pk.setHolderName("Ibm");
		
		Account acc = new Account();
		acc.setBranchName("Ambegaon");
		acc.setMinBal(10000.00);
		
		acc.setAccPk(pk);
		((CrudRepository<Account, AccountPK>) accRepo).save(acc);
		
		
	}

}
