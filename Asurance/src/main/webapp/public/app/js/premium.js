$(document).ready(function() {

 var quoteAmt = parseInt($(".quoteAmount").attr("id").substring(5));
 var liabCheckedValue = 0;
 var uninsuredMotoristCheckedValue = 0;
 var underinsuredMotoristBICheckedValue = 0;
 var uninsuredMotoristPDCheckedValue = 0;
 var personalInjuryCheckedValue = 0;
 var compCheckedValue = 0;
 var collCheckedValue = 0;
 var rentCheckedValue = 0;
 var roadCheckedValue = 0;
 
 
console.log(quoteAmt);
/**
handling liability
**/
$("#liability").click(function(){
		 var radioValue = $("input[type='radio']:checked").val();
		 console.log(radioValue);
		 $("#liabilitySelection").html(radioValue);
		 console.log( $("#liabilitySelection").text());
		 var liabailityAmt = parseInt($(".liabilityAmount").attr("id").substring(5));
		 console.log(liabailityAmt);
		var radioClass = $("input[type='radio']:checked").attr("id"); 
		console.log(radioClass);
		var spanValue = $("#" + radioClass).parent().parent().find('.liabilityOption').text();
		
		if(spanValue!= "Current"){
			if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
				quoteAmt -= liabCheckedValue;
			}
		liabCheckedValue = parseInt(spanValue.substring(2));
		liabailityAmt += liabCheckedValue;
		$(".liabilityAmount").html("$" + liabailityAmt);
		quoteAmt += liabCheckedValue;
		console.log(quoteAmt);
		$(".quoteAmount").html("$" + quoteAmt);
		console.log(spanValue);
		} else {
			if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
				quoteAmt -= liabCheckedValue;
				liabCheckedValue = 0;
			}
			liabailityAmt = parseInt($(".liabilityAmount").attr("id").substring(5));
				$(".liabilityAmount").html("$" + liabailityAmt);
				$(".quoteAmount").html("$" + quoteAmt);
		}
		
});

/**
handling uninsured motorist 
**/
$("#uninsuredMotorist").click(function(){
		 var radioValue = $("input[type='radio']:checked").val();
		 $("#uninsuredSelection").html(radioValue);
		 var uninsuredAmt = parseInt($(".uninAmount").attr("id").substring(7));
		 console.log(uninsuredAmt);
		var radioClass = $("input[type='radio']:checked").attr("id"); 
		console.log(radioClass);
		var spanValue = $("#" + radioClass).parent().parent().find('.uninsuredOption').text();
		console.log(spanValue);
		if(spanValue!= "Current"){
			if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
				quoteAmt -= uninsuredMotoristCheckedValue;
			}
			uninsuredMotoristCheckedValue = parseInt(spanValue.substring(2));
			uninsuredAmt += uninsuredMotoristCheckedValue;
		$(".uninAmount").html("$" + uninsuredAmt);
		quoteAmt += uninsuredAmt;
		console.log(quoteAmt);
		$(".quoteAmount").html("$" + quoteAmt);
		console.log(spanValue);
		} else {
			if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
				quoteAmt -= uninsuredMotoristCheckedValue;
				uninsuredMotoristCheckedValue = 0;
			}
			uninsuredAmt = parseInt($(".uninAmount").attr("id").substring(7));
				$(".uninAmount").html("$" + uninsuredAmt);
				$(".quoteAmount").html("$" + quoteAmt);
		}
		
	
		
		
});

/**
	handling underinsured motorist BI
**/

$("#underInsuredBI").click(function(){
		 var radioValue = $("input[type='radio']:checked").val();
		 console.log(radioValue);
		 $("#underinsuredSelection").html(radioValue);
		 console.log( $("#underinsuredSelection").text());
		 var underInsuredAmt = parseInt($(".underinAmount").attr("id").substring(10));
		 console.log(underInsuredAmt);
		var radioClass = $("input[type='radio']:checked").attr("id"); 
		console.log(radioClass);
		var spanValue = $("#" + radioClass).parent().parent().find('.underinsuredOption').text();
		
		if(spanValue!= "Current"){
			if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
				quoteAmt -= underinsuredMotoristBICheckedValue;
			}
			underinsuredMotoristBICheckedValue = parseInt(spanValue.substring(2));
			underInsuredAmt += underinsuredMotoristBICheckedValue;
		$(".underinAmount").html("$" + underInsuredAmt);
		quoteAmt += underInsuredAmt;
		console.log(quoteAmt);
		$(".quoteAmount").html("$" + quoteAmt);
		console.log(spanValue);
		} else {
			if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
				quoteAmt -= underinsuredMotoristBICheckedValue;
				underinsuredMotoristBICheckedValue = 0;
			}
			underInsuredAmt = parseInt($(".underinAmount").attr("id").substring(10));
				$(".underinAmount").html("$" + underInsuredAmt);
				$(".quoteAmount").html("$" + quoteAmt);
		}
		
});

