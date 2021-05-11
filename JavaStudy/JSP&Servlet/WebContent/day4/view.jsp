<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
	名前:<input type="text" id="name" name="name"><br>
	性別:
	<input type="radio" name="sex" value="男">男
	<input type="radio" name="sex" value="女">女<br>
	生年月日:<input type="date" id="birth" name="birth"><br>
	血液型:
	<select name="blood">
		<option value="A">A</option>
		<option value="B">B</option>
		<option value="O">O</option>
		<option value="AB">AB</option>
	</select><br>
	<input type="submit" value="送信">
	</form>

</body>
</html>