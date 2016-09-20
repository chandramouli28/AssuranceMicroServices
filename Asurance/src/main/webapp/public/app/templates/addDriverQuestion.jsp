<!DOCTYPE html>
<html lang="en">
<head>
  <title>AddDriverQuestionnare</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style> 
        .form-horizontal .control-label{
                text-align: left;}
        hr.line{
                border: 0;
    height: 1px;
    background-image: linear-gradient(to right, rgba(0, 0, 0, 0), rgba(0, 0, 0, 0.75), rgba(0, 0, 0, 0));
            }
        .usericon input {
    padding-left:25px;
}
.usericon:before {
    height: 70%;
    width: 25px;
    display: -webkit-box;
    -webkit-box-pack: center;
    -webkit-box-align: center;
    position: absolute;
    content: "\e008";
    font-family: 'Glyphicons Halflings';
    pointer-events: none;
}
li {
	cursor: pointer;
	cursor: hand;
}
         </style>
</head>
<body>

<div class="container">
    
  <form class="form-horizontal" novalidate>
       <div class="col-sm-3">
        <label class="form-group">
            <span class="usericon">
                <input class="form-control" id="name" placeholder="First Name" name="fName" required/>
            </span>
        </label> 
          </div>
      
      <div class="col-sm-1">
          <label class="form-group">
            <input class="form-control" name="mi" type="text" placeholder="MI">
         </label> 
          </div>
      
      <div class="col-sm-3">
           <label class="form-group ">
            <input class="form-control" name="lName" type="text" placeholder="Last Name" required>
         </label></div> 
          
      <div>
          <div class="col-sm-2">
          <label class="form-group">
             <select class="form-control" name="suffix">
        <option value="">Suffix</option>
        <option value="Mr">Mr</option>
        <option value="Mrs">Mrs</option>
      </select>
         </label> 
      </div>
      <div class="col-sm-12">
          <hr class="line"></div>
       
      <div class="form-group">
      
           <label class="col-sm-3 control-label">Gender</label>
            <div class="col-sm-9">
    <label class="radio-inline">
      <input type="radio" name="gender" value="male" checked>Male 
    </label>
    <label class="radio-inline">
      <input type="radio" name="gender" value="female">Female 
    </label>
      </div>
      </div>
      
           <div class="form-group">
       
          <label class="col-sm-3 control-label">Date of Birth</label>
            <div class="col-sm-4">
             <input class="form-control" name="dob"  type="date" required/>
                 </div>
          </div> 
          
          <div class="form-group">
      
           <label class="col-sm-3 control-label">Insure this person on the policy ?</label>
            <div class="col-sm-9">
    <label class="radio-inline">
      <input type="radio" name="insure" value="yes">Yes 
    </label>
    <label class="radio-inline">
      <input type="radio" name="insure" value="no">No 
    </label>
      </div>
      </div>
    
       <div class="form-group">
       <label class="col-sm-3 control-label">Marital Status</label>
            <div class="col-sm-4">
            <select class="form-control" name="marital">
         <option value=""></option>
        <option value="Single">Single</option>
        <option value="Married">Married</option>
        <option value="Divorced">Divorced</option>
      </select>
      </div> 
      </div>
      
       <div class="form-group">
       <label class="col-sm-3 control-label">Relationship to the Driver 1</label>
            <div class="col-sm-4">
            <select class="form-control" name="relation">
         <option value=""></option>
        <option value="Spouse">Spouse</option>
        <option value="Son">Son</option>
         <option value="Daughter">Daughter</option> 
         <option value="Parents">Parents</option>
        <option value="Siblings">Siblings</option>
        <option value="Cousins">Cousins</option>
      </select>
      </div> 
      </div>
          
          <hr class="line">         
       <h3>Driving History</h3>  
       
      <div class="form-group">
       <label class="col-sm-3 control-label">US.License Status </label>
            <div class="col-sm-4">
            <select class="form-control" name="licenseStatus">
        <option value="Valid">Valid</option>
        <option value="Invalid">Invalid</option>
      </select>
      </div> 
      </div>
      
      <div class="form-group">
       <label class="col-sm-3 control-label">Years Licensed </label>
            <div class="col-sm-4">
            <select class="form-control" name="licensedYears">
         <option value=""></option>
        <option value="2016">2016</option>
        <option value="2015">2015</option>
        <option value="2014">2014</option>
        <option value="2013">2013</option>
        <option value="2012">2012</option>
        <option value="2011">2011</option>
      </select>
      </div> 
      </div>
        <hr class="line">
      
      <h3>Additional Information</h3>
      
      <div class="form-group">
       <label class="col-sm-3 control-label">Primary Email Address<br><small>(We will NOT sell your email address.)</small></label>
            <div class="col-sm-4">
            <input class="form-control" name="emailPrimary" type="email" required>
           </div> 
      </div>
      
      <div class="form-group">
       <label class="col-sm-3 control-label">How many residents live in the home?<br><small>(Including drivers on quote,excluded drivers,children and roommates.)</small></label>
            <div class="col-sm-4">
            <input class="form-control" name="residents" type="number" min="1" max="10" required>
         
      </div> 
      </div>
        <hr class="line">
      <h3>Accidents, Violations and Claims</h3>
      <p>As a driver you had any(regardless of fault):</p>
      
     <div class="form-group">
      <label class="col-sm-5 control-label">Accidents, claims or other damages you had to your vehicle (last 5years/october 2011):<br><small>eg:Hitting a car/object/property/animal, car hits you ,weather,vandalism,theft,hail</small></label>
            <div class="col-sm-5">
    <label class="radio-inline">
      <input type="radio" name="accidents" value="yes">Yes 
    </label>
    <label class="radio-inline">
      <input type="radio" name="accidents" value="no">No 
    </label>
      </div>
      </div>    
      
         <div class="form-group">
      <label class="col-sm-5 control-label">Tickets or Violations (last 3 years/oct 2013):</label>
            <div class="col-sm-5">
    <label class="radio-inline">
      <input type="radio" name="tickets" value="yes">Yes 
    </label>
    <label class="radio-inline">
      <input type="radio" name="tickets" value="no">No 
    </label>
      </div>
       </div> 
          <hr class="line">
       
            
      <label class="col-sm-10 control-label"><a href="#"><ins>< Back </ins></a></label><div class="col-sm-2">
      <input type="submit" class="btn btn-primary btn-lg" value="Save & Continue">
      </div>           
  </form>
</div>

</body>
</html>

