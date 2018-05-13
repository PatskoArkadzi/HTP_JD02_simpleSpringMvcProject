package by.htp.springmvc.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.htp.springmvc.domain.User;

@Controller
@RequestMapping(value = "/main")
public class MainServlet {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void common(ModelMap model) {
		System.out.println("common");
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public void user(ModelMap model) {
		System.out.println("user");
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public void admin(ModelMap model) {
		System.out.println("admin");
	}
}
