package kr.gudi.app.web.myedit;

import java.util.List;
import java.util.Map;

public interface MyEditService {
	
	public List<InterestsBean> getInterests(Map<String, Object> paramMap);
	public boolean setInterests(Map<String, Object> paramMap);	

}
