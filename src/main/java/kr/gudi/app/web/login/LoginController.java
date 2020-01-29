package kr.gudi.app.web.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired private LoginService loginService;
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {return "login";}
	
	@RequestMapping(value = "security/success", method = RequestMethod.POST)
	public String success(HttpSession session, @AuthenticationPrincipal UserDetails userDetails, UserBean ub) {
		ub.setNum(Integer.parseInt(userDetails.getUsername()));
		session.setAttribute("UserInfo", loginService.getUser(ub));
		return "redirect:/";
	}
	
	@RequestMapping(value = "security/error", method = RequestMethod.POST)
	public String error() {return "redirect:/login";}
	
}
