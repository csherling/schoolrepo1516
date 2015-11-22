public class Stats{

    public static int mean(int a, int b){
	int c = (a + b) / 2;
	return c;
    }

    public static double mean(double a, double b){
	double c = (a + b) / 2;
	return c;
    }
   
    public static int max(int a, int b){
	if(a > b) {
	    return a;
	}
	else {
	    return b;
	}
    }
   
    public static double max(double a, double b){
	if(a > b) {
	    return a;
	}
	else {
	    return b;
	}
    }

    public static int geoMean(int a, int b){
	int c = (int)Math.sqrt(a * b);
	return c;
    }

    public static double geoMean(double a, double b){
	double c = Math.sqrt(a * b);
	return c;
    }

    public static void main(String[] args){
	int one;
	int two;
	int three;
	double uno;
	double dos;
	double tres;

	one = mean(5, 15);
	uno = mean(5.0, 15.0);
	two = max(5, 15);
	dos = max(5.0, 15.0);
	three = geoMean(5, 15);
	tres = geoMean(5.0, 15.0);

	System.out.println(one);
	System.out.println(uno);
	System.out.println(two);
	System.out.println(dos);
	System.out.println(three);
	System.out.println(tres);

    //typecast (int)4.2; --> 4

    }
}