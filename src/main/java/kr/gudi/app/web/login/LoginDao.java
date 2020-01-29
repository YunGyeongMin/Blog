package kr.gudi.app.web.login;

import java.util.List;

public interface LoginDao {
	
	public UserBean getUser(UserBean ub);
	public List<UserBean> getUserList(UserBean ub);	

}
