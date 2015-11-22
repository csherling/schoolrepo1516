public class Doub{
    public static String doubleChar(String str) {
	String retStr = "";
	for(int i = str.length(); i > 0; i--){
	    retStr += str.substring(0, 1) + str.substring(0, 1);
	    str = str.substring(1);
	}
	return retStr;
    }

    public static int countHi(String str) {
	int hi = 0;
	for(int i = str.length(); i > 1; i--){
	    if(str.substring(0,2).equals("hi")){
		hi += 1;
		str = str.substring(1);
	    }
	    else
		str = str.substring(1);
	}
	return hi;
    }

    public static boolean catDog(String str) {
	int cats = 0;
	int dogs = 0;

	for(int i = str.length(); i > 2; i--){
	    if(str.substring(0,3).equals("cat")){
		cats += 1;
		str = str.substring(1);
	    }
	    else if(str.substring(0,3).equals("dog")){
		dogs += 1;
		str = str.substring(1);
	    }
	    else
		str = str.substring(1);
	}
	return dogs == cats;
    }

    public static int countCode(String str) {
	int count = 0;
	for (int i = str.length(); i > 3; i--){
	    if(str.substring(0,2).equals("co") && str.substring(3,4).equals("e")){
		count += 1;
		str = str.substring(1);
	    }
	    else
		str = str.substring(1);
	}
	return count;
    }

    public static boolean endOther(String a, String b) {
	boolean equal = false;
	int c = Math.min(a.length(), b.length());
	int d = Math.max(a.length(), b.length());
	for (int i = d; i >= c; i--){
	    if(a.length() > b.length()){
		if(a.toLowerCase().equals(b.toLowerCase()))
		    equal = true;
		else
		    a = a.substring(1);
	    }
	    else {
		if(b.toLowerCase().equals(a.toLowerCase()))
		    equal = true;
		else
		    b = b.substring(1);
	    }
	}
	return equal;
    }

    public static boolean xyzThere(String str) {
	boolean truth = false;
	
	if (str.length() < 3)
	    return truth;
	else if (str.substring(0,3).equals("xyz"))
	    truth = true;
	else {
	    for (int i = str.length(); i > 3; i--){
		if (!(str.substring(0,1).equals(".")) && str.substring(1,4).equals("xyz")) {
		    truth = true;
		    str = str.substring(1);
		}
		else
		    str = str.substring(1);
	    }
	}
	return truth;
    }


    public static void main(String[] args){

	// System.out.println(doubleChar("The"));
	// System.out.println(doubleChar("AAbb"));
	// System.out.println(doubleChar("Hi-There"));
	// System.out.println(countHi("abc hi ho"));
	// System.out.println(countHi("ABChi hi"));
	// System.out.println(countHi("hihi"));
	// System.out.println(catDog("catdog"));
	// System.out.println(catDog("catcat"));
	// System.out.println(catDog("1cat1cadodog"));
	System.out.println(countCode("aaacodebbb"));
	System.out.println(countCode("codexxcode"));
	System.out.println(countCode("cozexxcope"));
	System.out.println(endOther("Hiabc", "abc"));
	System.out.println(endOther("AbC", "HiaBc"));
	System.out.println(endOther("abc", "abXabc"));
	System.out.println(xyzThere("abcxyz"));
	System.out.println(xyzThere("abc.xyz"));
	System.out.println(xyzThere("xyz.abc"));

    }

}