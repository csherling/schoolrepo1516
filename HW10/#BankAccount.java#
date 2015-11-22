/* Lisa Shi
Christopher Sherling
Period 5
October 1, 2015
*/

//BankAccount: An account belong to a bank

public class BankAccount{

    //Instance variables
    private String fullName;
    private String accPass;
    private int accPin;
    private int accNumber;
    private double accBalance;

    //Constructor
    public BankAccount(){
	fullName = "name";
	accPass = "password";
	accPin = 1234;
	accNumber = 123456789;
	accBalance = 0.0;
    }

    public String toString() { 
	String info; 
	info = "Name: " + fullName + "\n";
	info += "Password: " + accPass + "\n";
	info += "Pin: " + accPin + "\n";
	info += "Account Number: " + accNumber + "\n";
	info += "Account Balance: " + accBalance + "\n";
	return info;
    }

    //Attribute Changing Methods
    public void setFullName(String newFullName){
	fullName = newFullName;
    }
    public void setAccPass(String newAccPass){
	accPass = newAccPass;
    }
    public void setAccPin(int newAccPin){
    	if (newAccPin <= 9999 && newAccPin >= 1000) {
	    accPin = newAccPin;
	}
       	else {
	    accPin = 9999;
	    System.out.println("Can not compute, setting default pin 9999 ");
	}
    }
    public void setAccNumber(int newAccNumber){
    	if (accNumber <= 999999998 && accNumber >= 100000000) {
	    accNumber = newAccNumber;
	}
	else {
	    System.out.println("Can not compute, setting default number 999999999 ");
	    accNumber = 999999999;
       	}
    }
    public void setAccBalance(double newAccBalance){
	accBalance = newAccBalance;
    }


    //Return attributes
    public double balance(){
	return accBalance;
    }


    //Deposit and Widthdrawl
    public void deposit(double depositMoney){
    	if (depositMoney < 0) {
	    System.out.println("Can Not Deposit Negative");
    	}
    	else {
	    accBalance = accBalance + depositMoney;
    	}
    }
    public void widthdrawl(double widthdrawlMoney){
    	if (widthdrawlMoney <0) {
	    System.out.println("Can Not Widthdraw Negative");
	}
	else if (accBalance - widthdrawlMoney < 0) {
	    System.out.println("Can not overdraw Account");
	}
	else {
	    accBalance = accBalance - widthdrawlMoney;
		}
    }

    // Account authentication
    public void authentication(String password, int accountNumber) {
        if (password != accPass) {
            System.out.println ("Wrong password.");
        }
        else if (accountNumber != accNumber) {
            System.out.println ("Wrong account number.");
        }
        else {System.out.println ("Would you like to deposit or widthdrawl?");}
    }

    //Main that displays all attributes
    public static void main(String[] args){

	String name;
	String pass;
	int pin;
	int number;
	double balance;

	BankAccount chrisSher = new BankAccount();    
	//Account information
	chrisSher.setFullName("chrisSher");
	chrisSher.setAccPass("Unicorns");
	chrisSher.setAccPin(1114);
	chrisSher.setAccNumber(205704083);
	chrisSher.setAccBalance(26.31);

	System.out.print(chrisSher);

	//Account tests
	chrisSher.deposit(20.00);
	balance = chrisSher.balance();
	System.out.println(balance);
	chrisSher.widthdrawl(50.00);
	balance = chrisSher.balance();
	System.out.println(balance);

	chrisSher.authentication("Unicorns", 205704083);

    }
}