public class Greet { 

    public static void main( String[] args ) { 

	String greeting;

	BigSib richard = new BigSib("EYYY");    
	//	BigSib grizz = new BigSib();    
	//	BigSib dotCom = new BigSib();    
	//	BigSib tracy = new BigSib();    

	//      richard.setHelloMsg("Word up"); 
	//	grizz.setHelloMsg("Hey ya"); 
	//	tracy.setHelloMsg("Salutations"); 
	//	dotCom.setHelloMsg("Sup"); 

	greeting = richard.greet("freshman"); 
	System.out.println(greeting); 
	//	greeting = tracy.greet("Dr. Spaceman"); 
	//	System.out.println(greeting); 
	//	greeting = grizz.greet("Kong Fooey"); 
	//	System.out.println(greeting); 
	//	greeting = dotCom.greet("mom"); 
	//	System.out.println(greeting); 

	/* Q: The statement below does not work. What single, simple, 
	   small modification in BigSib.java will enable it to work? */ 
	//System.out.println(richard.helloMsg); 

    } //end main() 

} //end Greet
