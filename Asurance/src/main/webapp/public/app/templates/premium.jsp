<html>
<head>
<!--   <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.css">
        <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap-theme.css">
        <script src="bower_components/jquery/dist/jquery.js"></script>
        <script src="bower_components/bootstrap/dist/js/bootstrap.js"></script> -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<style>
body {
	background-color: #f0f0f0;
	float: center;
}
hr.style13 {
	height: 10px;
	border: 0;
	box-shadow: 0 10px 10px -10px #8c8b8b inset;
}
hr.style14 {
	border: 0;
	height: 1px;
	background-image: -webkit-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
	background-image: -moz-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
	background-image: -ms-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
	background-image: -o-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
	width: 830px;
	margin-left: 10px;
}
hr.style15 {
	border: 0;
	height: 1px;
	background-image: -webkit-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
	background-image: -moz-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
	background-image: -ms-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
	background-image: -o-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
	/*width: 830px;
              margin-left: 10px;*/
}
</style>
</head>

<body>
	<div id="navbar"></div>
	<div class="container" style="margin-top: 86px;">
		<span style="color: #ffb84d; font-size: 25; margin-left: 25px;"><strong>Here's
				your quote!</strong></span>
		<nav class="navbar navbar-default" style="background-color: #e6ffe6;">
			<div class="container-fluid">
				<div class="navbar-header">
					<!--  <a class="navbar-brand" href="#"></a>-->
					<ul class="nav nav-tabs nav-justified">
						<li role="presentation" class="active"><a href="">Basic</a></li>
						<li role="presentation"><a href="">Premium</a></li>
					</ul>
				</div>
			</div>
		</nav>

		<label id="qtAmt${quote.getQuoteAmount() }" class="quoteAmount" style="font-size: 50px;">$${quote.getQuoteAmount() }/Month</label>
		<hr class="style13" style="margin-top: 25px;">

		<div class="row">
			<div class="btn-group btn-group-lg" style="margin-left: 40px;">
				<input type="submit" class="btn btn-md btn-success btn-block"
					value="Continue to Buy">
			</div>

			<!-- <div class="btn-group btn-group-lg" style="margin-left: 200px;">
			<input type="submit" class="btn btn-lg btn-success btn-block"
				value="Continue to Buy">
		</div> -->
		</div>
		<h3 style="margin-left: 25px; color: #3884C9;">
			<Strong>Policy Coverages</Strong>
		</h3>

<!-- Liability BI/PD plan -->
		<div>
			<span style="margin-left: 25px;">Liability(BI/PD) <large>
				<span class="glyphicon glyphicon-question-sign"></span></large></span>
			<div class="btn-group btn-group-lg" style="margin-left: 360px;"
				data-toggle="modal" data-target="#myModal">
				<button type="button" class="btn btn-default">Edit</button>
			</div>

			<!-- Modal -->
			<div class="modal fade" id="myModal" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title" style="color: #ffb84d">Liability(BI/PD)</h4>
						</div>


						<div class="modal-body">
							<p>We pay the costs that youâre responsible for, up to the
								limit you choose, as a result of an accident. If youâre sued,
								we pay for a lawyer to defend you.</p>
							<br>
							<hr class="style13">
							<span><strong>Coverage</strong></span> <span
								style="color: grey; margin-left: 200px;"><strong>Change
									in Premium</strong></span>
							<h5 style="margin-left: 310px;">
								<strong>For 6 months</strong>
							</h5>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="Recommended" id="recommend"><strong>Recommended</strong></label>
								<span style="margin-left: 240px;" class="liabilityOption">+$46</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="$50k/$100k/$25k" id="50k">$50k/$100k/$25k</label>
								<span style="margin-left: 240px;" class="liabilityOption">+$35</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="$50k/$100k/$50k" id="100k">$50k/$100k/$50k</label>
								<span style="margin-left: 220px; color: #ffb84d" class="liabilityOption"><strong>Current</strong></span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="$100/$300k/$50k" id="300k">$100k/$300k/$50k</label>
								<span style="margin-left: 240px;" class="liabilityOption">+$84</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="$100/$300k/$100k" id="100k-300k">$100k/$300k/$100k</label>
								<span style="margin-left: 235px;" class="liabilityOption">+$87</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="$250/$500k/$100k" id="250k">$250k/$500k/$100k</label>
								<span style="margin-left: 230px;" class="liabilityOption">+$197</span>
							</div>

							<hr class="style15">

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal" id="liability">Update</button>
						</div>
					</div>

				</div>
			</div>


			<span id="liabilitySelection" style="margin-left: 40px; color: grey;">$25k/$50k/$25k</span>
			<span id="lbAmt${quote.getLiability() }" class="liabilityAmount" style="margin-left: 80px; color: grey;">$${quote.getLiability() }</span>
		</div>

		<hr class="style14">

