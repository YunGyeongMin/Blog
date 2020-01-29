package kr.gudi.app.web.mylist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/myList")
public class MyListController {
	
	@Autowired private MyListService mylistService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String myList() {return "myList";}
	
	@RequestMapping(value = "/{num}", method = RequestMethod.GET)
	public String myList(@PathVariable("num") int num) {
		System.out.println(num);
		return "myList";
	}
	
}
