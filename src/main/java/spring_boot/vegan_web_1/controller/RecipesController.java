package spring_boot.vegan_web_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipes")
public class RecipesController {

  @GetMapping("/view/{id}")
  public String showDetail(@PathVariable("id") int idRecipe, Model model) {
    System.out.println("IdRecipe: " + idRecipe);
    model.addAttribute("idRecipe", idRecipe);

    // Search for the recipe's details on the DB

    return "recipes/detail";
  }

}
