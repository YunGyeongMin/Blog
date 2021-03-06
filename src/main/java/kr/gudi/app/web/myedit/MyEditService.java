package kr.gudi.app.web.myedit;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

public interface MyEditService {
	
	public List<InterestsBean> getInterests(Map<String, Object> paramMap);
	public boolean setInterests(Map<String, Object> paramMap);
	public boolean upImage(MultipartFile file, HttpSession session);

}
