package kr.gudi.app.web.mylist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.gudi.app.web.login.LoginDao;
import kr.gudi.app.web.login.UserBean;

@Service
public class MyListServiceImp implements MyListService {

	@Autowired private MyListDao mylistDao;
	@Autowired private LoginDao loginDao;

	@Override
	public UserBean getUser(int num) {
		UserBean ub = new UserBean();
		ub.setNum(num);
		return loginDao.getUser(ub);
	}
	
}
