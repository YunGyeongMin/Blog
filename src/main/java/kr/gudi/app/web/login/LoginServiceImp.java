package kr.gudi.app.web.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

	@Autowired private LoginDao loginDao;

	@Override
	public UserBean getUser(UserBean ub) {
		return loginDao.getUser(ub);
	}

	@Override
	public List<UserBean> getUserList(UserBean ub) {
		return loginDao.getUserList(ub);
	}
	
}
