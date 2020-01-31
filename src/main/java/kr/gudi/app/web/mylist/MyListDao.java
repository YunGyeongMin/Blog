package kr.gudi.app.web.mylist;

import java.util.List;

import kr.gudi.app.web.login.UserBean;
import kr.gudi.app.web.message.MessageBean;

public interface MyListDao {
	
	public List<MessageBean> getMessage(UserBean ub);

}
