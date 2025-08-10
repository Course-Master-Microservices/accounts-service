package dev.alho.account.mapper;

import dev.alho.account.dto.CustomerDto;
import dev.alho.account.entity.Customer;

public class CustomerMapper {

    /**
     * Maps a Customer entity to a CustomerDto.
     * @param customer - the Customer entity to be mapped
     * @return CustomerDto - the mapped CustomerDto object
     */
    public static CustomerDto mapToCustomerDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    /**
     * Maps a CustomerDto to a Customer entity.
     * @param customerDto - the CustomerDto to be mapped
     * @return Customer - the mapped Customer entity
     */
    public static Customer mapToCustomer(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }

}
