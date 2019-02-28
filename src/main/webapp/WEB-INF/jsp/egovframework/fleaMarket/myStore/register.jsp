<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<!-- Dropzone.css -->
    <link href="myStore/vendors/dropzone/dist/min/dropzone.min.css" rel="stylesheet">
    
    <!-- Switchery -->
    <link href="myStore/vendors/switchery/dist/switchery.min.css" rel="stylesheet">
    
<style>
	/*
	.page-title .title_right {
		float:right;
	}
	*/
	
	@media (min-width: 768px) {
		.form-horizontal .control-label {
			text-align: left;
		}
	}
	
</style>
	<div class="right_col" role="main">
          <div class="">
          	<!--  
            <div class="page-title">  
              	<div class="title_left">
                	<h3>이미지 등록 </h3>
              	</div>
            	<div class="title_right">
			       	<div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
			            <div class="input-group">
			                <input type="text" class="form-control" placeholder="Search for...">
			                <span class="input-group-btn">
			                	<button class="btn btn-default" type="button">Go!</button>
			                </span>
			           	</div>
			       	</div>
	        	</div>
	        </div>
	        -->

            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-9 col-sm-9 col-xs-9">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>이미지 등록</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <p>* 상품 이미지는 640x640에 최적화 되어 있습니다.
						- 이미지는 상품등록 시 정사각형으로 짤려서 등록됩니다.
						- 확대하기를 누를 경우 원본이미지를 확인할 수 있습니다. 
						- 사진을 클릭 후 이동하여 등록순서를 변경할 수 있습니다.
						- 큰 이미지일경우 이미지가 깨지는 경우가 발생할 수 있습니다.
						최대 지원 사이즈인 640 X 640 으로 리사이즈 해서 올려주세요.(개당 이미지 최대 10M )</p>
                    <form action="form_upload.html" class="dropzone"></form>
                    <br />
                    <br />
                    <br />
                    <br />
                  </div>
                </div>
              </div>
            </div>
            
            <div class="row">
	            <div class="col-md-9 col-xs-12">
	                <div class="x_panel">
	                  <div class="x_title">
	                    <h2>기본 정보</h2>
	                    <div class="clearfix"></div>
	                  </div>
	                  <div class="x_content">
	                    <br />
	                    <form class="form-horizontal form-label-left">
	
	                      <div class="form-group">
	                        <label class="control-label col-md-2 col-sm-2 col-xs-12">카테고리</label>
	                        <div class="col-md-4 col-sm-4 col-xs-12">
	                          <select class="form-control">
	                            <option>여성의류</option>
	                            <option>남성의류</option>
	                            <option>패션잡화</option>
	                            <option>뷰티/미용</option>
	                            <option>유아동/출산</option>
	                          </select>
	                        </div>
	                      </div>
	                      <div class="form-group">
	                        <label class="control-label col-md-2 col-sm-2 col-xs-12">거래 지역 </label>
	                        <div class="col-md-4 col-sm-4 col-xs-12">
	                          <input type="text" class="form-control" disabled="disabled" placeholder="선호 거래 지역">
	                        </div>
	                        <div class="col-md-6 col-sm-6 col-xs-12">
	                        	<button type="button" class="btn btn-default">최근 지역</button>
	                        	<button type="button" class="btn btn-primary">지하철 검색</button>
	                        	<button type="button" class="btn btn-success">지역 검색</button>
	                        </div>
	                      </div>
	                      <div class="form-group">
	                        <label class="control-label col-md-2 col-sm-2 col-xs-12">상태</label>
	                        <div class="col-md-4 col-sm-4 col-xs-12">
	                          <select class="form-control">
	                            <option>상태 옵션1</option>
	                            <option>상태 옵션2</option>
	                            <option>상태 옵션3</option>
	                            <option>상태 옵션4</option>
	                            <option>상태 옵션5</option>
	                          </select>
	                        </div>
	                      </div>
	                      <div class="form-group">
	                        <label class="control-label col-md-2 col-sm-2 col-xs-12">제목</label>
	                        <div class="col-md-9 col-sm-9 col-xs-12">
                          		<input type="text" class="form-control" placeholder="제목 (최대 40자)">
                        	</div>
	                      </div>
	                      <div class="form-group">
	                        <label class="control-label col-md-2 col-sm-2 col-xs-12">가격</label>
	                        <div class="col-md-9 col-sm-9 col-xs-12">
                          		<input type="text" class="form-control" placeholder="10000 (가격은 숫자로만 입력)">
                        	</div>
                        	<div class="col-md-2 col-sm-2 col-xs-12"></div>
                        	<div class="col-md-9 col-sm-9 col-xs-12">
	                        	<div class="checkbox">
	                            	<label>
	                              		<input type="checkbox" class="flat" checked="checked"> 택배비포함
	                            	</label>
	                            	<label>
	                              		<input type="checkbox" class="flat"> 교환가능
	                            	</label>
	                          	</div>
                          	</div>
	                      </div>
	                      <div class="form-group">
	                        <label class="control-label col-md-2 col-sm-2 col-xs-12">설명</label>
	                        <div class="col-md-9 col-sm-9 col-xs-12">
                          		<textarea class="form-control" rows="6" placeholder="상품설명은 2000자까지 가능합니다."></textarea>
                        	</div>
	                      </div>
	                      <div class="form-group">
	                        <label class="control-label col-md-2 col-sm-2 col-xs-12">연관태그</label>
	                        <div class="col-md-9 col-sm-9 col-xs-12">
                          		<input type="text" class="form-control" placeholder="선택 사항 (예: 아이폰, 케이스)">
                        	</div>
	                      </div>
	                      <div class="form-group">
	                      	<label class="control-label col-md-2 col-sm-2 col-xs-12">수량</label>
	                        <div class="col-md-9 col-sm-9 col-xs-12">
                          		<input type="text" class="form-control" placeholder="1">
                        	</div>
	                      </div>
	                      <div class="form-group">
	                        <div class="col-md-11 col-sm-11 col-xs-11" style="text-align:right;">
	                          <button type="submit" class="btn btn-success">물품 등록</button>
	                        </div>
	                      </div>
	                    </form>
	                  </div>
	                </div>
	              </div>
	      		</div>
          </div>
        </div>
        
	<!-- Dropzone.js -->
    <script src="myStore/vendors/dropzone/dist/min/dropzone.min.js"></script>
    <!-- Switchery -->
    <script src="myStore/vendors/switchery/dist/switchery.min.js"></script>
        