package in.sid.springcore.practice;

import java.util.List;

//import in.sid.springcore.autowire.Address;

public class Student 
{
	private String name;
	private int id;
	private List<String> subject;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", subject=" + subject + ", address=" + address+"]";
	}
	
	
}
