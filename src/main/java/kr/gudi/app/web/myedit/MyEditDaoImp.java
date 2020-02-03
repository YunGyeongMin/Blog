package kr.gudi.app.web.myedit;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyEditDaoImp implements MyEditDao {
	
	@Autowired private SqlSession session;

	@Override
	public List<InterestsBean> getInterests(Map<String, Object> paramMap) {
		return session.selectList("user.getInterests", paramMap);
	}

	@Override
	public int setInterests(Map<String, Object> paramMap) {
		return session.insert("user.setInterests", paramMap);
	}

	@Override
	public int resetInterests(Map<String, Object> paramMap) {
		return session.delete("user.resetInterests", paramMap);
	}
	
}
