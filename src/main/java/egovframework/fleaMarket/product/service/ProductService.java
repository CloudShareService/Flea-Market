package egovframework.fleaMarket.product.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface ProductService {

	List<EgovMap> selectProduct(int p_no) throws Exception;

}
