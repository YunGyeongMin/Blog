package kr.gudi.app.web.signup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.gudi.app.web.login.UserBean;

@Controller
@RequestMapping("/signup")
public class SignupController {
	
	@Autowired private SignupService signupService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String signup() {return "signup";}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String signup(HttpServletRequest req) {
		UserBean ub = new UserBean();
		
		ub.setId(req.getParameter("id"));
		ub.setPassword(req.getParameter("password"));
		ub.setName(req.getParameter("name"));
		ub.setEmail(req.getParameter("email"));
		ub.setPhone(req.getParameter("phone"));
		
		System.out.println(ub);
		signupService.setUser(ub);
		return "redirect:/login";
	}
	
}
