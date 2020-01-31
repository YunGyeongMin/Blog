package kr.gudi.app.web.mylist;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.gudi.app.web.login.UserBean;
import kr.gudi.app.web.message.MessageBean;

@Repository
public class MyListDaoImp implements MyListDao {

	@Autowired private SqlSession session;
	
	@Override
	public List<MessageBean> getMessage(UserBean ub) {
		return session.selectList("user.getMessage", ub);
	}
	
}
