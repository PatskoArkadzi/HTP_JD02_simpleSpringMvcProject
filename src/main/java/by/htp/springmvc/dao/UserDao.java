package by.htp.springmvc.dao;

import by.htp.springmvc.domain.Role;
import by.htp.springmvc.domain.User;

public interface UserDao extends BaseDao<User> {
	public Role defineUserRole(String login, String password);

	User read(String login);
}
