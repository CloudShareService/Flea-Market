<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Portfolio Grid -->
<section class="bg-light" id="portfolio">
	<div class="container">
		<div class="row form-inline" style="border:1px solid #d9d9d9">
			<div class="col-lg-4 text-center" style="background:grey;height:300px;">
				<div class="w-30 mt-5" style="margin:0 auto">
					<img class="w-100 text-center" src="resources/img/shop/shop_img_1.jpg" style="border-radius: 100%">
				</div>
				<div class="w-40 mt-4" style="margin:0 auto">
					<span style="color:white">Shop No.211234</span><br>
					<i class="far fa-star"></i>
					<i class="far fa-star"></i>
					<i class="far fa-star"></i>
					<i class="far fa-star"></i>
					<i class="far fa-star"></i>
				</div>
				<div class="w-40 mt-4 p-2" style="margin:0 auto;background:color:none;border:1px solid white">
					<span>My store management</span>
				</div>
			</div>
			<div class="col-lg-8" style="height:300px;">
				<div class="w-100 mt-4">
					<span style="font-size:25px">Shop No.211234</span>
					<a class="ml-3" style="border:1px solid #e8e8e8;border-radius: 10%;font-size:5px">update</a>
					<span style="float:right;border-radius: 10%;background-color:#fed136;color:white;font-size:10px;">authenticated</span>
				</div>
				<div class="w-100 mt-4 p-2" style="border-top:1px solid #d9d9d9;border-bottom:1px solid #d9d9d9;">
					<div class="ml-2">
						<i class="fa fa-dumpster"></i>
						<span class=""> </span>
					</div>
					<div class="ml-2">
						<i class="fa fa-walking"></i>
						<span> </span>
					</div>
					<div class="ml-2">
						<i class="fa fa-shopping-cart"></i>
						<span> </span>
					</div>
					<div class="ml-2">
						<i class="fa fa-car"></i>
						<span> </span>
					</div>
				</div>
				<div>
				
				</div>
			</div>
		</div>
		<div class="mt-5">
			<div class="row tab_menu">
				<a class="col-2 text-center" href="#" style="border:1px solid #ccc;line-height:50px;">Product 0</a>
				<a class="col-2 text-center" href="#" style="border:1px solid #ccc;line-height:50px;">Shop Inqury 0</a>
				<a class="col-2 text-center" href="#" style="border:1px solid #ccc;line-height:50px;">Wish 0</a>
				<a class="col-2 text-center" href="#" style="border:1px solid #ccc;line-height:50px;">Shop Review 0</a>
				<a class="col-2 text-center" href="#" style="border:1px solid #ccc;line-height:50px;">Following 0</a>
				<a class="col-2 text-center" href="#" style="border:1px solid #ccc;line-height:50px;">Follower 0</a>
			</div>
			<div class="w-100 title mt-5 p-3" style="border-bottom:1px solid #ccc">
				<span style="font-size:30px">Products</span>
				<span style="font-size:20px;color:red">1</span>
				<select class="mt-2" style="float:right">
					<option>All</option>
					<option>Etc</option>
				</select>
			</div>
			<div class="w-100 mt-4 p-3 sub">
				<span>All</span>
				<span style="color:grey">1</span>
				<div style="float:right">
					<a class="pl-2 pr-2" style="border-right:1px solid black">The_latest</a>
					<a class="pl-2 pr-2" style="border-right:1px solid black">Popularity</a>
					<a class="pl-2 pr-2" style="border-right:1px solid black">Low_cost</a>
					<a class="pl-2 pr-2">High_value</a>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" data-toggle="modal"
					href="#portfolioModal1">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fas fa-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid" src="resources/img/portfolio/01-thumbnail.jpg" alt="">
				</a>
				<div class="portfolio-caption">
					<h4>Threads</h4>
					<p class="text-muted">Illustration</p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" data-toggle="modal"
					href="#portfolioModal2">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fas fa-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid"
					src="resources/img/portfolio/02-thumbnail.jpg" alt="">
				</a>
				<div class="portfolio-caption">
					<h4>Explore</h4>
					<p class="text-muted">Graphic Design</p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" data-toggle="modal"
					href="#portfolioModal3">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fas fa-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid"
					src="resources/img/portfolio/03-thumbnail.jpg" alt="">
				</a>
				<div class="portfolio-caption">
					<h4>Finish</h4>
					<p class="text-muted">Identity</p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" data-toggle="modal"
					href="#portfolioModal4">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fas fa-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid"
					src="resources/img/portfolio/04-thumbnail.jpg" alt="">
				</a>
				<div class="portfolio-caption">
					<h4>Lines</h4>
					<p class="text-muted">Branding</p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" data-toggle="modal" href="#portfolioModal5">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fas fa-plus fa-3x"></i>
						</div>
					</div> 
					<img class="img-fluid" src="resources/img/portfolio/05-thumbnail.jpg" alt="">
				</a>
				<div class="portfolio-caption">
					<h4>Southwest</h4>
					<p class="text-muted">Website Design</p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" data-toggle="modal"
					href="#portfolioModal6">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fas fa-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid"
					src="resources/img/portfolio/06-thumbnail.jpg" alt="">
				</a>
				<div class="portfolio-caption">
					<h4>Window</h4>
					<p class="text-muted">Photography</p>
				</div>
			</div>
		</div>
	</div>
</section>
