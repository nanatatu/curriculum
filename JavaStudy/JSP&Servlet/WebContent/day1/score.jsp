<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="day1.model.*"%>

<%
	Team[] teams = new Team[2];
	teams[0]=new Team("巨人",new String[]{"0","0","2","2","0","3","2","0","0","0","1"});
	teams[1]=new Team("阪神",new String[]{"2","0","0","1","0","0","1","0","5","0","2x"});
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>スコアボード</title>
<link rel="stylesheet" href="css/main.css" />
</head>
<body>
	<table>
	<tr>
	<th></th>
	<%for(int i = 1; i <= teams[0].getScore().length; i++) { %>
		<td><%= i %></td>
	<% } %>
	<th>計</th></tr>
	<%for(int i = 0; i<teams.length;i++) { %>
	<tr>
	<th><%= teams[i].getName()  %></th>
	<%for (int j = 0; j<teams[i].getScore().length; j++) { %>
	<td><%=teams[i].getScore()[j] %></td>
	<% } %>
	<td><%= teams[i].getTotalScore() %></td>
	</tr>
	<% } %>
	</table>
</body>
</html>