package kr.gudi.app.web.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.gudi.app.web.login.UserBean;

@Controller
@RequestMapping("/signup")
public class SignupController {
	
	@Autowired private SignupService signupService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String signup() {return "signup";}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String signup(UserBean ub) {
		System.out.println(ub);
		signupService.setUser(ub);
		return "redirect:/login";
	}
	
}
