package com.br.distributor.form;

import com.br.distributor.model.Customer;
import com.br.distributor.model.Order;
import com.br.distributor.model.Product;
import com.br.distributor.repository.CustomerRepository;
import com.br.distributor.repository.ProductsRepository;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class OrderForm {

    private List<String> stringProducts;

    private Long productId;//just for test, check Note.
    private Long customerId;
    public Order convert(CustomerRepository customerI, ProductsRepository product) {
        Customer customer = customerI.getById(customerId);
        List<Product> products = new ArrayList<>();
        Product productOne = product.getById(productId);//just to check if the order creates, need to create a logic to insert a Product List in JSON
        products.add(productOne);
        //customer.updateStock();//needs implementation
        return new Order(products,customer);
    }

}

/* Note
*  Need to check how to insert a Product ArrayList in JSON.
*
* */