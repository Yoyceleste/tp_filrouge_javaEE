package com.jm.tp.beans;

public class Client {
		private String nomClient;
		private String prenomClient;
		private String adresseClient;
		private String telephoneClient;
		private String emailClient;
		private String message;

		public String getNomClient() {
			return nomClient;
		}

		public void setNomClient(String nomClient) {
			this.nomClient = nomClient;
		}

		public String getPrenomClient() {
			return prenomClient;
		}

		public void setPrenomClient(String prenomClient) {
			this.prenomClient = prenomClient;
		}

		public String getAdresseClient() {
			return adresseClient;
		}

		public void setAdresseClient(String adresseClient) {
			this.adresseClient = adresseClient;
		}

		public String getTelephoneClient() {
			return telephoneClient;
		}

		public void setTelephoneClient(String telephoneClient) {
			this.telephoneClient = telephoneClient;
		}

		public String getEmailClient() {
			return emailClient;
		}

		public void setEmailClient(String emailClient) {
			this.emailClient = emailClient;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}