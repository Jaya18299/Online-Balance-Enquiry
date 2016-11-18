<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="update" method="get">
    <input type="number" name="cust_id" placeholder="Customer Id" required="required" />
    <input type="text" name="cust_name" placeholder="Customer Name" required="required" />
    <input type="number" name="cust_phone" placeholder="Phone" required="required" />
    <input type="number" name="cust_ttb" placeholder="Customer Talk Time Available" required="required" />
    <input type="text" name="cust_databal" placeholder="Custmomer Data Balance" required="required" />
    <input type="text" name="cust_messagebal" placeholder="Custmomer Message Balance" required="required" />
    <input type="submit" value="Update">
  </form>
  <div>
    <a href="home.jsp">Home</a>
  </div>
</body>
</html>