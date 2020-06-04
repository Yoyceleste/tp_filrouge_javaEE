package com.jm.tp.beans;

public class Client {
		private String nomClient;
		private String prenomClient;
		private String adresseClient;
		private String telephoneClient;
		private String emailClient;

		public String getNom() {
			return this.nomClient;
		}

		public String getPrenom() {
			return this.prenomClient;
		}
		
		public String getAdressedelivraison() {
			return this.adresseClient;
		}
		
		public String getNumérodetéléphone() {
			return this.telephoneClient;
		}
		
		public String getAdresseemail() {
			return this.emailClient;
		}
	}