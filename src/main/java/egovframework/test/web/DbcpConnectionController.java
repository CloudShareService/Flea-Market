package egovframework.test.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.test.service.DbcpConnectionService;

@Controller
public class DbcpConnectionController {
	
	@Resource(name = "dbcpConnectionService")
	private DbcpConnectionService dbcpConnectionService;
	
	@RequestMapping("dbcpConnectionServiceTest.do")
	public void dbcpConnectionServiceTest() {
		int result = dbcpConnectionService.getResult();
		System.out.println("result 값 : " + result);
	}
}
