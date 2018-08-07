package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/*
Created by Joharry Correa 28/07/2018
 */
public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(String recipeId, String idToDelete);

}
