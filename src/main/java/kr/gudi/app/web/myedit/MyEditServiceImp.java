package kr.gudi.app.web.myedit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.json.JSONArray;

@Service
public class MyEditServiceImp implements MyEditService {

	@Autowired private MyEditDao myeditDao;

	@Override
	public List<InterestsBean> getInterests(Map<String, Object> paramMap) {
		return myeditDao.getInterests(paramMap);
	}

	@Override
	public boolean setInterests(Map<String, Object> paramMap) {
		Object obj = paramMap.get("Interests");
		JSONArray ja = JSONArray.fromObject(obj);
		int cnt = 0;
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("u_num", paramMap.get("num"));
		myeditDao.resetInterests(params);
		
		for(int i = 0; i < ja.size(); i++) {
			params.put("v_num", ja.get(i));
			cnt += myeditDao.setInterests(params);
		}
		if(cnt == ja.size()) {
			return true;
		}
		return false;
	}
	
}
