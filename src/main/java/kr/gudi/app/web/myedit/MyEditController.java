package kr.gudi.app.web.myedit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/myEdit")
public class MyEditController {
	
	@Autowired private MyEditService myeditService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String myEdit(HttpSession session, @AuthenticationPrincipal UserDetails userDetails) {return "myEdit";}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public @ResponseBody List<InterestsBean> getInterests(@RequestParam Map<String, Object> paramMap){
		System.out.println(paramMap);
		return myeditService.getInterests(paramMap);
//		return new ArrayList<InterestsBean>();
	}
	
	@RequestMapping(value="", method=RequestMethod.PUT)
	public @ResponseBody Map<String, Object> setInterests(@RequestBody Map<String, Object> paramMap){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", myeditService.setInterests(paramMap));
		return resultMap;
	}
	
}
