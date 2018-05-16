package by.htp.springmvc.web.action;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import by.htp.springmvc.dao.UserDao;
import by.htp.springmvc.dao.impl.UserDaoHibernateImpl;
import by.htp.springmvc.domain.User;

@Controller
@RequestMapping(value = "/main")
public class MainServlet {

	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public ModelAndView newUser(ModelMap model) {
		return new ModelAndView("registrPage", "command", new User());
	}

	@RequestMapping(value = "/checkPass", method = RequestMethod.GET)
	public @ResponseBody String checkPassword(@RequestParam String password) {
		return "Good Password";
	}

	@RequestMapping(value = "/checkLog", method = RequestMethod.GET)
	public @ResponseBody String checkLog(@RequestParam String jsonLogin) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(jsonLogin);
		String login = (String) obj.get("login");
		UserDao userDao = new UserDaoHibernateImpl();
		if (userDao.read(login) != null) {
			return "Bad Login";
		} else {
			return "Good Login";
		}
	}

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
