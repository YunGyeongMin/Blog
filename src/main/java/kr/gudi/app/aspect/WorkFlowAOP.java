package kr.gudi.app.aspect;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import kr.gudi.app.web.login.UserBean;
import kr.gudi.app.web.mylist.MyListService;

@Aspect
public class WorkFlowAOP {
	
	@Autowired private MyListService myListService;
	
	@Pointcut("execution(* kr.gudi.app.web.index.IndexController.index(..))")
	public void index() {}
	
	@Pointcut("execution(* kr.gudi.app.web.login.LoginController.login(..))")
	public void login() {}
	
	@Pointcut("execution(* kr.gudi.app.web.message.MessageController.message(..))")
	public void message() {}
	
	@Pointcut("execution(* kr.gudi.app.web.myedit.MyEditController.myEdit(..))")
	public void myEdit() {}
	
	@Pointcut("execution(* kr.gudi.app.web.mylist.MyListController.myList(..))")
	public void myList() {}
	
	@Pointcut("execution(* kr.gudi.app.web.profile.ProfileController.profile(..))")
	public void profile() {}
	
	@Pointcut("execution(* kr.gudi.app.web.signup.SignupController.signup(..))")
	public void signup() {}
	
	@Around("index() || login() || message() || profile() || signup()")
	public Object s(ProceedingJoinPoint jp) throws Throwable {
		setPage(jp);
		return jp.proceed();
	}
	
	@Around("myList() || myEdit()")
	public Object target(ProceedingJoinPoint jp) throws Throwable {
		setPage(jp);
		Object[] args = jp.getArgs();
		if(args.length > 1) {
			HttpSession session = null;
			Object obj1 = args[0];
			Object obj2 = args[1];
			int num = 0;
			if(obj1 instanceof HttpSession) {session = (HttpSession) obj1;}
			if(obj2 instanceof Integer) {num = Integer.parseInt(obj2.toString());} 
			else if (obj2 instanceof UserDetails) {
				UserDetails userDetails = (UserDetails) obj2;
				num = Integer.parseInt(userDetails.getUsername());
			}
			if(session != null) {session.setAttribute("target", myListService.getUser(num));}
		}
		return jp.proceed();
	}
	
	private void setPage(ProceedingJoinPoint jp) {
		String target = jp.getSignature().toShortString();
		System.out.println(target);
		String name = target.substring(target.indexOf(".") + 1, target.indexOf("("));
		Object[] args = jp.getArgs();
		if(args.length > 0) {
			Object obj = args[0];
			if(obj instanceof HttpSession) {
				System.out.println("데이터 담기 : " + name);
				HttpSession session = (HttpSession) obj;
				session.setAttribute("page", name);
			}
		}
	}
	
}
