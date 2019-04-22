<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Home Page</title>
</head>
<body>
	<h2>Anasayfaya Hoşgeldin ${user.username}</h2><br/>
	<p>7,7,7,7,1  sayılarından 100 elde etme sorusunun cevabı için şöyle düşündüm.
	   Bana 4 işlem ve sayıları birkez kullanmam dışında başka birşey söylemediğiniz için
	   şöyle olabileceğini düşünüyorum   177 - 77 = 100   :) </p><br/>
	   <a href="${pageContext.request.contextPath}/login">Sign Out</a>
</body>
</html>