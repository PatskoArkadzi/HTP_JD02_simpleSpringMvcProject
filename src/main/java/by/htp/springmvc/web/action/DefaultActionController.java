package by.htp.springmvc.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.htp.springmvc.domain.User;

@Controller
public class DefaultActionController {

	@RequestMapping(value = "/sign-in", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Введите логин и пароль");
		return "hello";
	}

	@RequestMapping(value = "hello/user", method = RequestMethod.POST)
	public String signIn(@ModelAttribute("SpringWeb") User user1, ModelMap model) {
		
		model.addAttribute("login", user1.getLogin());
		model.addAttribute("password", user1.getPassword());

		return "result";
	}
}
