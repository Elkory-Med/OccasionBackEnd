package com.luckYou.entites;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCategorie;
	private String Description;
	
	/* Sachant que pour une categorie donné on peut y trouver plusieurs
	 * produit on itrodui l'annotation @OneToMany pour traduire cela*/
	@OneToMany(mappedBy = "categorie")
	private Set<Produit> produits;

}
