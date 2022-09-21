package xyz.pakwo.service.impl;

import xyz.pakwo.model.Customer;
import xyz.pakwo.repository.CustomerRepository;
import xyz.pakwo.repository.impl.CustomerRepositoryImpl;
import xyz.pakwo.service.GenderFilterService;

/**
 * @author sarwo.wibowo
 **/
public class GenderFilterServiceImpl implements GenderFilterService {

    private CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public Customer getByName(String name) {
        return customerRepository.findByName(name);
    }
}
