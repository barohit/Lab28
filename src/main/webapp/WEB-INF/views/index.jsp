<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello World!
	${forecast}
	<form action="weather">
		Latitude: <input type="text" name="lat">
		Longitude: <input type="text" name="lon">
		<input type="submit">
	</form>
</body>
</html>