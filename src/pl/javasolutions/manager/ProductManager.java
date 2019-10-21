package pl.javasolutions.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import pl.javasolutions.pojo.Product;

@Component
public class ProductManager {

	private List<Product> products;

	public ProductManager() {

		this.products = prepareProducts();
	}

	private List<Product> prepareProducts() {

		List<Product> products = new ArrayList<>();
		Product prod1 = new Product("koszulki", "Koszulka1");
		Product prod2 = new Product("koszulki", "Koszulka2");
		Product prod3 = new Product("spodnie", "Spodnie1");
		Product prod4 = new Product("spodnie", "Spodnie2");
		Product prod5 = new Product("bluzy", "Bluza1");
		Product prod6 = new Product("bluzy", "Koszulka1");
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		products.add(prod5);
		products.add(prod6);
		return products;
	}

	public List<Product> findAll() {

		return products;
	}

	public List<Product> findByCategory(String categoryName) {

		return products.stream() //
				.filter(product -> categoryMatch(categoryName, product)) //
				.collect(Collectors.toList());
	}

	private boolean categoryMatch(String category, Product product) {

		String productCategory = product.getCategory();
		return category.equals(productCategory);
	}

	public List<String> getCategories() {

		List<String> result = new ArrayList<>();
		result.add("koszulki");
		result.add("spodnie");
		result.add("bluzy");
		
		return result;
	}
}