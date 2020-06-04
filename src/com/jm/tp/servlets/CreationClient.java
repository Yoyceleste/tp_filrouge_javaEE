package com.jm.tp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jm.tp.beans.Client;

public class CreationClient extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/* Création du bean */
		Client client = new Client();
		/* Initialisation de ses propriétés */
		client.setNomClient(request.getParameter("nomClient"));
		client.setPrenomClient(request.getParameter("prenomClient"));
		client.setAdresseClient(request.getParameter("adresseClient"));
		client.setTelephoneClient(request.getParameter("telephoneClient"));
		client.setEmailClient(request.getParameter("emailClient"));

		if (client.getNomClient().isEmpty() || client.getAdresseClient().isEmpty()
				|| client.getTelephoneClient().isEmpty()) {
			client.setMessage("Erreur - Vous n'avez pas rempli tous les champs obligatoire.<br><a href='/tp1/creerClient.jsp'>Clique ici</a> pour accéder au formulaire de création d'un client.");
		} else {
			client.setMessage("Client créé avec succès !");
		}

		request.setAttribute("client", client);

		/* Transmission de la paire d'objets request/response à notre JSP */
		this.getServletContext().getRequestDispatcher("/afficherClient.jsp").forward(request, response);
	}
}
