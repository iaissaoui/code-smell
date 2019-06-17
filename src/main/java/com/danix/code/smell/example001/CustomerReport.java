package com.danix.code.smell.example001;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.annotation.Nonnull;

/**
 * @author  danix
 */
public class CustomerReport {

    private final Customer customer;
    private final Account account;

    public CustomerReport(@Nonnull final Customer customer, @Nonnull final Account account) {
        this.customer = checkNotNull(customer);
        this.account = checkNotNull(account);
    }

    
    public String printCustomerDaysOverdrawn() {
        return customer.getFullName() + account.getOverDrawnDescription();
    }

    public String printCustomerMoney() {
        return customer.getFullName() + account.getMoneyDescription();
    }

    public String printCustomerAccount() {
    	return account.printCustomerAccount();
    }

    public String printCustomer() {
        return customer.printCustomer();
    }
}
