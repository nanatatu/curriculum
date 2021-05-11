<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int x=Integer.parseInt(request.getParameter("x"));
	int y=Integer.parseInt(request.getParameter("y"));
	int sum = x + y;
	int sub = x - y;
	int mlt = x * y;
	int div = x / y;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>演算結果</title>
</head>
<body>
	<%=x %>と<%=y %>の和は<%=sum %>です。<br>
	<%=x %>と<%=y %>の減は<%=sub %>です。<br>
	<%=x %>と<%=y %>の積は<%=mlt %>です。<br>
	<%=x %>と<%=y %>の商は<%=div %>です。<br>
	<a href="plus.jsp">戻る</a>
</body>
</html>