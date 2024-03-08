package in.sid.SpringWebMvcValidation.Binding;

import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class User {
	
	@NotEmpty(message="mandatory")
	private String uname;
	
	@NotEmpty(message="Password Can not be Null..")
	private String pwd;
	
	@NotEmpty(message="Email Can not be Null..")
	@Email(message="please provede valid email")
	private String email;
	
	@NotEmpty(message="Phone No is Mandatory")
	@Min(message="Phone Number have atleast 10 digit", value = 10)
	private String phno;
	
	@NotNull(message="Age is mandatory")
	@Min(message="Should be more than 21 years old", value=21)
	@Max(message="should not be more than 60 years old", value=60)
	private Integer age;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", pwd=" + pwd + ", email=" + email + ", phno=" + phno + ", age=" + age + "]";
	}

	
}
