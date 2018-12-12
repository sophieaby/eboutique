package sn.uadb.shop.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.uadb.shop.entities.Categorie;

public interface CategoryRepository extends JpaRepository<Categorie, Integer>{

}
