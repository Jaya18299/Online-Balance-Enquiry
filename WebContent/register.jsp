<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Add Customer</title>
</head>
<body>
  <form action="register" method="post">
    <input type="number" name="cust_id" placeholder="Customer Id" required="required" />
    <input type="text" name="cust_name" placeholder="Customer Name" required="required" />
    <input type="number" name="cust_phone" placeholder="Phone" required="required" />
    <input type="number" name="cust_ttb" placeholder="Customer Talk Time " required="required" />
    <input type="text" name="cust_databal" placeholder="Custmomer Data Balance" required="required" />
    <input type="text" name="cust_messagebal" placeholder="Customer Message Balance" required="required" />
    <input type="submit" value="Register">
  </form>
  <div>
    <a href="home.jsp">Home</a>
  </div>
</body>
</html>