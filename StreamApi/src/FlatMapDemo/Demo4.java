package FlatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	String sname;
	int sid;
	char grade;
	
	public Student(String sname,int sid,char grade)
	{
		this.sname=sname;
		this.sid=sid;
		this.grade=grade;
	}
}

public class Demo4 {

	public static void main(String[] args) {
	
		List<Student>studentList1=new ArrayList<Student>();
		studentList1.add(new Student("siddharth",101,'a'));
		studentList1.add(new Student("manmath",102,'b'));
		studentList1.add(new Student("ramesh",103,'c'));
		
		List<Student>studentList2=new ArrayList<Student>();
		studentList2.add(new Student("sudhir",104,'a'));
		studentList2.add(new Student("mukesh",105,'b'));
		studentList2.add(new Student("pawan",106,'c'));
		
		List<List<Student>>studentList=Arrays.asList(studentList1,studentList2);
//		
//		for(List<Student>stdname:studentList)
//		{
//			for(Student stdnames:stdname)
//			{
//				System.out.println(stdnames.sname);
//			}
//		}
		
		List<String> namelist=studentList.stream().flatMap(stud->stud.stream()).map(s->s.sname).collect(Collectors.toList());
		System.out.println(namelist);
	}

}
