package kr.gudi.app.web.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/signup")
public class SignupController {
	
	@Autowired private SignupService signupService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String login() {return "signup";}
	
}
