package mvcproject.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeController {
	@RequestMapping("/display")
	public ModelAndView getPage() {
ModelAndView m=new ModelAndView();
m.setViewName("welcome");
 return m;
}
}