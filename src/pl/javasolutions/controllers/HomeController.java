package pl.javasolutions.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.javasolutions.pojo.Product;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String home(Model model) throws IOException {
		//throw new IOException();
		List<Product> productsList = getProducts();
		
		model.addAttribute("products", productsList);
		model.addAttribute("nick", "Jan");
		return "home";
	}

	private List<Product> getProducts() {
		List<Product> products = new ArrayList<>();
		Product prod1 = new Product("koszulki", "koszulka1");
		Product prod2 = new Product("koszulki", "koszulka2");
		Product prod3 = new Product("spodnie", "spodnie1");
		Product prod4 = new Product("spodnie", "spodnie2");
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		return products;
	}
}
