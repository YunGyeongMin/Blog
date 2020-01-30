package kr.gudi.app.web.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

	@RequestMapping("/head")
	public String head() {return "page/head";}
	
	@RequestMapping("/footer")
	public String footer() {return "page/footer";}
	
}
