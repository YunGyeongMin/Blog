package kr.gudi.app.web.login;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImp implements LoginDao {
	
	@Autowired
	SqlSession session;

	@Override
	public UserBean getUser(UserBean ub) {
		return session.selectOne("user.getUser", ub);
	}

	@Override
	public List<UserBean> getUserList(UserBean ub) {
		return session.selectList("user.getUser", ub);
	}
	
}
