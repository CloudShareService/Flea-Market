package egovframework.myStore.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface MyStoreService {

	int register(ProductVO productVO);
	List<EgovMap> selectACategoryList();
}
