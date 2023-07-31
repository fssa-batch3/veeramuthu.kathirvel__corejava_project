package day05.Pratice;

public class Account {
	
	
	 private String accNo;
	    private double balance;

	    // Constructor
	    public Account(String accNo, double balance) {
	        this.accNo = accNo;
	        this.balance = balance;
	    }

	    // Getters and setters
	    public String getAccNo() {
	        return accNo;
	    }

	    public void setAccNo(String accNo) {
	        this.accNo = accNo;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }
	}

	// Interface
	public interface ATM {
	    boolean deposit(Account account, double amount);
	    boolean withdraw(Account account, double amount) throws Exception;
	    double getBalance(Account account); // Pass the Account object as a parameter
	}

	// Implementation
	class AxisATM implements ATM {
	    private static final double WITHDRAWAL_CHARGE = 5;

	    @Override
	    public boolean deposit(Account account, double amount) {
	        account.setBalance(account.getBalance() + amount);
	        return true;
	    }

	    @Override
	    public boolean withdraw(Account account, double amount) throws Exception {
	        if (account.getBalance() < 5000) {
	            throw new Exception("Insufficient balance. Minimum balance of 5000 required.");
	        }

	        double totalAmount = amount + WITHDRAWAL_CHARGE;
	        if (account.getBalance() >= totalAmount) {
	            account.setBalance(account.getBalance() - totalAmount);
	            return true;
	        } else {
	            throw new Exception("Insufficient balance.");
	        }
	    }

	    @Override
	    public double getBalance(Account account) { // Add the Account object as a parameter
	        return account.getBalance();
	    }
	}

	class IciciATM implements ATM {
	    private static final double WITHDRAWAL_CHARGE = 10;

	    @Override
	    public boolean deposit(Account account, double amount) {
	        account.setBalance(account.getBalance() + amount);
	        return true;
	    }

	    @Override
	    public boolean withdraw(Account account, double amount) throws Exception {
	        if (account.getBalance() < 10000) {
	            throw new Exception("Insufficient balance. Minimum balance of 10000 required.");
	        }

	        double totalAmount = amount + WITHDRAWAL_CHARGE;
	        if (account.getBalance() >= totalAmount) {
	            account.setBalance(account.getBalance() - totalAmount);
	            return true;
	        } else {
	            throw new Exception("Insufficient balance.");
	        }
	    }

	    @Override
	    public double getBalance(Account account) { // Add the Account object as a parameter
	        return account.getBalance();
	    }
	}


