package kr.gudi.app.web.message;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImp implements MessageService {

	@Autowired private MessageDao messageDao;

	@Override
	public Map<String, Object> setMessage(MessageBean mb) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", messageDao.setMessage(mb));
		return resultMap;
	}
	
}
