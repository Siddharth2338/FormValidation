package in.sid.SpringWebMVC2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class GreedController {
	
	@GetMapping("/greet")
	public ModelAndView getGreedMsg()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Good Morning....!!");
		mav.setViewName("index1");
		return mav;
		
	}
	@GetMapping("/wish")
	public ModelAndView getWishMsg()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Congratulations....!!");
		mav.setViewName("index2");
		return mav;
		
	}

	

}
