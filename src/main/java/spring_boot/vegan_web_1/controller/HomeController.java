package spring_boot.vegan_web_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring_boot.vegan_web_1.model.Recipe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {

  @GetMapping("/tableRecipes")
  public String showTable(Model model) {
    List<Recipe> recipeList = getRecipes();
    model.addAttribute(recipeList);

    return "tableRecipes";
  }

  @GetMapping("/detail")
  public String showDetail(Model model) {
    Recipe recipe = new Recipe();
    recipe.setRecipeName("Banana Blueberry Pancake");
    recipe.setCategory("Breakfast");
    recipe.setCookingTime(20);
    recipe.setIngredients("Blueberries, banana, baking soda, flour, almond milk, vegetable oil, syrup.\n");
    recipe.setInstructions("Mix ingredients. Cook for 2 minutes, flip over and cook for 2 minutes.\n");
    model.addAttribute("recipe", recipe);

    return "detail";
  }

  @GetMapping("/listRecipes")
  public String showList(Model model) {
    List<String> list = new LinkedList<>();
    list.add("Banana Blueberry Pancake\n");
    list.add("Beetroot burger\n");
    list.add("Brownies\n");
    list.add("Chia & almond overnight oats.\n");

    model.addAttribute("listRecipes", list);
    return "listRecipes";

  }

  @GetMapping("/")
  public String showHome(Model model) {
/*    model.addAttribute("message", "Welcome to Vegan Recipes App");
    model.addAttribute("date", new Date());*/

    String name = "Banana Blueberry Pancake";

    String category = "Breakfast";
    String ingredients = "Blueberries, banana, baking soda, flour, almond milk, vegetable oil, syrup";
    Integer cookingTime = 20;
    String instructions = "Mix ingredients. Cook for 2 minutes, flip over and cook for 2 minutes";
    Date publicationDate = new Date();
    boolean featured = true;

    model.addAttribute("name", name);
    model.addAttribute("date", publicationDate);
    model.addAttribute("ingredients", ingredients);
    model.addAttribute("category", category);
    model.addAttribute("cookingTime", cookingTime);
    model.addAttribute("instructions", instructions);
    model.addAttribute("featured", featured);

    return "home";
  }

  private List<Recipe> getRecipes() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    List<Recipe> list = new LinkedList<>();

    try {
      Recipe recipe1 = new Recipe();
      recipe1.setRecipeId(1);
      recipe1.setRecipeName("Banana Blueberry Pancake");
      recipe1.setCategory("Breakfast");
      recipe1.setCookingTime(20);
      recipe1.setIngredients("Blueberries, banana, baking soda, flour, almond milk, vegetable oil, syrup.");
      recipe1.setInstructions("Mix ingredients. Cook for 2 minutes, flip over and cook for 2 minutes.");
      recipe1.setPublicationDate(sdf.parse("08-02-2022"));
      recipe1.setFeatured(1);
      recipe1.setImage("blueberry-banana-pancakes.png");

      Recipe recipe2 = new Recipe();
      recipe2.setRecipeId(2);
      recipe2.setRecipeName("Beetroot burger");
      recipe2.setCategory("Lunch");
      recipe2.setCookingTime(30);
      recipe2.setIngredients("Onion, garlic, mushrooms, smoked tofu, 2 cooked beetroot, oat flour, salt, pepper.");
      recipe2.setInstructions("Mix the ingredients in a food processor. " +
        "Use your hands to shape the mixture into burger shapes. Fry them with a little oil ");
      recipe2.setPublicationDate(sdf.parse("09-02-2022"));
      recipe2.setFeatured(0);
      //recipe2.setImage("beetroot-burger.png");

      Recipe recipe3 = new Recipe();
      recipe3.setRecipeId(3);
      recipe3.setRecipeName("Brownies");
      recipe3.setCategory("Dessert");
      recipe3.setCookingTime(30);
      recipe3.setIngredients("Dark chocolate, vegan margarine, self-raising flour, ground almonds, " +
        "cocoa powder, baking powder, sugar, vegan margarine.");
      recipe3.setInstructions("Melt the dark chocolate with margarine. Mix all ingredients in a bowl. " +
        "Bake for 35-45 minutes.");
      recipe3.setPublicationDate(sdf.parse("10-02-2022"));
      recipe3.setFeatured(0);
      recipe3.setImage("brownies.png");

      Recipe recipe4 = new Recipe();
      recipe4.setRecipeId(4);
      recipe4.setRecipeName("Chia & almond overnight oats.");
      recipe4.setCategory("Breakfast");
      recipe4.setCookingTime(10);
      recipe4.setIngredients("Vegan yogurt, oats, ground almonds and seeds (chia, flax, sesame, etc.)");
      recipe4.setInstructions("Mix natural yogurt, oats, ground almonds and seeds. Leave it overnight in the fridge.");
      recipe4.setPublicationDate(sdf.parse("11-02-2022"));
      recipe4.setFeatured(1);
      recipe4.setImage("chia-almond-overnight-oats.png");

      list.add(recipe1);
      list.add(recipe2);
      list.add(recipe3);
      list.add(recipe4);


    } catch (ParseException e) {
        System.out.println("Error: " + e.getMessage());
//      throw new RuntimeException(e);
    }

    return list;

  }



}
