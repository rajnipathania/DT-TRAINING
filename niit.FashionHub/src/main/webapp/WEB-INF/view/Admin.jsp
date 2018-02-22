<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="F"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>@NiitFashionHub</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
  $(document).ready(function () {
  			  $(".navbar-toggle").on("click", function () {
  				    $(this).toggleClass("active");
  			  });
  			 $('.dropdown-toggle').dropdown();
  		});
</script>
</head>
<body>
<div class="container-fluid">
  <div class="row">
     <div class="col-md-12">
       <nav class="navbar navbar-inverse">
         <div class="container-fluid">
           <div class="navbar-header">
               <a class="navbar-brand" style="color:white" href="#">@NiitFashionHub</a>
           </div>
           <ul class="nav navbar-nav navbar-right">
              <li><a style="color:white" href="signout"><span class="glyphicon glyphicon-user"></span> Sign-Out</a></li>
           </ul>
           </div>
       </nav>
     </div>
  </div>

  <div class="row">
     <div class="col-md-3"></div>
     <div class="col-md-6">
            <h1>Welcome Admin to Add Record</h1>
         <div id="exTab1" class="container">
             <ul  class="nav nav-pills">
       			<li class="active"><a  href="#1a" data-toggle="tab">PRODUCT</a></li>
       			<li><a href="#2a" data-toggle="tab">SUPPLIER</a></li>
       			<li><a href="#3a" data-toggle="tab">CATEGORY</a></li>
             </ul>

             <div class="tab-content clearfix">
       		   <div class="tab-pane active" id="1a"><c:import url="/admin/addP"></c:import></div>
       		   <div  class="tab-pane" id="2a"><c:import url="/admin/addS"></c:import></div>
               <div class="tab-pane" id="3a"><c:import url="/admin/addC"></c:import></div>
         </div>
       </div>
     </div>
     <div class="col-md-3"></div> 
       

     </div>
</div>
</body>
</html>