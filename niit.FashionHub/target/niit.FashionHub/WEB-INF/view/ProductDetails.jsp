<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<c:url var="a" value="/resources/image"/>
	
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
<form action="cart/${product.product_id}">
<div class="container-fluid">
  <div class="row">
     <div class="col-md-12">
       <nav class="navbar navbar-inverse">
         <div class="container-fluid">
           <div class="navbar-header">
               <a class="navbar-brand" style="color:white" href="#">@NiitFashionHub</a>
           </div>
            <ul class="nav navbar-nav">
             <li><a style="color:white" href="/niit.FashionHub/Admin"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Back</a></li>
            </ul>
           <ul class="nav navbar-nav navbar-right">
              <li><a style="color:white" href="signout"><span class="glyphicon glyphicon-user"></span> Sign-Out</a></li>
           </ul>
           </div>
       </nav>
     </div>
  </div>

  <div class="row">
     <div class="col-md-3"></div>
     <div class="col-md-4">  
      <img src="${a}/${product.product_id}.jpg" class="img-responsive" style="width:40%;height:40%" alt="Image" align="middle">
     </div>
  	 <div class="col-sm-5">
  	 Product ID: ${product.product_id}<br>
     <br>
     Name:${product.name}<br>
     <br>
     Brand:${product.brand}<br>
     <br>
     Price:${product.price}<br>
     <br>
     Description:${product.description}<br>
     <br>
     Quantity:  <input type="number" value="1" name="q"/><br><br>
     <input type="submit" value="AddtoCart"/> 
  	</div>
 

 </div>
  	</div>
 
</form>



</body>
</html>