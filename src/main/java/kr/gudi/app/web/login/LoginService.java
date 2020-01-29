package kr.gudi.app.web.login;

import java.util.List;

public interface LoginService {
	
	public UserBean getUser(UserBean ub);
	public List<UserBean> getUserList(UserBean ub);	

}
