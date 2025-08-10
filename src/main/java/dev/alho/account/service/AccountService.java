package dev.alho.account.service;

import dev.alho.account.dto.CustomerDto;

public interface AccountService {

    /**
     * Creates a new account for the given customer.
     *
     * @param customerDto - the customer data transfer object containing customer details
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetches the account details for the given mobile number.
     *
     * @param mobileNumber - the mobile number of the customer
     * @return CustomerDto containing account details
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Updates the account details for the given customer.
     *
     * @param customerDto - the customer data transfer object containing updated details
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * Deletes the account for the given mobile number.
     *
     * @param mobileNumber - the mobile number of the customer
     * @return true if the account was successfully deleted, false otherwise
     */
    boolean deleteAccount(String mobileNumber);
}
