package com.shoponline.dreamThreads.service.repo;

import org.springframework.data.repository.CrudRepository;

import com.shoponline.dreamThreads.pojos.Product;

public interface ProductRepo extends CrudRepository<Product,Long> {

}
