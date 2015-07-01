package keecoin.web;

import javax.annotation.Resource;

import keecoin.base.BaseAction;
import keecoin.pojo.User;
import keecoin.service.UserManager;

public class LoginAction extends BaseAction{
	@Resource
	private UserManager userManager;
	private User user;

	@Override
	public String execute() throws Exception {
		if(userManager.login(user) != null){
			return SUCCESS;
		}
		return INPUT;
	}
	
	public String addUser(){
		User newUser = userManager.save(user);
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
}
