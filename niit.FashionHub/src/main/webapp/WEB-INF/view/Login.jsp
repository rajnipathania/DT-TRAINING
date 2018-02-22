<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>@NiitFashionHub</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  
  </head>
<body>
${msg}
  <div class="container">
  <div class="row">
     <div class="col-md-12"><c:import url="/header"></c:import></div>
  </div>

  <div class="row">
       <div class="col-md-3"></div>
       <div class="col-md-6">
        <h1>Welcome To NiitFashionHub</h1>
        <h2>LogIn</h2>
        <br/>
        <br/>
          <form class="signin" action="processLogin" method="post">
          <div class="form-group">
          <label>USER NAME</label><br/>           
          <input type="text" name="username" placeholder="Username" />
          </div>
          <div class="form-group">
          <label>PASSWORD</label><br/>
          <input type="password" name="password" placeholder="Password" />
          </div>
          <input type="submit" value="Sign In" class="btn btn-success btn-sm" />
          <div class="remember-forgot">
          <div class="checkbox"><label><input type="checkbox" />Remember Me</label></div>
          </div>
          </form>
       </div>
       <div class="col-md-3"></div>
   </div>
 </div>
 </body>
</html>
 