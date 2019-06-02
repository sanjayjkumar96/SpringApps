package com.shoponline.dreamThreads.service;

import com.shoponline.dreamThreads.pojos.Product;

public interface ProductService {

	public Iterable<Product> getAllProducts();
	
	public Product getProduct(long id);
	
	public Product saveProduct(Product newProduct);

	
	
}
