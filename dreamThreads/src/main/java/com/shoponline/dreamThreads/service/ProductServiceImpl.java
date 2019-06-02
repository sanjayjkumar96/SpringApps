package com.shoponline.dreamThreads.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shoponline.dreamThreads.exception.ResourceNotFoundException;
import com.shoponline.dreamThreads.pojos.Product;
import com.shoponline.dreamThreads.service.repo.ProductRepo;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	
	private ProductRepo productRepo;
	

	public ProductServiceImpl(ProductRepo productRepo) {
		super();
		this.productRepo = productRepo;
	}

	@Override
	public Iterable<Product> getAllProducts() {
		
		return productRepo.findAll();
	}

	@Override
	public Product getProduct(long id) {
		
		return productRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found"));
	}

	@Override
	public Product saveProduct(Product newProduct) {
		
		return productRepo.save(newProduct);
	}

}
