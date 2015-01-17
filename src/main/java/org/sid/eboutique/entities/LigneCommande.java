package org.sid.eboutique.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class LigneCommande implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
	@ManyToOne
	@JoinColumn(name="idProduit")
  private Produit produit;
  private int quantite;
  private double prix;
  @ManyToOne
	@JoinColumn(name="idCommande")
  private Commande commande;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Produit getProduit() {
	return produit;
}
public void setProduit(Produit produit) {
	this.produit = produit;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Commande getCommande() {
	return commande;
}
public void setCommande(Commande commande) {
	this.commande = commande;
}
public LigneCommande() {
	super();
	// TODO Auto-generated constructor stub
}
public LigneCommande(int quantite, double prix) {
	super();
	this.quantite = quantite;
	this.prix = prix;
}
  
  
}
