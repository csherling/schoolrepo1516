/*
Anton Goretsky
Christopher Sherling
WeDidItFirst
APCS pd5
HW17 GCD Three Ways
2015-10-16
 */

public class Stats{

    //Finds the mean with ints
    public static int mean(int a, int b){
	int c = (a + b) / 2;
	System.out.println("a:" + a + " b:" + b);
	return c;
    }

    //Finds the mean with doubles
    public static double mean(double a, double b){
	double c = (a + b) / 2;
	System.out.println("a:" + a + " b:" + b);
	return c;
    }
   
    //Finds the maximum of two ints
    public static int max(int a, int b){
	System.out.println("a:" + a + " b:" + b);
	if(a > b) {
	    return a;
	}
	else {
	    return b;
	}

    }
   
    //Finds the max of two doubles
    //Helper function for the new max of doubles
    public static double max2(double a, double b){
	if(a > b) {
	    return a;
	}
	else {
	    return b;
	}
    }
   
    //Finds the max of three doubles, using max2 as a helper function
    public static double max(double a, double b, double c){
	double d;
	double e;
	d = max2(a, b);
	e = max2(c, d);
	System.out.println("a:" + a + " b:" + b + " c:" + c);
	return e;
    }

    //Finds the geometric mean of 3 ints
    public static int geoMean(int a, int b, int c){
    	int d = (int)Math.pow((a * b * c), (1.0f / 3.0f));
	System.out.println("a:" + a + " b:" + b + " c:" + c);
    	return d;
    }

    //Finds the geometric mean of 3 doubles
    public static double geoMean(double a, double b, double c){
    	double d = (int)Math.pow((a * b * c), (1.0f / 3.0f));
	System.out.println("a:" + a + " b:" + b + " c:" + c);
    	return d;
    }

    public static int gcd(int a, int b) {

	int c = a;

	if (a > b)
	    c = b;

	while ((c > 0) && 
	       ((a % c != 0) ||
		(b % c != 0))
	       ){
	    c -= 1;
	}
	return c;
    }

    //If the larger of the two numbers is divisible by the smaller of the two numbers, then the GCD is the smaller number. If not, take the mod of the larger and the smaller, then keep doing so (with the result and the smaller number) until the result is zero

    public static int gcdEW(int a, int b) {

	int c = (int)max2(a, b);
	int d = (int)Math.min(a, b);

	if (c % d == 0)
	    return d;
	while ((d != 0) && (c != 0) && (c % d != 0)){
	    if (d > c)
		d = d % c;
	    else
		c = c % d;
	}

	return c;

    }

    public static int gcdER(int a, int b) {

	int c = (int)max2(a, b);
	int d = (int)Math.min(a, b);

	if (c % d == 0)
	    return d;
	else
	    return gcdER((c % d), d);
    }

    //Main method
    public static void main(String[] args){

	// int one;
	// int two;
	// int three;
	// double uno;
	// double dos;
	// double tres;

	// System.out.println("int mean");
	// one = mean(5, 15);
	// System.out.println(one);

	// System.out.println("double mean");
	// uno = mean(5.0, 15.0);
	// System.out.println(uno);

	// System.out.println("int max");
	// two = max(5, 15);
	// System.out.println(two);

	// System.out.println("double maxn");
	// dos = max(5.0, 15.0, 10.00);
	// System.out.println(dos);

	// System.out.println("int geo mean");
	// three = geoMean(3, 3, 3);
	// System.out.println(three);

	// System.out.println("double geo mean");
	// tres = geoMean(3.0, 3.0, 3.0);
	// System.out.println(tres);

	// System.out.println("GCD");
	// System.out.println(gcd(7, 7));

	System.out.println("GCDEW");
	System.out.println(gcdEW(240, 161));

	// System.out.println("GCDEW");
	// System.out.println(gcdEW(12, 12));

	// System.out.println("GCDEW");
	// System.out.println(gcdEW(12, 20));

	// System.out.println("GCDEW");
	// System.out.println(gcdEW(7, 3));

	// System.out.println("GCDER");
	// System.out.println(gcdER(20, 12));

	// System.out.println("GCDER");
	// System.out.println(gcdER(12, 12));

	// System.out.println("GCDER");
	// System.out.println(gcdER(12, 20));

	// System.out.println("GCDER");
	// System.out.println(gcdER(7, 3));

    }

}