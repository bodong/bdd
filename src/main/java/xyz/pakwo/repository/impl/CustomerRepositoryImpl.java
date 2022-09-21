package xyz.pakwo.repository.impl;

import xyz.pakwo.model.Customer;
import xyz.pakwo.repository.CustomerRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sarwo.wibowo
 **/
public class CustomerRepositoryImpl implements CustomerRepository {

    private final Map<String, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl(){
        customers.put("Annie", new Customer("Annie", "female" , "single"));
        customers.put("Winnie", new Customer("Winnie", "female" , "married"));
        customers.put("John", new Customer("John", "male" , "single"));

    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findByName(String name) {
        return this.customers.get(name);
    }
}
