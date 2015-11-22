/*
  Christopher Sherling
  APCS1 pd5
  HW26 What Makes a Person?
  2015-11-08
*/

public class Body{

    private String body;

    public String toString(){
	String info = "";
	info += body + "\n";
	return info;
    }

    public Body(){
	body =  "   |   " + "\n" 
	     +  "-------" + "\n" 
	     +  "   |   " + "\n" 
	     +  "  / \\  " + "\n" 
	     +  " /   \\ ";	
    }

    //mutator capable of randomizing the body incase one doesn't want the default body
    public void setBody(){
	double x  = Math.random();

	if(x < 1.0f/3.0f){
	body =  "   |   " + "\n" +
	        "-------" + "\n" +
	        "   |   " + "\n" +
	        "  / \\  " + "\n" +
	        " /   \\ ";
	}
	else if(x < 2.0f/3.0){
	body =  "   |   " + "\n" +
	        "  /|\\  " + "\n" +
	        " / | \\ " + "\n" +
	        "  / \\  " + "\n" +
	        " /   \\ ";
	}
	else{
	body =  "\\_|_  " + "\n" +
	        "   | \\ " + "\n" +
	        "   |   " + "\n" +
	        "  / \\  " + "\n" +
	        " /   \\ ";
	}
    }
    public String getBody(){
	return body;
    }
}