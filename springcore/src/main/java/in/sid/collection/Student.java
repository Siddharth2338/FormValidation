package in.sid.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student 
{
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) 
	{
		this.courses = courses;
	}
	
	
	public Student(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	
	public Student() {
		super();
		
	}
	/*@Override
	public String toString() {
		return "Student [\nname=" + name + ", \nphones=" + phones + ", \naddresses=" + addresses + ", \ncourses=" + courses
				+ "]";
	}*/
	
	
}
