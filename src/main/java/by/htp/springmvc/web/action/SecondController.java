package by.htp.springmvc.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/second")
public class SecondController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void common(ModelMap model) {
		System.out.println("Second common");
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public void user(ModelMap model) {
		System.out.println("Second user");
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public void admin(ModelMap model) {
		System.out.println("Second admin");
	}
}
