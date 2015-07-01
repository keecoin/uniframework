package keecoin.service;

import java.util.List;

import javax.annotation.Resource;

import keecoin.dao.IUserDao;
import keecoin.pojo.User;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserManager {
	
	@Resource
	private IUserDao userDao;

	public User login(User user){
		if(user==null) return null;
		return userDao.LoginUser(user.getUserName(), user.getPassword());
	}
	
	public User save(User user){
		userDao.save(user);
		return user;
	}
	
	public List<User> query(User user){
		return userDao.query(user);
	}

}
