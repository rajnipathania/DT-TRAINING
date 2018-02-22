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
</head>
<body>

<div class="container">
 <div class="row">
  <div class="col-md-9">
  <F:form class="login" action="addsupplier">
  <h1>Add Supplier</h1>
  <div class="form-group">
  <label>Supplier Id</label><br/>
  <F:input path="supplier_id" placeholder="Supplier ID" class="form-control"  />
  </div>

  <div class="form-group">
  <label>Supplier Name</label><br/>
  <F:input path="supplier_name" placeholder="Supplier Name" class="form-control" />
  </div>

  <div class="form-group">
  <label>Supplier Address</label><br/>
  <F:input path="supplier_address" placeholder="Address" class="form-control" />
  </div>
  <input type="submit" value="Add" style="width:150px;height:40px;" class="btn btn-success btn-sm" /><br/><br/>
    <a href="admin/viewS"><span class="glyphicon glyphicon-edit"></span>View Supplier</a>
    </F:form>
  </div>
  <div class="col-md-3"></div>
  </div>
</div>
</body>
</html>