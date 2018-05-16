package by.htp.springmvc.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.htp.springmvc.dao.UserDao;
import by.htp.springmvc.dao.impl.UserDaoHibernateImpl;
import by.htp.springmvc.domain.Role;
import by.htp.springmvc.domain.User;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	// public ModelAndView common(ModelMap model) {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView common() {
		return new ModelAndView("loginPage", "user", new User());
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public ModelAndView checkUser(@ModelAttribute("user") User user) {
		UserDao userDao = new UserDaoHibernateImpl();
		Role role = userDao.defineUserRole(user.getLogin(), user.getPassword());

		ModelAndView mav = new ModelAndView();
		mav.addObject("role", role);
		mav.addObject("user", user);
		mav.setViewName("hello");
		return mav;
	}

}
