package egovframework.fleaMarket.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping(value = "main.do")
	public String main() throws Exception {
		
		return "main/main.tiles";
	}

	@RequestMapping(value = "leftMain.do")
	public String leftMain() throws Exception {
		System.out.println("asd");
		return "main/leftMain.left-tiles";
	}
	
	@RequestMapping(value = "sale_list.do", method = RequestMethod.GET)
	public String sale_product_list() throws Exception {
		
		return "sale/list.tiles";
	}
	
	@RequestMapping(value = "sale_register.do", method = RequestMethod.GET)
	public String sale_register() throws Exception {
		
		return "sale/register.tiles";
	}
	
	@RequestMapping(value = "carousel.do", method = RequestMethod.GET)
	public String carousel() throws Exception {
		
		return "main/carousel.tiles";
	}
	
	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login() throws Exception {
		
		return "user/login.tiles";
	}
	
	@RequestMapping(value = "signup.do", method = RequestMethod.GET)
	public String signup() throws Exception {
		
		return "user/signup.tiles";
	}
	
	@RequestMapping(value = "category_list.do", method = RequestMethod.GET)
	public String category_list() throws Exception {
		
		return "category/list.tiles";
	}
	
	@RequestMapping(value = "/shop.do",method = RequestMethod.GET)
	public String home() throws Exception {
		
		return "shop/home.tiles";
	}
	
	@RequestMapping(value = "/sale.do", method = RequestMethod.GET)
	public String sale() throws Exception {
		
		return "";
	}
}
