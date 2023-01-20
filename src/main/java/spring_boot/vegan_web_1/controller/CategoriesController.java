package spring_boot.vegan_web_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoriesController {

  // @GetMapping("/index")
  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String showIndex(Model model) {
    return "categories/listCategories";
  }

  // @GetMapping("/create")
  @RequestMapping(value = "/create", method = RequestMethod.GET)
  public String create() {
    return "categories/formCategory";
  }

  // @GetMapping("/save")
  @RequestMapping(value = "/save", method = RequestMethod.POST)
  public String save() {
    return "categories/listCategories";
  }
}
