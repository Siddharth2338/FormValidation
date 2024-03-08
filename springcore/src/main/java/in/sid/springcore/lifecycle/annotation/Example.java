package in.sid.springcore.lifecycle.annotation;

public class Example 
{
	private String subject;

//	public String getSubject() {
//		return subject;
//	}
//
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
	
	
	
	public String getSubject()
	{
		return subject;
	}
	public void setSubject(String subject)
	{
		this.subject=subject;
	}
//	public Example() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	
	
	public Example()
	{
		super();
	}
	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
//	@postConstruct
//	public void init()
//	{
//		System.out.println("in it method");
//	}
//	public void destroy("destroy method");
//	{
//		
//	}
//	
	
//	public String toString()
//	{
//		return subject+"["+this.subject+"]";
//	}
}
