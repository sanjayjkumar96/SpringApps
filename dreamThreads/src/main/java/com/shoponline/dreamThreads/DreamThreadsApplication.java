package com.shoponline.dreamThreads;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.shoponline.dreamThreads.pojos.Product;
import com.shoponline.dreamThreads.service.ProductService;

@SpringBootApplication
public class DreamThreadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DreamThreadsApplication.class, args);
	}

	
	@Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.saveProduct(new Product(1L, "TV Set", 300.00, "new product","http://placehold.it/200x100"));
            productService.saveProduct(new Product(2L, "Game Console", 200.00, "new product", "http://placehold.it/200x100"));
            productService.saveProduct(new Product(3L, "Sofa", 100.00, "new product", "http://placehold.it/200x100"));
            productService.saveProduct(new Product(4L, "Icecream", 5.00, "new product", "http://placehold.it/200x100"));
            productService.saveProduct(new Product(5L, "Beer", 3.00, "new product", "http://placehold.it/200x100"));
            productService.saveProduct(new Product(6L, "Phone", 500.00, "new product", "http://placehold.it/200x100"));
            productService.saveProduct(new Product(7L, "Watch", 30.00, "new product", "http://placehold.it/200x100"));
        };
    }
	
}
