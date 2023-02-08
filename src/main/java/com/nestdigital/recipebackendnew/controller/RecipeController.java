package com.nestdigital.recipebackendnew.controller;


import com.nestdigital.recipebackendnew.Dao.RecipeDao;
import com.nestdigital.recipebackendnew.Model.RecipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private RecipeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addRecipe",consumes = "application/json",produces = "application/json")
    public String addRecipe(@RequestBody RecipeModel recipeModel){
        dao.save(recipeModel);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewRecipe")
    public List<RecipeModel> viewRecipe(){
        return (List<RecipeModel>)dao.findAll();
    }
}
