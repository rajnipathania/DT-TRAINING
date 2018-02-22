<%@page isELIgnored="false" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
  <title>@NiitFashionHub</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
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
  <div class="container-fluid">
  <div class="row">
     <div class="col-md-12">
       <nav class="navbar navbar-inverse">
         <div class="container-fluid">
           <div class="navbar-header">
               <a class="navbar-brand" style="color:white" href="#">@NiitFashionHub</a>
           </div>

           <ul class="nav navbar-nav">
             <li><a style="color:white" href="/niit.FashionHub"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>


             <li class="dropdown">
             <a class="dropdown-toggle" style="color:white" data-toggle="dropdown" href="#">Category
             <span class="caret"></span></a>
             <ul class="dropdown-menu">
             <c:forEach var="category" items="${ListC}">
             <li><a href="product/${category.category_name}">${category.category_name}</a></li>
          	 </c:forEach>
             </ul>
             </li>

             <li class="dropdown">
               <a class="dropdown-toggle" style="color:white" data-toggle="dropdown" href="#">Brand
             <span class="caret"></span></a>
             <ul class="dropdown-menu">
             <li><a href="#"> Levi's</a></li>
             <li><a href="#"> Wrangler</a></li>
             <li><a href="#"> Calvin Klein</a></li>
             <li><a href="#"> Adam Tuckers</a></li>
             <li><a href="#"> Adidas</a></li>
             <li><a href="#"> Versace</a></li>
             </ul>
             </li>
           </ul>
           <ul class="nav navbar-nav navbar-right">
             <li><a style="color:white" href="ContactUs"> <span class="glyphicon glyphicon-envelope"></span> Contact Us</a></li>
             <li><a style="color:white" href="Register"><span class="glyphicon glyphicon-user"></span> Sign-Up</a></li>
             <li><a style="color:white" href="Login"><span class="glyphicon glyphicon-log-in"></span> Sign-In</a></li>
           </ul>
           </div>
       </nav>
     </div>
  </div>

</div>
</body>
</html>