package kr.gudi.app.web.message;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/message")
public class MessageController {
	
	@Autowired private MessageService messageService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String message(HttpSession session) {return "redirect:/";}
	
	@RequestMapping(value = "/{num}", method = RequestMethod.GET)
	public String message(HttpSession session, @PathVariable("num") int num) {return "message";}
	
}
