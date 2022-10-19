package com.nestdigital.recipebackendnew.controller;


import com.nestdigital.recipebackendnew.Dao.RecipeDao;
import com.nestdigital.recipebackendnew.Model.RecipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @Autowired
    private RecipeDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/addRecipe",consumes = "application/json",produces = "application/json")
    public String addRecipe(@RequestBody RecipeModel recipeModel){
        dao.save(recipeModel);
        return "{status:'success'}";
    }
}
