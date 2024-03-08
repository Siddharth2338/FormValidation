package in.SerializeAndDesearilize;

import java.io.Serializable;

public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private Integer age;
	private String address;
	public Student(String name, String email, Integer age, String address) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	protected Integer getAge() {
		return age;
	}
	protected void setAge(Integer age) {
		this.age = age;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	
	

}
