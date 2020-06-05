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
	<p class="info">${commande.message}</p>
	<p>Client</p>
	<p>Nom : ${commande.nomClient}</p>
	<p>Prénom : ${commande.prenomClient}</p>
	<p>Adresse : ${commande.adresseClient}</p>
	<p>Numéro de téléphone : ${commande.telephoneClient}</p>
	<p>Email : ${commande.emailClient}</p>
	<p>Commande</p>
	<p>Date : ${commande.dateCommande}</p>
	<p>Montant : ${commande.montantCommande}</p>
	<p>Mode de paiment : ${commande.modePaimentCommande}</p>
	<p>Statut du paiement : ${commande.statutPaiementCommande}</p>
	<p>Mode de livraison : ${commande.modeLivraisonCommande}</p>
	<p>Statut de livraison : ${commande.statutLivraisonCommande}</p>
</body>
</html>