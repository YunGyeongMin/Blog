package kr.gudi.app.web.mylist;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.gudi.app.web.login.LoginDao;
import kr.gudi.app.web.login.UserBean;
import kr.gudi.app.web.message.MessageBean;

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

	@Override
	public List<MessageBean> getMessage(HttpSession session) {
		Object obj = session.getAttribute("target");
		if(obj != null) {
			UserBean ub = (UserBean) obj;
			return mylistDao.getMessage(ub);
		}
		return new ArrayList<MessageBean>();
	}
	
}
