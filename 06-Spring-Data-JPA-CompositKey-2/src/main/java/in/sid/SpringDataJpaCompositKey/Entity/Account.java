package in.sid.SpringDataJpaCompositKey.Entity;

import in.sid.SpringDataJpaCompositKey.Service.AccountPK;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ACCOUNT_MASTER")
public class Account {

	@Column(name="BRANCH_NAME")
	private String branchName;
	
	@Column(name="MIN_BAL")
	private Double minBal;
	
	@EmbeddedId
	private AccountPK accPk;
	

}
