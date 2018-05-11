package by.htp.springmvc.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.htp.springmvc.dao.UserDao;
import by.htp.springmvc.dao.impl.UserDaoHibernateImpl;
import by.htp.springmvc.domain.Role;
import by.htp.springmvc.domain.User;

@Controller
public class DefaultActionController {

	@RequestMapping(value = "/sign-in", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Введите логин и пароль");
		return "sign-in";
	}

	@RequestMapping(value = "/helloUser", method = RequestMethod.POST)
	public String signIn(@ModelAttribute("SpringWeb") User user, ModelMap model) {
		UserDao userDao = new UserDaoHibernateImpl();
		Role role = userDao.defineUserRole(user.getLogin(), user.getPassword());
		model.addAttribute("role", role);

		return "result";
	}
}
