package in.sid.SpringWebMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to Brainworks..!!!");
		mav.setViewName("index");
		return mav;
	}

}
