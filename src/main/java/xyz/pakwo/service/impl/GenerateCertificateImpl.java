package xyz.pakwo.service.impl;

import xyz.pakwo.model.Customer;
import xyz.pakwo.service.GenerateCertificate;

/**
 * @author sarwo.wibowo
 **/
public class GenerateCertificateImpl implements GenerateCertificate {
    @Override
    public Customer generate(Customer customer) {
        String title = checkTitle(customer);
        customer.setTitle(title);
        return customer;
    }

    private static String checkTitle(Customer customer) {
        if(customer.getGender().equals("male") && customer.getStatus().equals("single")) {
            return "Mr";
        } else if(customer.getGender().equals("female") && customer.getStatus().equals("single")) {
            return "ms";
        } else if(customer.getGender().equals("female") && customer.getStatus().equals("married")) {
            return "Mrs";
        }
        return null;
    }
}
