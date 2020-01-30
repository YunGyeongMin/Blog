package kr.gudi.app.web.profile;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	
	@Autowired private ProfileService profileService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String profile() {return "redirect:/";}
	
	@RequestMapping(value = "/{num}", method = RequestMethod.GET)
	public String profile(HttpSession session, @PathVariable("num") int num) {return "profile";}
	
}
