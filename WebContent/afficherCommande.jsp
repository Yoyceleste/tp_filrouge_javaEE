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
	<p class="info">${message}</p>
	<p class="erreur">${messageErreur}</p>
	<p>Client</p>
	<p>Nom : ${client.nomClient}</p>
	<p>Prénom : ${client.prenomClient}</p>
	<p>Adresse : ${client.adresseClient}</p>
	<p>Numéro de téléphone : ${client.telephoneClient}</p>
	<p>Email : ${client.emailClient}</p>
	<p>Commande</p>
	<p>Date : ${commande.dateCommande}</p>
	<p>Montant : ${commande.montantCommande}</p>
	<p>Mode de paiment : ${commande.modePaimentCommande}</p>
	<p>Statut du paiement : ${commande.statutPaiementCommande}</p>
	<p>Mode de livraison : ${commande.modeLivraisonCommande}</p>
	<p>Statut de livraison : ${commande.statutLivraisonCommande}</p>
</body>
</html>