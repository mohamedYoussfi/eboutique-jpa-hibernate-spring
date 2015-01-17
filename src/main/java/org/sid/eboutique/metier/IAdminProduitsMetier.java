package org.sid.eboutique.metier;

import org.sid.eboutique.entities.Produit;

public interface IAdminProduitsMetier extends InternauteMetier {
	public Long ajouterProduit(Produit  p, Long idCat);
	public void supprimerProduit(Long idP);
	public void modifierProduit(Produit p); 
}
