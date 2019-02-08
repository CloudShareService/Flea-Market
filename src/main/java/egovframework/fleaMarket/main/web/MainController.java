package egovframework.fleaMarket.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
}
