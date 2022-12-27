package com.ipap.springboot3features.client;

import com.ipap.springboot3features.dto.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.*;

import java.util.List;

@HttpExchange("/customer")
public interface CustomerClientService {

    /**
     * Applicable annotations
     * ----------------------
     * GetExchange
     * PostExchange
     * PutExchange
     * DeleteExchange
     * PatchExchange
     */

    @GetExchange
    List<Customer> getAllCustomers();

    @GetExchange("/{id}")
    Customer getCustomer(@PathVariable int id);

    @PostExchange
    Customer addCustomer(@RequestBody Customer customer);

}
