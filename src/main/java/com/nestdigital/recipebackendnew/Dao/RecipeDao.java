package com.nestdigital.recipebackendnew.Dao;

import com.nestdigital.recipebackendnew.Model.RecipeModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipeDao extends CrudRepository<RecipeModel,Integer> {
}