/**
	handling uninsured motorist PD 
**/

$("#unInsuredMotoristPD").click(function(){
		 var radioValue = $("input[type='radio']:checked").val();
		 console.log(radioValue);
		 $("#uninsuredMotoristSelection").html(radioValue);
		 console.log( $("#uninsuredMotoristSelection").text());
		 var underInsuredPDAmt = parseInt($(".underinPDAmount").attr("id").substring(7));
		 console.log(underInsuredPDAmt);
		var radioClass = $("input[type='radio']:checked").attr("id"); 
		console.log(radioClass);
		var spanValue = $("#" + radioClass).parent().parent().find('.unInsuredMotoristOption').text();
		
		if(spanValue!= "Current"){
			if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
				quoteAmt -= uninsuredMotoristPDCheckedValue;
			}
			uninsuredMotoristPDCheckedValue = parseInt(spanValue.substring(2));
			underInsuredPDAmt += uninsuredMotoristPDCheckedValue;
		$(".underinPDAmount").html("$" + underInsuredPDAmt);
		quoteAmt += underInsuredPDAmt;
		console.log(quoteAmt);
		$(".quoteAmount").html("$" + quoteAmt);
		console.log(spanValue);
		} else {
			if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
				quoteAmt -= uninsuredMotoristPDCheckedValue;
				uninsuredMotoristPDCheckedValue = 0;
			}
			underInsuredPDAmt = parseInt($(".underinPDAmount").attr("id").substring(7));
				$(".underinPDAmount").html("$" + underInsuredPDAmt);
				$(".quoteAmount").html("$" + quoteAmt);
		}
		
});

/**
	handling uninsured personal injury plan
**/

$("#personalInjury").click(function(){
		 var radioValue = $("input[type='radio']:checked").val();
		 console.log(radioValue);
		 $("#personalInjurySelection").html(radioValue);
		 console.log( $("#personalInjurySelection").text());
		 var personalInjuryAmt = parseInt($(".personalAmount").attr("id").substring(14));
		 console.log(personalInjuryAmt);
		var radioClass = $("input[type='radio']:checked").attr("id"); 
		console.log(radioClass);
		var spanValue = $("#" + radioClass).parent().parent().find('.personalInjuryOption').text();
		
		if(spanValue!= "Current"){
			if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
				quoteAmt -= personalInjuryCheckedValue;
			}
			personalInjuryCheckedValue = parseInt(spanValue.substring(2));
			personalInjuryAmt += personalInjuryCheckedValue;
		$(".personalAmount").html("$" + personalInjuryAmt);
		quoteAmt += personalInjuryAmt;
		console.log(quoteAmt);
		$(".quoteAmount").html("$" + quoteAmt);
		console.log(spanValue);
		} else {
			if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
				quoteAmt -= personalInjuryCheckedValue;
				personalInjuryCheckedValue = 0;
			}
			personalInjuryAmt = parseInt($(".personalAmount").attr("id").substring(14));
				$(".personalAmount").html("$" + personalInjuryAmt);
				$(".quoteAmount").html("$" + quoteAmt);
		}
		
});

//Code for Comprehensive
$("#comprehensive").click(function(){
	 var radioValue = $("input[type='radio']:checked").val();
	 console.log(radioValue);
	 $("#compSelection").html(radioValue);
	 console.log( $("#compSelection").text());
	 var compAmt = parseInt($(".compAmount").attr("id").substring(5));
	 console.log(compAmt);
	var radioClass = $("input[type='radio']:checked").attr("id");
	console.log(radioClass);
	var spanValue = $("#" + radioClass).parent().parent().find('.compOption').text();
	console.log(spanValue);
	if(spanValue!= "Current"){
		if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
			quoteAmt -= compCheckedValue;
		}
	compCheckedValue = parseInt(spanValue.substring(2));
	console.log(compCheckedValue);
	compAmt += compCheckedValue;
	console.log(compAmt);
	$(".compAmount").html("$" + compAmt);
		quoteAmt += compAmt;
	console.log(quoteAmt);
	$(".quoteAmount").html("$" + quoteAmt);
	
	} else {
		if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
			quoteAmt -= compCheckedValue;
			compCheckedValue = 0;
		}
		compAmt = parseInt($(".compAmount").attr("id").substring(5));
			$(".compAmount").html("$" + compAmt);
			$(".quoteAmount").html("$" + quoteAmt);
	}
	
});

