package in.sid.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example 
{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("in it method");
	}
	@PreDestroy
	public void destroy()
	{
	System.out.println("destroy method");
		
	}
	
}
