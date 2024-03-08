package in.sid.SpringDataJpaTXManagement.Service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sid.SpringDataJpaTXManagement.Entity.User;
import in.sid.SpringDataJpaTXManagement.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public void addUser() throws Exception
	{
		String imgPath="C:\\Users\\shree\\Pictures\\Camera Roll\\house.jpg.jpg";
		User u1 = new User();
		u1.setName("Pranav");
		u1.seteMail("pranav@gmail.com");
		
		long size = Files.size(Paths.get(imgPath));
		
		byte[] arr = new byte[(int) size];
		FileInputStream fis = new FileInputStream(new File(imgPath));
		fis.read(arr);
		fis.close();
		u1.setUserImg(arr);
		userRepo.save(u1);
		
	}
	
	
}
