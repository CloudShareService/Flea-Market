package egovframework.myStore.service.impl;

import java.util.List;

import egovframework.myStore.service.ProductVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("myStoreMapper")
public interface MyStoreMapper {

	int register(ProductVO productVO);

	List<EgovMap> selectACategoryList();
}
