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
		System.out.println(ub);
		
		int a = session.insert("user.setUser", ub);
		System.out.println(a);
		System.out.println(ub);
		
		int b = session.insert("user.setAuth", ub);
		System.out.println(b);
		System.out.println(ub);
		
		return true;
	}
	
}
