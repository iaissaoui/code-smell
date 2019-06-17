package com.danix.code.smell.example001;

/**
 * @author  danix
 */
public class Person extends Customer {
    protected String surname;

    Person(final String name, final String surname, final String email, final Account account) {
        super(name, email, account);
        this.surname = surname;
    }

    @Override
    public void withdraw(final Money money) {
    	account.withdraw(money);
    }

    @Override
    protected String getFullName() {
        return getName() + " " + surname + " ";
    }
}
