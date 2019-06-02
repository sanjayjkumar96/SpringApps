package com.shoponline.dreamThreads.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoponline.dreamThreads.pojos.Product;
import com.shoponline.dreamThreads.service.ProductService;

@RestController
@RequestMapping("/api/Products")
public class ProductController {
	
	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping(value = {"","/"})
	public @NotNull Iterable<Product> getProducts()
	{
		return productService.getAllProducts();
	}
	
	@GetMapping(value= "/{id}")
	public @NotNull Product getProductById(@PathVariable(value="id") Long id)
	{
		return productService.getProduct(id);
		
	}
	
	@PostMapping(value= {"","/"})
	public @NotNull Product createProduct(@Valid @RequestBody Product product)
	{
		return productService.saveProduct(product);
		
	}
	
	@PutMapping("/{id}")
	public @NotNull ResponseEntity<Product> updateProduct(@PathVariable(value="id") Long id, @RequestBody Product product)
	{
		product.setId(id);
		productService.saveProduct(product);
		return ResponseEntity.ok(product);
		
	}
	
	

}
