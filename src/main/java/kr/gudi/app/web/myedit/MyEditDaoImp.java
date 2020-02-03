package kr.gudi.app.web.myedit;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyEditDaoImp implements MyEditDao {
	
	@Autowired private SqlSession session;

	@Override
	public List<InterestsBean> getInterests() {
		return session.selectList("user.getInterests");
	}

	
	
}
