package com.jm.tp.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jm.tp.beans.Commande;

public class CreationCommande extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/* Création du bean */
		Commande commande = new Commande();
		/* Initialisation de ses propriétés */
		commande.setNomClient(request.getParameter("nomClient"));
		commande.setPrenomClient(request.getParameter("prenomClient"));
		commande.setAdresseClient(request.getParameter("adresseClient"));
		commande.setTelephoneClient(request.getParameter("telephoneClient"));
		commande.setEmailClient(request.getParameter("emailClient"));
		commande.setDateCommande(request.getParameter("dateCommande"));
		commande.setMontantCommande(request.getParameter("montantCommande"));
		commande.setModePaimentCommande(request.getParameter("modePaiementCommande"));
		commande.setStatutPaiementCommande(request.getParameter("statutPaiementCommande"));
		commande.setModeLivraisonCommande(request.getParameter("modeLivraisonCommande"));
		commande.setStatutLivraisonCommande(request.getParameter("statutLivraisonCommande"));

		if (commande.getNomClient().isEmpty() || commande.getAdresseClient().isEmpty()
				|| commande.getTelephoneClient().isEmpty()) {
			commande.setMessage("Erreur - Vous n'avez pas rempli tous les champs obligatoire.<br><a href='/tp1/creerCommande.jsp'>Clique ici</a> pour accéder au formulaire de création d'un client.");
		} else {
			commande.setMessage("Client créé avec succès !");
		}

		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		commande.setDateCommande(format.format(date));
		
		request.setAttribute("commande", commande);

		/* Transmission de la paire d'objets request/response à notre JSP */
		this.getServletContext().getRequestDispatcher("/afficherCommande.jsp").forward(request, response);
	}
}
