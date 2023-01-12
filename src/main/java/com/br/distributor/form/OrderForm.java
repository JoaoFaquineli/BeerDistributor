package com.br.distributor.form;

import com.br.distributor.model.Customer;
import com.br.distributor.model.Order;
import com.br.distributor.model.Product;
import com.br.distributor.repository.CustomerRepository;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class OrderForm {

    private List<String> stringProducts;
    private Long customerId;
    public Order convert(CustomerRepository customerI) {
        Customer customer = customerI.getById(customerId);
        List<Product> products = createProductsArray(stringProducts);
        return new Order(products,customer);
    }

    private List<Product> createProductsArray(List<String> stringProducts) {
        List<Product> products = new ArrayList<>();
        for (String stringProduct : stringProducts
             ) {
                products.add(new Product(stringProduct));
        }
        return products;
    }
}