//Code for Collision
$("#collision").click(function(){
	 var radioValue = $("input[type='radio']:checked").val();
	 console.log(radioValue);
	 $("#collSelection").html(radioValue);
	 console.log( $("#collSelection").text());
	 var collAmt = parseInt($(".collAmount").attr("id").substring(5));
	 console.log(collAmt);
	var radioClass = $("input[type='radio']:checked").attr("id");
	console.log(radioClass);
	var spanValue = $("#" + radioClass).parent().parent().find('.collOption').text();
	console.log(spanValue);
	console.log(quoteAmt);
	if(spanValue!= "Current"){
		if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
				quoteAmt -= collCheckedValue;
		}
	collCheckedValue = parseInt(spanValue.substring(2));
	console.log(collCheckedValue);
	collAmt += collCheckedValue;
	$(".collAmount").html("$" + collAmt);
		quoteAmt += collAmt;
	console.log(quoteAmt);
	$(".quoteAmount").html("$" + quoteAmt);
	console.log(spanValue);
	} else {
		if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
			quoteAmt -= collCheckedValue;
			collCheckedValue = 0;
		}
		collAmt = parseInt($(".collAmount").attr("id").substring(5));
			$(".collAmount").html("$" + collAmt);
			$(".quoteAmount").html("$" + quoteAmt);
	}
	
});

//Code for Rental
$("#rental").click(function(){
	 var radioValue = $("input[type='radio']:checked").val();
	 console.log(radioValue);
	 $("#rentSelection").html(radioValue);
	 console.log( $("#rentSelection").text());
	 var rentAmt = parseInt($(".rentAmount").attr("id").substring(5));
	 console.log(rentAmt);
	var radioClass = $("input[type='radio']:checked").attr("id");
	console.log(radioClass);
	var spanValue = $("#" + radioClass).parent().parent().find('.rentOption').text();
	console.log(spanValue);
	console.log(quoteAmt);
	if(spanValue!= "Current"){
		if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
			quoteAmt -= rentCheckedValue;
	}
	rentCheckedValue = parseInt(spanValue.substring(2));
	console.log(rentCheckedValue);
	rentAmt += rentCheckedValue;
	$(".rentAmount").html("$" + rentAmt);
	quoteAmt += rentAmt;
	console.log(quoteAmt);
	$(".quoteAmount").html("$" + quoteAmt);
	console.log(spanValue);
	} else {
		if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
			quoteAmt -= rentCheckedValue;
			rentCheckedValue = 0;
		}
		rentAmt = parseInt($(".rentAmount").attr("id").substring(5));
			$(".rentAmount").html("$" + rentAmt);
			$(".quoteAmount").html("$" + quoteAmt);
	}
	
});

//Code for RoadSide
$("#roadside").click(function(){
	 var radioValue = $("input[type='radio']:checked").val();
	 console.log(radioValue);
	 $("#roadSelection").html(radioValue);
	 console.log( $("#roadSelection").text());
	 var roadAmt = parseInt($(".roadAmount").attr("id").substring(5));
	 console.log(roadAmt);
	var radioClass = $("input[type='radio']:checked").attr("id");
	console.log(radioClass);
	var spanValue = $("#" + radioClass).parent().parent().find('.roadOption').text();
	console.log(spanValue);
	console.log(quoteAmt);
	if(spanValue!= "Current"){
		if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
			quoteAmt -= roadCheckedValue;
	}
	roadCheckedValue = parseInt(spanValue.substring(2));
	console.log(roadCheckedValue);
	roadAmt += roadCheckedValue;
	$(".roadAmount").html("$" + roadAmt);
	quoteAmt += roadAmt;
	console.log(quoteAmt);
	$(".quoteAmount").html("$" + quoteAmt);
	console.log(spanValue);
	} else {
		if(quoteAmt > parseInt($(".quoteAmount").attr("id").substring(5))){
			quoteAmt -= roadCheckedValue;
			roadCheckedValue = 0;
		}
		roadAmt = parseInt($(".roadAmount").attr("id").substring(5));
			$(".roadAmount").html("$" + roadAmt);
			$(".quoteAmount").html("$" + quoteAmt);
	}
	
});

});