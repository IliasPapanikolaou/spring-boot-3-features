package com.ipap.springboot3features.service;

import com.ipap.springboot3features.dto.Customer;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private static final List<Customer> customerList = new ArrayList<>();

    private final ObservationRegistry observationRegistry;

    public CustomerService(ObservationRegistry observationRegistry) {
        this.observationRegistry = observationRegistry;
    }

    static {
        customerList.add(new Customer(1, "John Tester", "john.tester@mail.com", "male"));
        customerList.add(new Customer(2, "Mary Spending", "mary.spending@mail.com", "female"));
        customerList.add(new Customer(3, "George Buying", "george.buying@mail.com", "male"));
    }

    public Customer addCustomer(Customer customer) {
        customerList.add(customer);

        return Observation.createNotStarted("addCustomer", observationRegistry)
                .observe(() -> customer);
    }

    public List<Customer> getCustomers() {
        return Observation.createNotStarted("getCustomers", observationRegistry)
                .observe(() -> customerList);
    }

    public Customer getCustomer(int id) {
        Customer customer = customerList.stream()
                .filter(cmr -> cmr.id() == id).findAny()
                .orElseThrow(() -> new RuntimeException("Customer with id " + id + " not found"));

        return Observation.createNotStarted("getCustomer", observationRegistry)
                .observe(() -> customer);
    }
}
