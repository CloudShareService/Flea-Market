package egovframework.myStore.manage.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ManageController {
	
	@RequestMapping(value = "/myStoreManage.do", method = RequestMethod.GET)
	public String myStoreManage() throws Exception {
		
		return "manage/myStoreManage.tiles2";
	}
}