<!-- Uninsured Motoroist BI plan -->
		<div>
			<span style="margin-left: 25px;">Uninsured Motorist BI<span
				class="glyphicon glyphicon-question-sign"></span></span>
			<div class="btn-group btn-group-lg" style="margin-left: 320px;"
				data-toggle="modal" data-target="#myModal1">
				<button type="button" class="btn btn-default">Edit</button>
			</div>

			<div class="modal fade" id="myModal1" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title" style="color: #ffb84d">Uninsured
								Motorist BI</h4>
						</div>


						<div class="modal-body">
							<p>We pay for medical expenses and in some cases other
								benefits up to the limit you choose, for you and your
								passengers, when youâre in an accident caused by a driver who
								has no insurance.</p>
							<br>
							<hr class="style13">
							<span><strong>Coverage</strong></span> <span
								style="color: grey; margin-left: 200px;"><strong>Change
									in Premium</strong></span>
							<h5 style="margin-left: 310px;">
								<strong>For 6 months</strong>
							</h5>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="No
									coverage" id="noCoverage">No
									coverage</label>
									 <span style="margin-left: 240px;" class="uninsuredOption">Current</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="Recommended" id="recommended">Recommended</label>
								<span style="margin-left: 240px;" class="uninsuredOption">+$25</span>
								<h5 style="margin-left: 20px;">$25k/$50k</h5>
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal" id="uninsuredMotorist">Update</button>
						</div>
					</div>

				</div>
			</div>
			<span id="uninsuredSelection" style="margin-left: 40px; color: grey;">No coverage</span> 
			<span id="uninAmt0" class="uninAmount" style="margin-left: 120px; color: grey;">$0</span>
		</div>

		<hr class="style14">

<!-- UnderInsured Motorist BI plan -->
		<div>
			<span style="margin-left: 25px;">Underinsured Motorist BI<span
				class="glyphicon glyphicon-question-sign"></span></span>
			<div class="btn-group btn-group-lg" style="margin-left: 300px;"
				data-toggle="modal" data-target="#myModal2">
				<button type="button" class="btn btn-default">Edit</button>
			</div>

			<div class="modal fade" id="myModal2" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title" style="color: #ffb84d">Underinsured
								Motorist BI</h4>
						</div>


						<div class="modal-body">
							<p>We pay for medical expenses and in some cases other
								benefits up to the limit you choose, for you and your
								passengers, when youâre in an accident caused by a driver who
								doesnât have enough insurance to cover these expenses.</p>
							<br>
							<hr class="style13">
							<span><strong>Coverage</strong></span> <span
								style="color: grey; margin-left: 200px;"><strong>Change
									in Premium</strong></span>
							<h5 style="margin-left: 310px;">
								<strong>For 6 months</strong>
							</h5>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="Current" id="current">No
									coverage</label> <span style="margin-left: 240px;" class="underinsuredOption">Current</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="Recommended" id="recommended25k"><strong>Recommended</strong></label>
								<span style="margin-left: 240px;" class="underinsuredOption">+$35</span><h5 style="margin-left: 20px;">$25k/$50k</h5>
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal" id="underInsuredBI">Update</button>
						</div>
					</div>

				</div>
			</div>


			<span id="underinsuredSelection" style="margin-left: 40px; color: grey;">No coverage</span> 
			<span id="underinAmt0" class="underinAmount" style="margin-left: 120px; color: grey;">$0</span>
		</div>

		<hr class="style14">
		
		
		<!-- Uninsured Motorist PD Plan -->

		<div>
			<span style="margin-left: 25px;">Uninsured Motorist PD<span
				class="glyphicon glyphicon-question-sign"></span></span>
			<div class="btn-group btn-group-lg" style="margin-left: 312px;"
				data-toggle="modal" data-target="#myModal3">
				<button type="button" class="btn btn-default">Edit</button>
			</div>

			<div class="modal fade" id="myModal3" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title" style="color: #ffb84d">Uninsured
								Motorist PD</h4>
						</div>


						<div class="modal-body">
							<p>We pay to repair damage to your vehicle caused by a driver
								who doesnât have insurance.</p>
							<br>
							<hr class="style13">
							<span><strong>Coverage</strong></span> <span
								style="color: grey; margin-left: 200px;"><strong>Change
									in Premium</strong></span>
							<h5 style="margin-left: 310px;">
								<strong>For 6 months</strong>
							</h5>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="Current" id="unInsuredNoCoverage">No
									coverage</label> <span class="unInsuredMotoristOption" style="margin-left: 240px;">Current</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="Recommended" id="unInsuredRecommended"><strong>Recommended</strong></label>
								<span class="unInsuredMotoristOption" style="margin-left: 240px;">+$25</span>
								<!-- <h5 style="margin-left: 20px;">$25k/$50k</h5> -->
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal" id="unInsuredMotoristPD">Update</button>
						</div>
					</div>

				</div>
			</div>


			<span id="uninsuredMotoristSelection" style="margin-left: 40px; color: grey;">No coverage</span>
			 <span	id="unInAmt0" class="underinPDAmount" style="margin-left: 120px; color: grey;">$0</span>
		</div>

		<hr class="style14">

