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
    protected String getFullName() {
        return getName() + " " + surname + " ";
    }
}
