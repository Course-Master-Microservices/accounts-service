package dev.alho.account.repository;

import dev.alho.account.entity.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    /**
     * Finds an account by the given customer ID.
     *
     * @param customerId the ID of the customer whose account is to be found
     * @return an Optional containing the found Account, or empty if no account is found
     */
    Optional<Account> findByCustomerId(Long customerId);

    /**
     * Deletes all accounts associated with the given customer ID.
     *
     * @param customerId the ID of the customer whose accounts are to be deleted
     */
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
