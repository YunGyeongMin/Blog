package kr.gudi.app.web.message;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.gudi.app.web.login.UserBean;

@Controller
@RequestMapping("/message")
public class MessageController {
	
	@Autowired private MessageService messageService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String message(HttpSession session) {return "redirect:/";}
	
	@RequestMapping(value = "/{num}", method = RequestMethod.GET)
	public String message(HttpSession session, @PathVariable("num") int num) {return "message";}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> setMessage(@RequestBody MessageBean mb, 
			@AuthenticationPrincipal UserDetails userDetails, HttpSession session) {
		mb.setRegUser(Integer.parseInt(userDetails.getUsername()));
		Object obj = session.getAttribute("target");
		if(obj != null) {
			UserBean target = (UserBean) obj;
			mb.setTargetUser(target.getNum());
		}
		return messageService.setMessage(mb);
	}
	
}
