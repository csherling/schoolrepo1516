/*
Christopher Sherling
APCS1 PD5
HW07 "On BigSib Individuality and the Elimination of Radio Fuzz"
2015-09-23
 */

public class BigSib{

    private String helloMsg;

    public BigSib(){
    
	helloMsg = "Eyy";
    
    }


    public BigSib(String Sib){

	helloMsg = Sib;

    }

    public void setHelloMsg(String newMsg){

	helloMsg = newMsg;

    }

    public String greet(String name){

	String retStr;
	retStr = helloMsg;
	retStr += " ";
	retStr += name;
	retStr += ".";
	    return retStr;

    }

}
