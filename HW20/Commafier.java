/*
Christopher Sherling
APCS pd5
HW18 For the *Lulz* Love of Strings.
2015-10-19
 */

public class Commafier {


    // public static String commafyR(int n) {
    // 	String st = n + "";
    // 	int i = st.length();
    // 	if (i < 4)
    // 	    return st;
    // 	else{
    // 	    String sub = st.substring(i - 3, i);
    // 	    String subTwo = st.substring(0, i - 3);
    // 	    int newI = Integer.parseInt(sub);
    // 	    int newIT = Integer.parseInt(subTwo);
    // 	    String full = "";
    // 	    full = commafyR(newIT) + "," + sub + full;
    // 	    return full;
    // 	}
    // }

    public static String commafyR(int n) {
	String x = n + "";
	if (n < 1000)
	    return x;
	else 
	    return commafyR( n/1000 ) + "," + x.substring( x.length() - 3);
    }


    // public static String commafyF(int n) {
    // 	String st = n + "";
    // 	String full = "";
    // 	if (st.length() < 4)
    // 	    return st;
    // 	for (int i = st.length(); i > 3; i -= 3){
    // 	    String sub = st.substring(0, i - 3);
    // 	    String subTwo = st.substring(i - 3, i);
    // 	    if (i == 4)
    // 		full = sub + "," + subTwo + full;
    // 	    if (i == 5)
    // 		full = sub + "," + subTwo + full;
    // 	    if (i > 5)
    // 		full = "," + subTwo + full;
    // 	    st = sub;
    // 	}
    // 	return full;
    // }

    public static String commafyF( int n ){
	String x = n + "";

	for( int pos = x.length()-3; pos > 0; pos -= 3) {
	    x = x.substring( 0 , pos ) + "," + x.substring( pos );
	}
	return x;
    }

    public static void main( String[] args ) { 
	System.out.println( "commafyR(1): " + commafyR(1) ); 
	System.out.println( "commafyR(10): " + commafyR(10) ); 
	System.out.println( "commafyR(101): " + commafyR(101) ); 
	System.out.println( "commafyR(1000): " + commafyR(1000) ); 
	System.out.println( "commafyR(12345): " + commafyR(12345) ); 
	System.out.println( "commafyR(1234567890): " + commafyR(1234567890) ); 
 
	System.out.println( "commafyF(1): " + commafyF(1) ); 
	System.out.println( "commafyF(10): " + commafyF(10) ); 
	System.out.println( "commafyF(101): " + commafyF(101) ); 
	System.out.println( "commafyF(1000): " + commafyF(1000) ); 
	System.out.println( "commafyF(12345): " + commafyF(12345) ); 
	System.out.println( "commafyF(1234567890): " + commafyF(1234567890) );

    // 	for( String s : args ) {
    // 	    int i = s.length();
    // 	    String full = "";

    // 	    if (i < 4)
    // 		System.out.println(s);
    // 	    else {
    // 		while (i > 2){
    // 		    i = s.length();
    // 		    if (i == 3)
    // 			full = s + full;
    // 		    if (i == 4){
    // 			full = s.substring(0,1) + "," + s.substring(1,4) + full;
    // 		    }
    // 		    if (i == 5){
    // 			full = s.substring(0,2) + "," + s.substring(2,5) + full;
    // 		    }
    // 		    if (i > 5){
    // 			String sub = s.substring(i - 3, i);
    // 			String subTwo = s.substring(0, i - 3);
    // 			full = "," + sub + full;
    // 			s = subTwo;
    // 		    }
    // 		    i -= 3;
    // 		}
    // 		System.out.println(full);
    // 	    }
    // 	}
    }

}//end class 