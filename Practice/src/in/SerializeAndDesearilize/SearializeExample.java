package in.SerializeAndDesearilize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SearializeExample {

	public static void main(String[] args) {

		Student student = new Student("Siddharth", "siddharth@gmail.com", 31, "Pune");

		try{
		
			FileOutputStream fos = new FileOutputStream("ob.text");

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(student);
			
			oos.close();
			fos.close();
			
			System.out.println("Object State to Transfer File...");
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}

}
