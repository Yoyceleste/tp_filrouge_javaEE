package com.jm.tp.beans;

public class Commande {
	private String nomClient;
	private String prenomClient;
	private String adresseClient;
	private String telephoneClient;
	private String emailClient;
	private String message;
	private String dateCommande;
	private String montantCommande;
	private String modePaimentCommande;
	private String statutPaiementCommande;
	private String modeLivraisonCommande;
	private String statutLivraisonCommande;
	
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
	public String getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}
	public String getMontantCommande() {
		return montantCommande;
	}
	public void setMontantCommande(String montantCommande) {
		this.montantCommande = montantCommande;
	}
	public String getModePaimentCommande() {
		return modePaimentCommande;
	}
	public void setModePaimentCommande(String modePaimentCommande) {
		this.modePaimentCommande = modePaimentCommande;
	}
	public String getStatutPaiementCommande() {
		return statutPaiementCommande;
	}
	public void setStatutPaiementCommande(String statutPaiementCommande) {
		this.statutPaiementCommande = statutPaiementCommande;
	}
	public String getModeLivraisonCommande() {
		return modeLivraisonCommande;
	}
	public void setModeLivraisonCommande(String modeLivraisonCommande) {
		this.modeLivraisonCommande = modeLivraisonCommande;
	}
	public String getStatutLivraisonCommande() {
		return statutLivraisonCommande;
	}
	public void setStatutLivraisonCommande(String statutLivraisonCommande) {
		this.statutLivraisonCommande = statutLivraisonCommande;
	}
}
