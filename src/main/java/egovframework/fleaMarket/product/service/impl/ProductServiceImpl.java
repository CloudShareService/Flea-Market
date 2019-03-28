package egovframework.fleaMarket.product.service.impl;

import java.util.List;

import egovframework.fleaMarket.product.service.ProductService;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl extends EgovAbstractServiceImpl implements ProductService {

	@Resource(name="productMapper")
	private ProductMapper productMapper;
	
	@Override
	public List<EgovMap> selectProduct(int p_no) throws Exception {
		// TODO Auto-generated method stub
		return productMapper.selectProduct(p_no);
	}
	
	@Override
	public List<EgovMap> selectCategoryName(int p_no) throws Exception {
		// TODO Auto-generated method stub
		return productMapper.selectCategoryName(p_no);
	}

}
