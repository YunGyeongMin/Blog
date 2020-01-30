package kr.gudi.app.web.signup;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.gudi.app.web.login.UserBean;

@Repository
public class SignupDaoImp implements SignupDao {

	@Autowired
	SqlSession session;
	
	@Override
	public boolean setUser(UserBean ub) {
		int a = session.insert("user.setUser", ub);
		int b = session.insert("user.setAuth", ub);
		return true;
	}
	
}
