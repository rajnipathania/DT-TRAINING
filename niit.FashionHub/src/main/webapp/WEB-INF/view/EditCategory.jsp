<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
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
     <F:form class="login" action="/admin/editcategory">
                    <h1>Edit Category</h1>
                    <F:hidden path="category_id" />
                    <div class="form-group">
                    <label>Category Name</label><br/>
                    <F:input path="category_name" placeholder="Category Name" class="form-control"/>
                    </div>
                    <div class="form-group">
                    <label>Category Description</label><br/>
                    <F:input path ="category_description" placeholder="Description" class="form-control"/>
                    </div>
            				<input type="submit" value="SaveEdit" class="btn btn-success btn-sm" />
                    </F:form>
     </div>
     <div class="col-md-3"></div>
 </div> 
 </div>
</body>
</html>