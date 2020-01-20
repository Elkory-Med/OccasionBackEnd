package com.luckYou.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

/* dans cette classe on fait l'image de la table produit dans la base de donnees
 * en utilisant les annotations de jpa*/

@Entity
public class Produit {
	/* @Id c'est pour indiquer que le variable juste en bas il s'agit de l'identifiant
	 * de notre classe
	*/
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idProuit;
	private String libelle;
	private double Prix;
	
	@ManyToOne
	private  Categorie categorie;

}
