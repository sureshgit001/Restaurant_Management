package com.restaurent.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurent.models.Ingredients;
@Repository
public interface IngredientsRepo extends JpaRepository<Ingredients, Long>{
	
}
