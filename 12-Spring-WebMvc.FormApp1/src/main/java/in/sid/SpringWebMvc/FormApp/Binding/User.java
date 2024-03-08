package in.sid.SpringWebMvc.FormApp.Binding;


public class User {

//	@NotEmpty(message="User Name is Required")
//	//@Size(min = 3, max = 8, message="User Name Should be 3 to 8 charactor")
	private String userName;
	
	//@NotEmpty(message="password is required..")
	private String pwd;
	
	//@NotEmpty(message="Email is required..")
	//@Email(message="Enter valid Email id")
	private String email;
	
	//@NotEmpty(message="phno is required..")
	//@Size(min = 10, message="phno atleast 10 digit")
	private String phno;
	
	//@NotNull(message="Age is Required")
	//@Min(value=21,message="Age Should be Minimum 21 years old")
	//@Max(value=60,message="Age Shouldent cross 60 years")
	private Integer age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
		return "User [userName=" + userName + ", pwd=" + pwd + ", email=" + email + ", phno=" + phno + ", age=" + age
				+ "]";
	}
	
}
