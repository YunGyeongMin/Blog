package kr.gudi.app.web.mylist;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/myList")
public class MyListController {
	
	@Autowired private MyListService myListService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String myList() {return "myList";}
	
	@RequestMapping(value = "/{num}", method = RequestMethod.GET)
	public String myList(HttpSession session, @PathVariable("num") int num) {return "myList";}
	
	@RequestMapping(value = "/page", method = RequestMethod.POST)
	public String page(HttpSession session, Model model) {
		model.addAttribute("result", myListService.getMessage(session));
		return "page/myList";
	}
	
}
