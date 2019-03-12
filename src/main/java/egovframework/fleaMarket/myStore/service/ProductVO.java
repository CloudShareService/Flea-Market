package egovframework.fleaMarket.myStore.service;

import java.util.Date;

public class ProductVO {
	private int productNo;
	private int categoryCode;
	private int userNo;
	private int productStatementCode;
	private String productTitle;
	private int productPrice;
	private Date productDate;
	private int productQuantity;
	private int productTrade;
	private int productViews;
	private String productContents;
	
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public int getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getProductStatementCode() {
		return productStatementCode;
	}
	public void setProductStatementCode(int productStatementCode) {
		this.productStatementCode = productStatementCode;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public int getProductTrade() {
		return productTrade;
	}
	public void setProductTrade(int productTrade) {
		this.productTrade = productTrade;
	}
	public int getProductViews() {
		return productViews;
	}
	public void setProductViews(int productViews) {
		this.productViews = productViews;
	}
	public String getProductContents() {
		return productContents;
	}
	public void setProductContents(String productContents) {
		this.productContents = productContents;
	}
}
