
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html ng-app="autoInsurance">

<head>
    <link rel="stylesheet" href="public/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="public/bower_components/bootstrap/dist/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="public/css/style.css">
    <link rel="stylesheet" href="public/css/driverPage.css">
    <link href="public/css/navbar.css" rel="stylesheet">
    <script src="public/bower_components/jquery/dist/jquery.min.js"></script>
    <script src="public/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="public/bower_components/angular/angular.js"></script>
    <script src="public/bower_components/angular-ui-router/release/angular-ui-router.min.js"></script> 
</head>

<body >
    <div class="container-fluid" ng-controller="mainCtrl">
        <div custom-header></div>
       
      <!--   <div id="main" ng-include="templates.tabsUrl"></div> -->
         <div ui-view ></div>
        
    </div>
 <!-- <div ng-include="templates.footerUrl" id="footer"></div> -->
   <!--   <script src= "app/js/index.js"></script> -->

   <script src="public/app/modules/modules.js"></script>
   <script src="public/app/app.js"></script>
    <script src= "public/app/configuration/config.js"></script>
    <script src= "public/app/components/customHeader.js"></script>
    <script src= "public/app/components/customLogo.js"></script>
    <script src= "public/app/components/startPage.js"></script>
    <script src= "public/app/components/vehicles.js"></script>
    <script src= "public/app/components/driverPage.js"></script>
    <script src= "public/app/components/stateController.js"></script>
    <script src= "public/app/components/formController.js"></script>
    <!-- <script src="app/components/route.js"></script> -->
   
    
</body>

</html>


