package in.sid.SpringDataJpaCompositKey.Service;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class AccountPK implements Serializable {
	
	private Integer accId;
	private String accType;
	private String holderName;

}
