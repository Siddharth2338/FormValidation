package in.sid.SpringWebMVC3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import in.sid.SpringWebMVC.Data.Book;


@Controller
public class BookController {
	
	@GetMapping("/book")
	public String getBookData(Model model) {
		
		Book bkBook = new Book(101, "Spring Framework", 460.00);
		
		model.addAttribute("book",bkBook);
		
		return "book";
		
	}

}
