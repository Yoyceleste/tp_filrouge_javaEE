package com.jm.tp.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jm.tp.beans.Client;
import com.jm.tp.beans.Commande;

public class CreationCommande extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/* Récupération des valeurs */
		String nomClient = request.getParameter("nomClient");
		String prenomClient = request.getParameter("prenomClient");
		String adresseClient = request.getParameter("adresseClient");
		String telephoneClient = request.getParameter("telephoneClient");
		String emailClient = request.getParameter("emailClient");
		String dateCommande = request.getParameter("dateCommande");
		String montantCommande = request.getParameter("montantCommande");
		String modePaiementCommande = request.getParameter("modePaiementCommande");
		String statutPaiementCommande = request.getParameter("statutPaiementCommande");
		String modeLivraisonCommande = request.getParameter("modeLivraisonCommande");
		String statutLivraisonCommande = request.getParameter("statutLivraisonCommande");

		/* Création du bean Client */
		Client client = new Client();
		/* Initisialisation du bean Client */
		client.setNomClient(nomClient);
		client.setPrenomClient(prenomClient);
		client.setAdresseClient(adresseClient);
		client.setTelephoneClient(telephoneClient);
		client.setEmailClient(emailClient);

		/* Création du bean */
		Commande commande = new Commande();

		/* Initialisation de ses propriétés */
		commande.setClient(client);
		commande.setDateCommande(dateCommande);
		commande.setModePaimentCommande(modePaiementCommande);
		commande.setStatutPaiementCommande(statutPaiementCommande);
		commande.setModeLivraisonCommande(modeLivraisonCommande);
		commande.setStatutLivraisonCommande(statutLivraisonCommande);

		String messageErreur = "";
		
		try {
			Double d = Double.valueOf(montantCommande);
			commande.setMontantCommande(d);
		} catch (Exception e) {
			commande.setMontantCommande(-1d);
			messageErreur = "Veuillez saisir un montant en nombre !";
		}

		if (nomClient.isEmpty() || adresseClient.isEmpty() || telephoneClient.isEmpty()) {
			request.setAttribute("message",
					"Erreur - Vous n'avez pas rempli tous les champs obligatoire.<br><a href='/tp1/creerCommande.jsp'>Clique ici</a> pour accéder au formulaire de création d'une commande.");
		} else if (messageErreur.isEmpty()){
			request.setAttribute("message", "Commande créé avec succès !");
		}

		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();

		commande.setDateCommande(format.format(date));

		request.setAttribute("commande", commande);
		request.setAttribute("client", commande.getClient());
		request.setAttribute("messageErreur", messageErreur);

		/* Transmission de la paire d'objets request/response à notre JSP */
		this.getServletContext().getRequestDispatcher("/afficherCommande.jsp").forward(request, response);
	}
}
