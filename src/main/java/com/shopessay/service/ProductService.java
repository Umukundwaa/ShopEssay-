package com.shopessay.service;

import com.shopessay.model.Product;
import com.shopessay.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }
    public List<Product> getAllProducts() {
       return productRepository.findAll();

    }
    public void addProduct(Product product) {
      productRepository.save(product);
    }
   public Product getProductsById(Long id){
        return productRepository.findById(id).orElse(null);
   }
   public void deleteProductById(Long id){
        productRepository.deleteById(id);
   }

    public void updateProduct(Long id, Product product) {
        product.setId(id);
        productRepository.save(product);
    }
    public List<Product> getProductByCategory(String category) {
        return productRepository.findByCategoryIgnoreCase(category);
    }
}
