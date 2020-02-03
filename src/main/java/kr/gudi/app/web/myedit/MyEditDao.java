package kr.gudi.app.web.myedit;

import java.util.List;
import java.util.Map;

public interface MyEditDao {
	
	public List<InterestsBean> getInterests(Map<String, Object> paramMap);
	public int setInterests(Map<String, Object> paramMap);
	public int resetInterests(Map<String, Object> paramMap);
	public int upUser(Map<String, Object> paramMap);
	
}
