package kr.gudi.app.web.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/message")
public class MessageController {
	
	@Autowired private MessageService messageService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String login() {return "message";}
	
}
