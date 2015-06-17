package keecoin.dao;

import java.util.List;

import keecoin.pojo.User;

public interface IUserDao {

	void save(User user);

	User LoginUser(String userName, String password);

	List<User> query(User user);

}
