package com.jm.tp.beans;

public class Commande {
	private Client client;
	private String dateCommande;
	private Double montantCommande;
	private String modePaimentCommande;
	private String statutPaiementCommande;
	private String modeLivraisonCommande;
	private String statutLivraisonCommande;

	public String getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}
	public Double getMontantCommande() {
		return montantCommande;
	}
	public void setMontantCommande(Double montantCommande) {
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
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
}
