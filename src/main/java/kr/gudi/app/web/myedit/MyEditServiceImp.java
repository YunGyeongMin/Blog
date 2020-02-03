package kr.gudi.app.web.myedit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyEditServiceImp implements MyEditService {

	@Autowired private MyEditDao myeditDao;

	@Override
	public List<InterestsBean> getInterests() {
		return myeditDao.getInterests();
	}
	
}
