package in.sid.SpringDataJpaCompositKey.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="BANK_ACCOUNT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	

	@Id	
	@Column(name="ACCOUNT_NUMBER")
	private Integer accNo;
	
	@Column(name="ACCOUNT_ID")
	private Integer accId;
	
	@Column(name="ACCOUNT_TYPE")
	private String accType;
	
	@Column(name="ACCOUNT_NAME")
	private String branchName;
	
}
