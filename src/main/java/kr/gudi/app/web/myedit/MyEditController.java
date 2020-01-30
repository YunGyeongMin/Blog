package kr.gudi.app.web.myedit;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/myEdit")
public class MyEditController {
	
	@Autowired private MyEditService myeditService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String myEdit(HttpSession session) {
		session.setAttribute("page", "myEdit");
		return "myEdit";
	}
	
}
