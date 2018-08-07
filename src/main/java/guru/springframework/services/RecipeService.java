package guru.springframework.services;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.domain.Recipe;

import java.util.Set;

/*
Created by Joharry 23/07/2018
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String l);

    RecipeCommand findCommandById(String l);

    void deleteById(String l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
