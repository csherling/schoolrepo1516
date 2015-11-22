public class Foresrever{

    //Creates a fences with posts number of posts
    public static String fenceF(int posts){

    	String fence = "|";
    
    	for(int i = posts; i > 1; i--){
	    fence += "--|";

	}
	return fence;
    }

    //reverses a string using for loops
    public static String reverseF(String a){

	String st = "";

    	for(int x = a.length(); x > 0; x--){
    	    st += a.substring(x - 1, x);
    	}

    	return st;

    }

    //reverses a string using recursion
    public static String reverseR(String a){

	String st;

	if (a.length() > 1){
	    st = reverseR(a.substring(1)) + a.substring(0, 1);	  
	}
	else{
	    st = "";
	    st += a;
	}
    	return st;

    }

    public static void main(String[] args) {

	System.out.println("----------Testing fenceF----------")
	System.out.println(fenceF(5));
	System.out.println("----------Testing reverseF----------")
	System.out.println(reverseF("stressed"));
	System.out.println("----------Testing reverseR----------")
	System.out.println(reverseR("stressed"));

    }

}