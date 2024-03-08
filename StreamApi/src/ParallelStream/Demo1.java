package ParallelStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	String name;
	int score;
	
	public Student(String name,int score) 
	{
		this.name=name;
		this.score=score;
	}

	
	

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}
	
	
}

public class Demo1 {
	
	public static void main(String[] args) {
		
		List<Student> stdlist=Arrays.asList(
											new Student("sid",95),
											new Student("kishor",82),
											new Student("somnath",40),
											new Student("kishor",50),
											new Student("kishor",85),
											new Student("kishor",86));
//		List<Student> stdlist=new ArrayList<Student>();
//		stdlist.add(new Student("sid",95));
//		stdlist.add(new Student("kishor",82));
//		stdlist.add(new Student("somnath",40));
//		stdlist.add(new Student("prasana",50));
//		stdlist.add(new Student("niraj",85));
//		stdlist.add(new Student("sandip",86));
		
		stdlist.stream().filter(s->s.getScore()>=80)
									.limit(3)
									.forEach(stu->System.out.println(stu.getName()+""+stu.getScore()));
		
		// parellel stream
		stdlist.parallelStream().filter(s->s.getScore()>=80)
									.limit(3)
									.forEach(stu->System.out.println(stu.getName()+""+stu.getScore()));

	}

}
