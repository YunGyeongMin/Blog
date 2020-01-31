package kr.gudi.app.web.mylist;

import java.util.List;

import javax.servlet.http.HttpSession;

import kr.gudi.app.web.login.UserBean;
import kr.gudi.app.web.message.MessageBean;

public interface MyListService {
	
	public UserBean getUser(int num);
	public List<MessageBean> getMessage(HttpSession session);

}
