package keecoin.dao;

import java.util.List;

import keecoin.pojo.User;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
public class UserDao extends HibernateDaoSupport implements IUserDao{
	
	@Override
	public void save(User user){
		this.getHibernateTemplate().save(user);
	}
	
	public void delete(User user){
		this.getHibernateTemplate().delete(user);
	}
	
	public void modify(User user){
		this.getHibernateTemplate().update(user);
	}
	
	@Override
	public List<User> query(User user){
		return this.getHibernateTemplate().findByExample(user);
	}
	
	@Override
	public User LoginUser(String userName,String password){
		User user = (User) this.getHibernateTemplate().findByNamedParam( "from User where userName=:name and password=:pass", new String[]{"name","pass"}, new String[]{userName,password}).get(0);
		return user;
	}

}
