package com.br.distributor.form;

import com.br.distributor.model.*;
import com.br.distributor.repository.CustomerRepository;
import com.br.distributor.repository.ProductsRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class OrderForm {

    private List<String> stringProducts;

    private Long productId;//just for test, check Note.
    private Long customerId;
    public Order convert(CustomerRepository customerI, ProductsRepository product) {
        Customer customer = customerI.getReferenceById(customerId);
        List<Product> products = new ArrayList<>();// this probably should not be a mother type (Product)
        Product productOne = product.getReferenceById(productId);//just to check if the order creates, need to create a logic to insert a Product List in JSON

        //customer.updateStock();//needs implementation
        return new Order(products,customer);
    }



}


/* Note
*  Need to check how to insert a Product ArrayList in JSON.
*/