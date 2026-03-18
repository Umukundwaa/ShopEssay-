package com.shopessay.service;

import com.shopessay.model.Product;
import com.shopessay.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;

    }
    public List<Product> getAllProducts() {
       return productRepo.getAllProducts();

    }
    public void addProduct(Product product) {
      productRepo.addProduct(product);
    }
   public Product getProductsById(Long id){
        return productRepo.getProductById(id);
   }
   public  void deleteProductById(Long id){
        productRepo.deleteProductById(id);
   }
}
