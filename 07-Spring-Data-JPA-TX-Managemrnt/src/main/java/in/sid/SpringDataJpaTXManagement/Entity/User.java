package in.sid.SpringDataJpaTXManagement.Entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="USER_TBL")
public class User {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="USER-ID")
	private Integer userId;
	
	@Column(name="USER-NAME")
	private String name;
	
	@Column(name="USER-EMAIL")
	private String eMail;
	
	@Column(name="USER-IMAGE")
	@Lob
	private byte[] userImg;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public byte[] getUserImg() {
		return userImg;
	}

	public void setUserImg(byte[] userImg) {
		this.userImg = userImg;
	}

	public User() {
		super();
		
	}

	public User(Integer userId, String name, String eMail, byte[] userImg) {
		super();
		this.userId = userId;
		this.name = name;
		this.eMail = eMail;
		this.userImg = userImg;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", eMail=" + eMail + ", userImg="
				+ Arrays.toString(userImg) + "]";
	}
	
	


		
}
