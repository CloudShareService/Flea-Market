package egovframework.myStore.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.myStore.service.MyStoreService;
import egovframework.myStore.service.ProductVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("myStoreService")
public class MyStoreServiceImpl implements MyStoreService {

	@Resource(name = "myStoreMapper")
	private MyStoreMapper myStoreMapper;
	
	@Override
	public int register(ProductVO productVO) {
		int result = myStoreMapper.register(productVO);
		return result;
	}
	
	@Override
	public List<EgovMap> selectACategoryList() {
		List<EgovMap> aCategoryList = myStoreMapper.selectACategoryList();
		return aCategoryList;
	}
}
