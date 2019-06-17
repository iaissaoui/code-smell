package com.danix.code.smell.example001;

/**
 * @author  danix
 */
public abstract class Customer {

    protected String name;
    protected String email;
    protected Account account;
    

    Customer(final String name, final String email, final Account account) {
        this.name = name;
        this.email = email;
        this.account = account;
    }

    public void withdraw(Money money) {
    	account.withdraw(money);
    	
    };
    
    public double getOverdraftDiscount() {
    	return 1;
    };

    protected abstract String getFullName();

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

	public String printCustomer() {
	 return this.getName() + " " + this.getEmail();
	}
}
