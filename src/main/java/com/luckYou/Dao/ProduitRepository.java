package com.luckYou.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luckYou.entites.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
