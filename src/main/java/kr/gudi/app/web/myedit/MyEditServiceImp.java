package kr.gudi.app.web.myedit;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.gudi.app.web.login.UserBean;
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
		
		int state = myeditDao.upUser(paramMap);
		
		if(state > 0) {
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
		}
		
		return false;
	}

	@Override
	public boolean upImage(MultipartFile file, HttpSession session) {
		
		Object obj = session.getAttribute("target");
		if(obj != null) {
			UserBean ub = (UserBean) obj;
			String filePath = "res/upload/" + ub.getNum() + "/" + file.getOriginalFilename();
			ub.setImg("/"+filePath);
			String path = session.getServletContext().getRealPath(filePath);
			System.out.println(path);
			try {
				FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
				myeditDao.upImage(ub);
				return true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}
	
}
