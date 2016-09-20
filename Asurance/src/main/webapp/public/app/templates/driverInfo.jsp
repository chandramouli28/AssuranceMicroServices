<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link rel="stylesheet" href="public/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="public/bower_components/bootstrap/dist/css/bootstrap-theme.min.css">
     <script src="public/bower_components/jquery/dist/jquery.min.js"></script> -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="public/bower_components/angular/angular.js"></script>
<title>Driver Info</title>
<style>
li {
	cursor: pointer;
	cursor: hand;
}
</style>
</head>
<body>
	<div id="navbar"></div>
	<div class="container-fluid text-center" style="margin-top: 86px;">
		<div class="row">
			<div class="col-sm-12">
				<h2 style="color: orange">Here are the drivers on your quote:</h2>

			</div>
		</div>
		<hr class="colorgraph">
		<div class="row">
			<div class="col-sm-6">
				<span id="selected" class="glyphicon glyphicon-ok"></span><small>PolicyHolder</small><br>
				<label style="font-size:20px;">${customer.getFirstName() } ${customer.getLastName() }</label>

			</div>
			<div class="col-sm-6">
				<span>Added</span><br>
				<button type="button" class="btn btn-lg btn-default" id="btn1"
					onClick="history.back()">Edit</button>

			</div>
		</div>
		<hr class="colorgraph">
		<div class="row">
			<div class="col-sm-6">
				<h2>Add another driver?</h2>
			</div>
			<div class="col-sm-6">
				<button type="button" class="btn btn-lg btn-default" id="btn2">
					<span class="glyphicon glyphicon-plus"></span>Add to Quote

				</button>
			</div>
		</div>

		<hr class="colorgraph">


		<div class="row">
			<div class="col-sm-6">
				<button class="btn btn-md btn-primary" onClick="history.back()">Back</button>

			</div>

			<div class="col-sm-6">
				<a href="/Asurance/premium"><input
					class="btn btn-md btn-primary" id="goToPremium"
					value="Save & Continue"> </a>
			</div>
		</div>



		<script>
	$(document).ready(function(){
   
		$(document).ready(function(){
	    
			 $("#navbar").load('/Asurance/public/app/templates/navbar-for-quote.html');
	  
	});
	
  
  
});
	</script>
</body>
</html>