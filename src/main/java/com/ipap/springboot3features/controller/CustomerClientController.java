package com.ipap.springboot3features.controller;

import com.ipap.springboot3features.client.CustomerClientService;
import com.ipap.springboot3features.dto.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class CustomerClientController {

    private final CustomerClientService customerClientService;

    public CustomerClientController(CustomerClientService customerClientService) {
        this.customerClientService = customerClientService;
    }

    @GetMapping("/rest/consumer")
    public List<Customer> fetchCustomers() {
        return customerClientService.getAllCustomers();
    }

    @GetMapping("/rest/consumer/{id}")
    public Customer fetchCustomer(@PathVariable int id) {
        return customerClientService.getCustomer(id);
    }

    @PostMapping("/rest/consumer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerClientService.addCustomer(customer);
    }
}
