package kr.gudi.app.web.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.gudi.app.web.login.UserBean;

@Service
public class SignupServiceImp implements SignupService {

	@Autowired private SignupDao signupDao;

	@Override
	public boolean setUser(UserBean ub) {
		System.out.println(ub);
		return signupDao.setUser(ub);
	}
	
}
