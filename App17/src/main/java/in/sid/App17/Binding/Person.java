package in.sid.App17.Binding;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement

public class Person {
	
	private Integer id;
	private String name;
	private String phno;
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Person [id=" + id + ", name=" + name + ", phno=" + phno + ", age=" + age + "]";
	}
	
	

}
