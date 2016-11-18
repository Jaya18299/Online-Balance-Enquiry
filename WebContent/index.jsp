<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Online Balance Enquiry</h3>
    <form action="login" method="post">
    
    <div class="input-container">
        <input type="text" id="UserId" name="user_Id" required="required"/>
        <label for="Username">UserName</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="password" id="Password" name="user_Password" required="required"/>
        <label for="Password">Password</label>
        <div class="bar"></div>
        <div class="button-container">
        <button><span>Submit</span></button>
      </div>
      </form>
</body>
</html>
