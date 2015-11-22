/* The "L"s -- Andy Liang, Derek Lin, Jordan Louie
   APCS1 pd5
   HW10 -- Mo Money Mo Problems
   2015-10-01 */

/* Used By:
   The Robotic Overlords -- Lisa Shi, Christopher Sherling
   APCS1 pd5
   HW11 -- Hey... I Got Your Money
   2015-10-03 */


public class BankAccount{
    // Instance Variables
    private String fullName;
    private String password;
    private int pinNumber;
    private int accountNumber;
    private double balance;
    
    // Constructors
    // Default constructor, assigns default values to Instance Variables.

    public BankAccount(){
	fullName = null;
	password = "password";
	pinNumber = 9999;
	accountNumber = 999999998;
	balance = 0.0;
    }

    // Overloaded constructor for setting up instance vars. 
    public BankAccount(String newFullName, String newPassword, int newPinNumber, int newAccountNumber, double newBalance){
	fullName = newFullName;
	password = newPassword;
	pinNumber = newPinNumber;
	accountNumber = newAccountNumber;
	balance = newBalance;
    }

    // Accessors
    public String getFullName(){
	return fullName;
    }

    public String getPassword(){
	return password;
    }

    public int getPinNumber(){
	return pinNumber;
    }

    public int getAccountNumber(){
	return accountNumber;
    }

    public double getBalance(){
	return balance;
    }

    public String toString(){
	String s;
	s = "Full Name: " + fullName + ", ";
	s += "Password: " + password + ", ";
	s += "PIN: " + pinNumber + ", ";
	s += "Account Number: " + accountNumber + ", ";
	s += "Balance: " + balance + ", ";
	return s;
    }
    
    // Mutators
    public void setFullName(String newFullName){
	fullName = newFullName;
    }

    public void setPassword(String newPassword){
	password = newPassword;
    }

    public void setPinNumber(int newPinNumber){
	if(newPinNumber >= 1000 && newPinNumber <= 9998){
	    pinNumber = newPinNumber;
	}
	else{
	    pinNumber = 9999;
	    System.out.println("Error: Please pick a number between 1000 and 9998.");
	}
    }

    public void setAccountNumber(int newAccountNumber){
	if(newAccountNumber >= 100000000 && newAccountNumber <= 999999998){
	    accountNumber = newAccountNumber;
	}
	else{
	    accountNumber = 999999999;
	    System.out.println("Error: Please pick a number between 100000000 and 999999998");
	}
    }

    public void setBalance(double newBalance){
	balance = newBalance;
    }

    /* Depositing Money Mutator
       returns False and prints error if money cannot be deposited, otherwise returns True. */
    public boolean deposit(double depositedMoney){
	if (depositedMoney < 0.0){
	    System.out.println("Error: You cannot deposit a negative amount of money.");
	    return false;
	}
	else{
	    balance = balance + depositedMoney;
	    System.out.println("Money successfully deposited.");
	    System.out.println("New balance: " + balance + ".");
	    return true;
	}
    }


    /* Withdrawing Money Mutator 
       returns False and prints error if money cannot be withdrawn, otherwise returns True. */
    public boolean withdraw(double withdrawnMoney){
	if (withdrawnMoney < 0.0 || withdrawnMoney > balance){
	    System.out.println("Error: You cannot withdraw a negative amount of money, or insufficient funds.");
	    return false;
	}
	else{
	    balance = balance - withdrawnMoney;
	    System.out.println("Money successfully withdrawn.");
	    System.out.println("New balance: " + balance + ".");
	    return true;
	}
    }
    // Authenticate
    // Checks if accNum and pass match and returns boolean.
    public boolean authenticate(int enteredAccountNumber, String enteredPassword){
	if (enteredAccountNumber == accountNumber && enteredPassword == password){
	    return true;
	}
	else{
	    return false;
	}
    }

    // checks if pin is within acceptable range and sets to 9999 if not.
    public boolean checkPinNumber(){
	if(pinNumber >= 1000 && pinNumber <= 9998){
	    return true;
	}
	else{
	    pinNumber = 9999;
	    System.out.println("Error: Please pick a number between 1000 and 9998.");
	    return false;
	}
    }

    // checks if accnum is within acceptable range and sets to 999999999 if not.
    public boolean checkAccountNumber(){
	if(accountNumber >= 100000000 && accountNumber <= 999999998){
	    return true;
	}
	else{
	    accountNumber = 999999998;
	    System.out.println("Error: Please pick a number between 100000000 and 999999998.");
	    return false;
	}
    }
    
    public static void main(String[] args){
	BankAccount andy = new BankAccount("Andy Liang", "asecurepassword", 1111, 111222333, 50.00);
	BankAccount jordan = new BankAccount("Jordan Louie", "asecurepassword", 2222, 444555666, -50.00);
	BankAccount derek = new BankAccount();
	String s;
	int i;
	double d;
	boolean b;

	System.out.println(andy);
	System.out.println(jordan);
	System.out.println(derek);
	System.out.println("=");

	derek.setFullName("Derek Lin");
	derek.setPassword("asecurepassword");
	derek.setPinNumber(33330);
	derek.setAccountNumber(1778889990);
	derek.setBalance(0.00);

	s = derek.getFullName();
	System.out.println(s);
	s = derek.getPassword();
	System.out.println(s);
	i = derek.getPinNumber();
	System.out.println(i);
	i = derek.getAccountNumber();
	System.out.println(i);
	d = derek.getBalance();
	System.out.println(d);

	b = derek.checkPinNumber();
	System.out.println(b);
	b = derek.checkAccountNumber();
	System.out.println(b);
	derek.setPinNumber(3333);
	derek.setAccountNumber(777888999);
	b = derek.checkPinNumber();
	System.out.println(b);
	b = derek.checkAccountNumber();
	System.out.println(b);

        System.out.println(andy);
	System.out.println(jordan);
	System.out.println(derek);
	System.out.println("=");

	b = andy.withdraw(50.00);
	System.out.println(b);
	b = jordan.withdraw(-20.00);
	System.out.println(b);
	b = derek.withdraw(20.00);
	System.out.println(b);

        System.out.println(andy);
	System.out.println(jordan);
	System.out.println(derek);
	System.out.println("=");
	
	b = andy.deposit(-100000.00);
	System.out.println(b);
	b = jordan.deposit(50.00);
	System.out.println(b);
	b = derek.deposit(20.00);
	System.out.println(b);

        System.out.println(andy);
	System.out.println(jordan);
	System.out.println(derek);
	System.out.println("=");

	b = andy.authenticate(111222333, "anincorrectpassword");
	System.out.println(b);
	b = jordan.authenticate(444555666, "asecurepassword");
	System.out.println(b);
	b = derek.authenticate(777888999, "asecurepassword");
	System.out.println(b);
    }
}
