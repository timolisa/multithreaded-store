package com.shopwell.services;

import com.shopwell.products.Product;

public interface IExcelService {
    void addProducts(Product product, Object other);
    boolean isAvailable(Product product);
}