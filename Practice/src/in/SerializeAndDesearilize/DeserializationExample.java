package in.SerializeAndDesearilize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) {
		
		try {
		FileInputStream fis = new FileInputStream("ob.text");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student student = (Student)ois.readObject();
		
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		System.out.println(student.getEmail());
		System.out.println(student.getAge());
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
