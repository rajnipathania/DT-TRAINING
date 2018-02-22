<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="F"%>
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
              <F:form action="signup" method="post">
                     <h2>SIGN-UP</h2>
                     <div class="form-group">
     				        <label>Name</label>
                     <F:input path="name" placeholder="Name" class="form-control" />
                     </div>

                     <div class="form-group">
     				        <label>Username</label>
                     <F:input path="username" placeholder="Username" class="form-control" />
                     </div>

                     <div class="form-group">
     				        <label>Email-ID</label>
                     <F:input path="email" placeholder="Email" class="form-control" />
                     </div>

                     <div class="form-group">
     				        <label>Gender</label><br>
                     <F:radiobutton path="gender" value="Male"/>Male&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                     <F:radiobutton path="gender" value="Female"/>Female<br>
                     </div>

                     <div class="form-group">
     				        <label>Contact Num</label>
                     <F:input path="contact" placeholder="Contact Num" class="form-control"/>
                     </div>

                     <div class="form-group">
     				        <label>Password</label>
                     <F:password path="password" placeholder="Password" class="form-control" />
                     </div>

                     <div class="form-group">
     				        <label>Address</label>
                     <F:input path="address" placeholder="Address" class="form-control" />
                     </div>

                     <input type="submit" value="Register" class="btn btn-success btn-sm" />
                 </F:form>
        </div>
       <div class="col-md-3"></div>
  </div>
</div>
</body>
</html>
