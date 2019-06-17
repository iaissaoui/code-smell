package com.danix.code.smell.example001;

/**
 * @author  danix
 */
public class Company extends Customer {

    protected double companyOverdraftDiscount = 1;

    Company(final String name, final String email, final Account account, final double companyOverdraftDiscount) {
        super(name, email, account);
        
        if(account.getType().isPremium()) {
        	this.companyOverdraftDiscount = companyOverdraftDiscount/2;	
        }else {
        	this.companyOverdraftDiscount = companyOverdraftDiscount;
        }
        
        
    }

    @Override
    public void withdraw(final Money money) { 
    	account.withdraw(money);
    }

    @Override
    protected String getFullName() {
        return getName();
    }

	@Override
	public double getOverdraftDiscount() {
		return companyOverdraftDiscount;
	}
}
