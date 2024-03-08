package in.sid.SpringWebMVC2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/")
	public ModelAndView homePage()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to BrainWorks...!!");
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/welcome")
	public ModelAndView getWelcmMsg()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to BrainWorks...!!");
		mav.setViewName("index3");
		return mav;
	}
	
	@GetMapping("/ap3")
	@ResponseBody
	public String approch3()
	{
		String ap ="Approch 3";
		return ap;
	}

}
