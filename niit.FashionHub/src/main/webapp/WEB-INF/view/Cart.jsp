<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
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
     <div class="col-md-6">
<form action="/niit.FashionHub/">
<div class="container" align="center">
<h1>My Cart</h1>
</div>
<table align ="center" border="7">
<th>Cart_ID</th>
<th>Product ID</th>
<th>Product_Name</th>
<th>Brand</th>
<th>Price</th>
<th>Quantity</th>
<th>Subtotal</th>
<th>Remove</th>

<tr>

</tr>
</table>
<div class="container" align="center">
<br><br><input type="submit" value="Continue Shopping"><br><br>
</div>

</form>
  </div>
     </div>
     <div class="col-md-3"></div> 
    </div>
</body>
</html>