<!-- Personal Injury Plan -->

		<div>
			<span style="margin-left: 25px;">Personal Injury Protection<span
				class="glyphicon glyphicon-question-sign"></span></span>
			<div class="btn-group btn-group-lg" style="margin-left: 290px;">
				<button type="button" class="btn btn-default" data-toggle="modal"
					data-target="#myModal4">Edit</button>
			</div>

			<div class="modal fade" id="myModal4" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title" style="color: #ffb84d">Personal
								Injury Protection</h4>
						</div>


						<div class="modal-body">
							<p>We pay for medical expenses, lost wages, and, in some
								cases, other benefits if you are injured or killed as a result
								of an accident, no matter whoâs at fault.</p>
							<br>
							<hr class="style13">
							<span><strong>Coverage</strong></span> <span
								style="color: grey; margin-left: 200px;"><strong>Change
									in Premium</strong></span>
							<h5 style="margin-left: 310px;">
								<strong>For 6 months</strong>
							</h5>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="No
									coverage" id="personalInjuryCurrent" >No
									coverage</label> <span class="personalInjuryOption" style="margin-left: 240px;">Current</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="$5k" id="personalInjury5k">$5k
									Accidental death</label><span class="personalInjuryOption" style="margin-left: 240px;">+$5</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="$10k" id="personalInjury10k">$10k
									Accidental death & Income disability</label><span class="personalInjuryOption" style="margin-left: 240px;">+$10</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio" value="$5k" id="personalInjuryMedical">$5k
									Medical Hospital & Accidental death</label><span class="personalInjuryOption" style="margin-left: 240px;">+$5</span>
							</div>

							
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal" id="personalInjury">Update</button>
						</div>
					</div>

				</div>
			</div>

			<span id="personalInjurySelection" style="margin-left: 40px; color: grey;">No coverage</span> 
			<span id="personalInjAmt0" class="personalAmount" style="margin-left: 120px; color: grey;">$0</span>
		</div>

		<hr class="style14">

			<!-- Comphrenesive plan -->

		<h3 style="margin-left: 25px; color: #3884C9;">
			<strong>${selectedVehicle.getYear() }
				${selectedVehicle.getMake() } ${selectedVehicle.getModel() }
				Coverages</strong>
		</h3>

		<div>
			<span style="margin-left: 25px;">Comprehensive<span
				class="glyphicon glyphicon-question-sign"></span></span>
			<div class="btn-group btn-group-lg" style="margin-left: 360px;">
				<button type="button" class="btn btn-default" data-toggle="modal"
					data-target="#myModal5">Edit</button>
			</div>

			<div class="modal fade" id="myModal5" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title" style="color: #ffb84d">Comprehensive</h4>
						</div>


						<div class="modal-body">
							<p>We pay to repair damage to your car that’s caused by
								something other than a collision, such as fire, theft,
								vandalism, hail, flood, or hitting an animal.</p>
							<br>
							<hr class="style13">
							<span><strong>Coverage</strong></span> <span
								style="color: grey; margin-left: 200px;"><strong>Change
									in Premium</strong></span>
							<h5 style="margin-left: 310px;">
								<strong>For 6 months</strong>
							</h5>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="No coverage" id="noCompCoverage">No coverage</label> <span
									style="margin-left: 240px;" class="compOption">Current</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$100 deductible" id="100">$100 deductible</label> <span
									style="margin-left: 240px;" class="compOption">+$140</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$200 deductible" id="200">$200 deductible</label> <span
									style="margin-left: 240px;" class="compOption">+$108</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$500 deductible" id="500">$500 deductible</label> <span
									style="margin-left: 240px;" class="compOption">+$86</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$1000 deductible" id="1000">$1000 deductible</label> <span
									style="margin-left: 240px;" class="compOption">+$54</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$2000 deductible" id="2000">$2000 deductible</label> <span
									style="margin-left: 240px;" class="compOption">+$34</span>
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal" id="comprehensive">Update</button>
						</div>
					</div>
				</div>
			</div>


			<span id="compSelection" style="margin-left: 40px; color: grey;">No
				Coverage</span> <span id="cpAmt0" class="compAmount"
				style="margin-left: 120px; color: grey;">$0</span>
		</div>

		<hr class="style14">

	<!-- 	Collison Plan -->

		<div>
			<span style="margin-left: 25px;">Collision<span
				class="glyphicon glyphicon-question-sign"></span></span>
			<div class="btn-group btn-group-lg" style="margin-left: 400px;">
				<button type="button" class="btn btn-default" data-toggle="modal"
					data-target="#myModal6">Edit</button>
			</div>

			<div class="modal fade" id="myModal6" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title" style="color: #ffb84d">Collision</h4>
						</div>


						<div class="modal-body">
							<p>We pay to repair damage to your car when you hit, or are
								hit by, another vehicle or object, regardless of who’s at
								fault. We also pay expenses related to injuries or the death of
								pets traveling with you.</p>
							<br>
							<hr class="style13">
							<span><strong>Coverage</strong></span> <span
								style="color: grey; margin-left: 200px;"><strong>Change
									in Premium</strong></span>
							<h5 style="margin-left: 310px;">
								<strong>For 6 months</strong>
							</h5>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="No coverage" id="noCollisionCoverage">No coverage</label> <span
									style="margin-left: 240px;" class="collOption">Current</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$100 deductible" id="100coll">$100 deductible</label> <span
									style="margin-left: 240px;" class="collOption">+$401</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$200 deductible" id="200coll">$200 deductible</label> <span
									style="margin-left: 240px;" class="collOption">+$294</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$500 deductible" id="500coll">$500 deductible</label> <span
									style="margin-left: 240px;" class="collOption">+$234</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$1000 deductible" id="1000coll">$1000 deductible</label>
								<span style="margin-left: 240px;" class="collOption">+$155</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$2000 deductible" id="2000coll">$2000 deductible</label>
								<span style="margin-left: 240px;" class="collOption">+$105</span>
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal" id="collision">Update</button>
						</div>
					</div>
				</div>
			</div>
			<span id="collSelection" style="margin-left: 40px; color: grey;">No
				Coverage</span> <span id="clAmt0" class="collAmount"
				style="margin-left: 120px; color: grey;">$0</span>
		</div>

		<hr class="style14">

		<!-- Rental Plan -->

		<div>
			<span style="margin-left: 25px;">Rental<span
				class="glyphicon glyphicon-question-sign"></span></span>
			<div class="btn-group btn-group-lg" style="margin-left: 410px;">
				<button type="button" class="btn btn-default" data-toggle="modal"
					data-target="#myModal7">Edit</button>
			</div>

			<div class="modal fade" id="myModal7" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title" style="color: #ffb84d">Rental</h4>
						</div>


						<div class="modal-body">
							<p>We pay for your rental car up to the limit you choose,
								while your vehicle is being repaired. You can buy Rental
								Reimbursement if you have Comprehensive and Collision coverage.</p>
							<br>
							<hr class="style13">
							<span><strong>Coverage</strong></span> <span
								style="color: grey; margin-left: 200px;"><strong>Change
									in Premium</strong></span>
							<h5 style="margin-left: 310px;">
								<strong>For 6 months</strong>
							</h5>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="No coverage" id="noRentalCoverage">No coverage</label> <span
									style="margin-left: 240px;" class="rentOption">Current</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$30 per day" id="30rent">$30 per day<br>($900
									maximum)</label> <span style="margin-left: 240px;" class="rentOption">+$35</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$40 per day" id="40rent">$40 per day<br>($1200
									maximum)</label> <span style="margin-left: 240px;" class="rentOption">+$50</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="$50 per day" id="50rent">$50 per day<br>($1500
									maximum)</label> <span style="margin-left: 240px;" class="rentOption">+$67</span>
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal" id="rental">Update</button>
						</div>
					</div>
				</div>
			</div>
			<span id="rentSelection" style="margin-left: 40px; color: grey;">No
				Coverage</span> <span id="rtAmt0" class="rentAmount"
				style="margin-left: 120px; color: grey;">$0</span>
		</div>

		<hr class="style14">

		<!-- RoadSide Plan -->

		<div>
			<span style="margin-left: 25px;">Roadside<span
				class="glyphicon glyphicon-question-sign"></span></span>
			<div class="btn-group btn-group-lg" style="margin-left: 390px;">
				<button type="button" class="btn btn-default" data-toggle="modal"
					data-target="#myModal8">Edit</button>
			</div>

			<div class="modal fade" id="myModal8" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title" style="color: #ffb84d">Roadside</h4>
						</div>


						<div class="modal-body">
							<p>We pay for certain roadside repairs or towing services
								when your vehicle breaks down due to mechanical or electrical
								issues, a dead battery, a flat tire, a lock-out, or if you run
								out of gas.</p>
							<br>
							<hr class="style13">
							<span><strong>Coverage</strong></span> <span
								style="color: grey; margin-left: 200px;"><strong>Change
									in Premium</strong></span>
							<h5 style="margin-left: 310px;">
								<strong>For 6 months</strong>
							</h5>

							<hr class="style15">

								<div class="radio">
								<label><input type="radio" name="optradio"
									value="No coverage" id="noRoadCoverage">No coverage</label> <span
									style="margin-left: 240px;" class="roadOption">Current</span>
							</div>

							<hr class="style15">

							<div class="radio">
								<label><input type="radio" name="optradio"
									value="Coverage selected" id="coverageSelected">Coverage selected</label> <span
									style="margin-left: 240px;" class="roadOption">+$24</span>
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal" id="roadside">Update</button>
						</div>
					</div>
				</div>
			</div>

			<span id="roadSelection" style="margin-left: 40px; color: grey;">No
				Coverage</span> <span id="rdAmt0" class="roadAmount"
				style="margin-left: 120px; color: grey;">$0</span>
		</div>

		<hr class="style14">

		<div class="btn-group btn-group-lg">
			<a href="policyNumber.html" class="btn btn-lg btn-primary btn-block"
				style="margin-left: 30px;">Continue to Buy</a>
		</div>
		<!-- <div class="btn-group btn-group-lg">
		<a href="policyNumber.html" class="btn btn-lg btn-primary btn-block"
			style="margin-left: 60px;">Continue to Buy</a>
	</div> -->

		<hr class="colorgraph">


		<div class="row">
			<div class="col-sm-6">
				<button class="btn btn-md btn-primary" onClick="history.back()">Back</button>

			</div>

			<div class="col-sm-6">
				<input type="submit" class="btn btn-md btn-primary" id="goToSummary"
					value="Save & Continue">
			</div>
		</div>

	</div>
	<script>
	$(document).ready(function(){
    
		 $("#navbar").load('/Asurance/public/app/templates/navbar-for-quote.html');
  
});
	</script>

	<script src="public/app/js/premium.js"></script>
	<!-- <script src="../js/premium.js"></script> -->
</body>

</html>