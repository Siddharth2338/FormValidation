package in.sid.SpringDataJpaTimeStamping;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PRODUCT_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@GeneratedValue
	@Id
	@Column(name="PRODUCT_ID")
	private Integer productID;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="PRODUCT_PRICE")
	private Integer productPrice;
	
	@CreationTimestamp
	@Column(name="CREATED_DATE",updatable=false)
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name="UPDATED_DATE",insertable=false)
	private LocalDateTime updatedDate;
	
	
	
}
