package kr.gudi.app.web.index;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.gudi.app.web.login.LoginService;
import kr.gudi.app.web.login.UserBean;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired private IndexService indexService;
	@Autowired private LoginService loginService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(HttpSession session) {
		session.setAttribute("page", "");
		return "index";
	}
	
	@RequestMapping(value = "page", method = RequestMethod.POST)
	public String page(Model model) {
		List<UserBean> list = loginService.getUserList(new UserBean());
		model.addAttribute("result", list);
		return "page/index";
	}
	
}
