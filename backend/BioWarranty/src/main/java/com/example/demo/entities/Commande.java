package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Commande {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long commandeId;
	private Date dateCommande;
	private double totalCommande;
	private int quantiteCommande;

	/*
	 * @ManyToOne private Client client;
	 */
	
	/*
	 * @ManyToMany (mappedy="commandes") private List<Produit> produits
	 */
	
	
	
}