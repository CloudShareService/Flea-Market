package egovframework.fleaMarket.product.service.impl;

import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("productMapper")
public interface ProductMapper {

	List<EgovMap> selectProduct(int p_no) throws Exception;
	List<EgovMap> selectCategoryName(int p_no) throws Exception;

}
