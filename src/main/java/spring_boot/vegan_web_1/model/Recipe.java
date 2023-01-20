package spring_boot.vegan_web_1.model;

import java.util.Date;

public class Recipe {

  private Integer recipeId;
  private String recipeName;
  private String category;
  private Integer cookingTime;
  private String ingredients;
  private String instructions;
  private Integer featured;
  private Date publicationDate;
  private String image = "no-image.png";

  public Integer getRecipeId() {
    return recipeId;
  }

  public void setRecipeId(Integer recipeId) {
    this.recipeId = recipeId;
  }

  public String getRecipeName() {
    return recipeName;
  }

  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Integer getCookingTime() {
    return cookingTime;
  }

  public void setCookingTime(Integer cookingTime) {
    this.cookingTime = cookingTime;
  }

  public String getIngredients() {
    return ingredients;
  }

  public void setIngredients(String ingredients) {
    this.ingredients = ingredients;
  }

  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public Integer getFeatured() {
    return featured;
  }

  public void setFeatured(Integer featured) {
    this.featured = featured;
  }

  public Date getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "Recipe{" +
      "recipeId=" + recipeId +
      ", recipeName='" + recipeName + '\'' +
      ", category='" + category + '\'' +
      ", cookingTime=" + cookingTime +
      ", ingredients='" + ingredients + '\'' +
      ", instructions='" + instructions + '\'' +
      ", featured=" + featured +
      ", publicationDate=" + publicationDate +
      ", image='" + image + '\'' +
      '}';
  }
}
