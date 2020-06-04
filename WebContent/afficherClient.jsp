<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <link type="text/css" rel="stylesheet" href="inc/style.css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p class="info">${client.message}</p>
	<p>Nom : ${client.nomClient}</p>
	<p>Prénom : ${client.prenomClient}</p>
	<p>Adresse : ${client.adresseClient}</p>
	<p>Numéro de téléphone : ${client.telephoneClient}</p>
	<p>Email : ${client.emailClient}</p>
</body>
</html>