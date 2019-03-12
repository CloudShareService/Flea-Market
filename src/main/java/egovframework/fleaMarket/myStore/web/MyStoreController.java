package egovframework.fleaMarket.myStore.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import egovframework.fleaMarket.myStore.service.MyStoreService;
import egovframework.fleaMarket.myStore.service.ProductVO;

@Controller
public class MyStoreController {

	@Resource(name = "myStoreService")
	private MyStoreService myStoreService;
	
	@RequestMapping(value = "/myStore_list.do", method = RequestMethod.GET)
	public String myStore_list() throws Exception {
		
		return "myStore/list.tiles2";
	}
	
	@RequestMapping(value = "/myStore_register.do", method = RequestMethod.GET)
	public String myStore_register() throws Exception {
		
		return "myStore/register.tiles2";
	}
	
	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String register(@ModelAttribute ProductVO productVO, BindingResult result, RedirectAttributes redirectAttributes) throws Exception {
		try {
			if (result.hasErrors()) {
				System.out.println(result.getAllErrors());
			}
			System.out.println("productVO : " + productVO);
			/*
			int result = myStoreService.register(productVO);
			redirectAttributes.addAttribute("result", result);
			*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("register 메소드 종료");
		}
		
		return "redirect:/myStore_list.do";
	}
}
