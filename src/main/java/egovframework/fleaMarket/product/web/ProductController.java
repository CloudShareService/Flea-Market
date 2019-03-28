/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.fleaMarket.product.web;

import java.util.List;

import egovframework.fleaMarket.product.service.ProductService;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springmodules.validation.commons.DefaultBeanValidator;

@Controller
public class ProductController {
	
	@Resource(name="productService")
	private ProductService productService;

	@RequestMapping(value = "/product_home.do", method = RequestMethod.GET)
	public String product_home(ModelMap model) throws Exception {
		
		int p_no = 0;
		List<EgovMap> productList = productService.selectProduct(p_no);
		//product테이블 데이터 
		System.out.println(productList);
		
		model.addAttribute("productList", productList);
		
		List<EgovMap> categoryName = productService.selectCategoryName(p_no);		
		//category테이블 데이터 
		System.out.println(categoryName);
		
		model.addAttribute("categoryName", categoryName);
		
		return "product/home.tiles";
	}

}
