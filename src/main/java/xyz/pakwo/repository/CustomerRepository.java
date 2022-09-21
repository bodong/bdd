package xyz.pakwo.repository;

import xyz.pakwo.model.Customer;

import java.util.List;

/**
 * @author sarwo.wibowo
 **/
public interface CustomerRepository {
    List<Customer> findAll();

    Customer findByName(String name);
}
