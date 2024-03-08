package in.sid.json.AppJavaToJason.Convert;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.sid.json.AppJavaToJason.binding.Author;
import in.sid.json.AppJavaToJason.binding.Book;

public class Convert {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Author author = new Author();
		author.setAuthorName("Tukaram");
		author.setEmail("tukaram@pandhari.com");
		author.setAuthorphno(4536687);
		Book book = new Book();
		book.setId(101);
		book.setName("Pothi");
		book.setPrice(550.00);
		book.setAuthor(author);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("book.json"), book);
		System.out.println("Conversion Completed....");
	}

}
