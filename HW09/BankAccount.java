public class BankAccount{

    //Instance variables
    private String fullName;
    private String accPass;
    private short accPin;
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

    //Attribute Changing Methods
    public void setFullName(String newFullName){
	fullName = newFullName;
    }
    public void setAccPass(String newAccPass){
	accPass = newAccPass;
    }
    public void setAccPin(short newAccPin){
	accPin = newAccPin;
    }
    public void setAccNumber(int newAccNumber){
	accNumber = newAccNumber;
    }
    public void setAccBalance(double newAccBalance){
	accBalance = newAccBalance;
    }

    //Return attributes
    public String name(){
	String retStrN;
	retStrN = "Name: ";
	retStrN += fullName;
	return retStrN;
    }    
    public String pass(){
	String retStrP;
	retStrP = "Password: ";
	retStrP += accPass;
	return retStrP;
    }
    public short pin(){
	return accPin;
    }
    public int number(){
	return accNumber;
    }
    public double balance(){
	return accBalance;
    }

    //Deposit and Widthdrawl
    public void deposit(double depositMoney){
	accBalance = accBalance + depositMoney;
    }
    public void widthdrawl(double widthdrawlMoney){
	accBalance = accBalance - widthdrawlMoney;
    }

    //Main that displays all attributes
    public static void main(String[] args){

	String name;
	String pass;
	short pin;
	int number;
	double balance;

	BankAccount chrisSher = new BankAccount();    

	chrisSher.setFullName("chrisSher");
	chrisSher.setAccPass("Unicorns");
	chrisSher.setAccPin((short)1114);
	chrisSher.setAccNumber(205704083);
	chrisSher.setAccBalance(26.31);

	name = chrisSher.name();
	System.out.println(name);
	pass = chrisSher.pass();
	System.out.println(pass);
	pin = chrisSher.pin();
	System.out.print("Pin: ");
	System.out.println(pin);
	number = chrisSher.number();
	System.out.print("Account number: ");
	System.out.println(number);
	balance = chrisSher.balance();
	System.out.print("Account Balance: ");
	System.out.println(balance);

	chrisSher.deposit(20.00);
	balance = chrisSher.balance();
	System.out.println(balance);
	chrisSher.widthdrawl(30.00);
	balance = chrisSher.balance();
	System.out.println(balance);
    }
}