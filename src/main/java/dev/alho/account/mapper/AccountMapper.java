package dev.alho.account.mapper;

import dev.alho.account.dto.AccountDto;
import dev.alho.account.entity.Account;

public class AccountMapper {

    private AccountMapper() {
        // Private constructor to prevent instantiation
    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountNumber(account.getAccountNumber());
        accountDto.setAccountType(account.getAccountType());
        accountDto.setBranchAddress(account.getBranchAddress());
        return accountDto;
    }

    public static Account mapToAccount(AccountDto accountDto) {
        Account account = new Account();
        account.setAccountNumber(accountDto.getAccountNumber());
        account.setAccountType(accountDto.getAccountType());
        account.setBranchAddress(accountDto.getBranchAddress());
        return account;
    }
    
}
