<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="F"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
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
           </div>
       </nav>
     </div>
  </div>
  <div class="row">
     <div class="col-md-3"></div>
     <div class="col-md-6">
                <F:form class="login" action="editproduct">
                <h1>Edit Product</h1>
                <F:hidden path="product_id" placeholder="Product ID" />
                <div class="form-group">
                <label>Product Name</label><br/>
                <F:input path="name" placeholder="Product Name" />
                </div>
                <div class="form-group">
                <label>Brand Name</label><br/>
                <F:input path="brand"  placeholder="Brand" />
                </div>
                <div class="form-group">
                <label>Price</label><br/>
                <F:input path="price"  placeholder="Product Price"/>
                </div>
                <div class="form-group">
                <label>Description</label><br/>
                <F:input path ="description" placeholder="Description"/>
                </div>
                <input type="submit" value="SaveEdit" class="btn btn-success btn-sm" />
                  </F:form>
     </div>
     <div class="col-md-3"></div>
 </div> 
 </div>
</body>
</html>