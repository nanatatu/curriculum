<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(request.getParameter("btn") == null) { %>
	<form>
	<p>お使いのOSを選んでください</p>
	<input type="checkbox" name="os" value="win">Windows
	<input type="checkbox" name="os" value="mac">Mac
	<input type="checkbox" name="os" value="linux">Linux
	<input type="submit" name="btn" value="送信">
	</form>
<%} else {
	String[] oss=request.getParameterValues("os");
	String result = oss == null ? "選択なし" : String.join(",",oss);
%>
	<p><%=result %></p>
<%} %>
</body>
</html>