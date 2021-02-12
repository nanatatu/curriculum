<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">

<title>ログインページ</title>
</head>
<body>
<!-- name,idの入力エリアを作成しなさい -->
	<%@ include file="header.jsp" %>

<div id="jspTest">
    <table>
        <tr>
		        <td align="center"><label for="name">name</label></td>
		        <td><input type="text" id="username" name="name"></td>
        </tr>
        <tr>
                <td align="center"><label for="id">id</label></td>
                <td><input type="text" id="userid" name="id"></td>
        </tr>
    </table>
</div>

<%@ include file="footer.jsp" %>

</body>
</html>