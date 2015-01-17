package org.sid.eboutique;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.sid.eboutique.entities.Categorie;
import org.sid.eboutique.entities.Produit;
import org.sid.eboutique.metier.IAdminCategoriesMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJPA {
	ClassPathXmlApplicationContext context;
	@Before
	public void setUp() throws Exception {
		context=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	}

	@Test
	public void test1() {
		try {
			
			IAdminCategoriesMetier metier=
					(IAdminCategoriesMetier) context.getBean("metier");
			List<Categorie> cts1=metier.listCategories();
			metier.ajouterCategorie(new Categorie("Ordinateurs", "Ordnmmmmmmm", null, "image1.jpg"));
			metier.ajouterCategorie(new Categorie("Imprimantes", "imprrrrrrrrr", null, "image1.jpg"));
			List<Categorie> cts2=metier.listCategories();
			assertTrue(cts1.size()+2==cts2.size());
	} catch (Exception e) {
			assertTrue(e.getMessage(),false);
	}
	}
	
	@Test
	public void test2() {
		try {
			IAdminCategoriesMetier metier=
					(IAdminCategoriesMetier) context.getBean("metier");
			List<Produit> prods=metier.listproduits();
			metier.ajouterProduit(new Produit("HP45ERT", "HP7890", 6000, true, "image1.jpg",50), 1L);
			metier.ajouterProduit(new Produit("AZERTY", "HP7890", 6000, true, "image1.jpg",50), 1L);
			List<Produit> prods2=metier.listproduits();
			assertTrue(prods.size()+2==prods2.size());
	} catch (Exception e) {
			assertTrue(e.getMessage(),false);
	}
	}

}
