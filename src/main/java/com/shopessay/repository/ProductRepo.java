//package com.shopessay.repository;
//
//import com.shopessay.model.Product;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class ProductRepo {
//
//    private List<Product> products = new ArrayList<>();
//
//    public List<Product> getAllProducts() {
//        return products;
//    }
//    public void addProduct(Product product) {
//        this.products.add(product);
//    }
//    public Product getProductById(Long id) {
//        for (Product product : products) {
//            if (product.getId().equals(id)) {
//                return product;
//            }
//        }
//
//        return null;
//    }
//    public  void deleteProductById(Long id) {
//        for (Product product : products) {
//            if (product.getId().equals(id)){
//                products.remove(product);
//            }
//        }
//
//    }
//
//
//}
