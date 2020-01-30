package kr.gudi.app.web.message;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDaoImp implements MessageDao {

	@Autowired private SqlSession session;
	
	@Override
	public int setMessage(MessageBean mb) {
		return session.insert("user.setMessage", mb);
	}
	
}
