
$(document).ready(function(){
    
    $(".carousel_pointer").on("click",function() {
    	var $this = $(this).find("i").attr("class");//지금 클릭한 캐러셀포인터의 클래스
    	
    	carouselInit(2000,$this);
    })
});
 
function carouselInit(t,pointer){
	var imgW;
	var time;// 슬라이드 넘어가는 시간
	var $carouselLi;
	var carouselCount; // 캐러셀 사진 갯수
	var currentIndex; // 현재 보여지는 슬라이드 인덱스 값
	var caInterval;
	var carousel_pointer;
	var direction;//이동 방향
	
	
    time = t;
    $carouselLi = $(".carousel_section > .product_wrapper");
    carouselCount = $carouselLi.length; // 캐러셀 사진 갯수
    currentIndex = 0; // 현재 보여지는 슬라이드 인덱스 값
    
    
    
    
    if (pointer === "fa fa-chevron-right") {
    	imgW = -$carouselLi.width()*5; //이동할 길이  
    } else {
    	imgW = $carouselLi.width()*5; //이동할 길이
    }
    
    
    for(var i = 0; i < carouselCount; i++)
    {	
    	//$carouselLi.eq(i).css(direction, imgW);
    	$carouselLi.eq(i).css("-webkit-transform","translateX("+imgW+"px)");
    	$carouselLi.eq(i).css("-webkit-transition-timing-function","linear");
    }
}
 
