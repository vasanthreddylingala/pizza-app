package com.pizza.app;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;

    // Show all pizzas (READ)
    @GetMapping("/")
    public String listPizzas(Model model) {
        List<Pizza> pizzas = pizzaRepository.findAll();
        model.addAttribute("pizzas", pizzas);
        return "list";   // This will load list.html from templates folder
    }

    // Show form to add new pizza
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("pizza", new Pizza());
        return "add";
    }

    // Save new pizza (CREATE)
    @PostMapping("/save")
    public String savePizza(@ModelAttribute Pizza pizza) {
        pizzaRepository.save(pizza);
        return "redirect:/";   // Go back to list page
    }

    // Show form to edit pizza
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Pizza pizza = pizzaRepository.findById(id).orElseThrow();
        model.addAttribute("pizza", pizza);
        return "add";   // Reuse the add.html form
    }

    // Delete pizza (DELETE)
    @GetMapping("/delete/{id}")
    public String deletePizza(@PathVariable Long id) {
        pizzaRepository.deleteById(id);
        return "redirect:/";
    }
}