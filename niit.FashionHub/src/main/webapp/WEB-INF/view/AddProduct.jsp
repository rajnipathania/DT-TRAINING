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
</head>
<body>
<div class="container">
   <div class="row">
    <div class="col-md-9">
     <F:form action="addproduct" modelAttribute="product" method="post" enctype="multipart/form-data">
     <h1>Add Product</h1>
	     <div class="form-group">
		       	<label>Product ID</label>
               <F:input path="product_id"  placeholder="Product ID" class="form-control" />
               </div>

               	<div class="form-group">
				<label>Product Name</label>
                <F:input path="name" placeholder="Product Name" class="form-control"/>
                </div>

                <div class="form-group">
				<label>Product Brand</label>
                <F:input path="brand" placeholder="Brand" class="form-control"/>
                </div>

                <div class="form-group">
				<label>Product Price</label>
                <F:input path="price" placeholder="Product Price" class="form-control"/>
                </div>

                <div class="form-group">
				<label>Description</label>
                <F:input path="description" placeholder="Description" class="form-control"/>
                </div>
                <div class="form-group">
				<label>Supplier Name</label>
                <F:select path="supplier" class="form-control">
                <F:option value="None" label="Supplier Name"/>
                <F:options items="${ListS}"/>
                </F:select>
                </div>

                <div class="form-group">
				<label>Category Name</label>
                <F:select path="category" class="form-control" >
                <F:option value="None" label="Category Name"/>
                <F:options items="${ListC}" />
                </F:select>
                </div>

                <div class="form-group">
				<label>Add Image:</label> 
                <F:input path="image" type="file" class="form-control"/>
                </div>
                <input type="submit" value="Add" style="width:150px;height:40px;" class="btn btn-success btn-sm" /><br/><br/>
                <a href="admin/viewP"><span class="glyphicon glyphicon-edit"></span>View Product</a>
    </F:form>
    </div>
    <div class="col-md-3"></div>
    </div>
  </div>
</body>
</html>