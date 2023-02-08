package com.nestdigital.recipebackendnew.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipe")
public class RecipeModel {

    @Id
    @GeneratedValue
    private int id;
    private String recipeTitle;
    private String description;
    private String preparedBy;
    private String category;
    private String postedDate;

    public RecipeModel() {
    }

    public RecipeModel(int id, String recipeTitle, String description, String preparedBy, String category, String postedDate) {
        this.id = id;
        this.recipeTitle = recipeTitle;
        this.description = description;
        this.preparedBy = preparedBy;
        this.category = category;
        this.postedDate = postedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }
}
