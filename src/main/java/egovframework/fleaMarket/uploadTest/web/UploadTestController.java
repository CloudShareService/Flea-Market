package egovframework.fleaMarket.uploadTest.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.fleaMarket.cmmn.service.util.FileUtils;

@Controller
public class UploadTestController {
	private static final Logger logger = LoggerFactory.getLogger(UploadTestController.class);

	@Resource(name = "fileUtils")
	FileUtils fileUtils;
	
	@RequestMapping("upload_test.do")
	public void upload_test(HttpServletRequest req) throws Exception {
		
		List<Map<String,Object>> list = fileUtils.parseInsertFileInfo(req);
		
		logger.info(list.get(0).get("ORIGINAL_FILE_NAME").toString());
		
	}
}
