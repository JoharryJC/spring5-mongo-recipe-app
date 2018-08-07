package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/*
Created by Joharry Correa 22/07/2018
 */
public interface RecipeRepository extends CrudRepository<Recipe, String> {

}
