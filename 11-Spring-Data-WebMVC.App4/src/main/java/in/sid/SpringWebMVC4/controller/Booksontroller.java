package in.sid.SpringWebMVC4.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.sid.SpringWebMVC4.Binding.Books;

@Controller
public class Booksontroller {

	@GetMapping("/books")
	public String getBooksData(Model model) {
		
		Books bks1 = new Books(102,"Java",500.00);
		Books bks2 = new Books(102,"Java",500.00);
		Books bks3 = new Books(102,"Java",500.00);
		Books bks4 = new Books(102,"Java",500.00);
		
		List<Books> allbooks = Arrays.asList(bks1,bks2,bks3,bks4);
		model.addAttribute("books",allbooks);
		return "books";
		
		
	}
	
}
