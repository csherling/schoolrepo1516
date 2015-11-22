/*
  Christopher Sherling
  APCS1 pd5
  HW26 Objectify Your Array Tools 
  2015-11-09
*/

public class ArrayUtils{

    public static Object[] popArray(Object[] w, int x, int y){

	for(int i = 0; i < w.length; i++){
	    w[i] = x + (int)(Math.random() * (y - x));
	}
	return w;	
    }

    public static String[] stringify(Object[] a){
	String[] b = new String[a.length];

	for(int i = 0; i < a.length; i++){
	    b[i] = a[i] + "";
	}
	return b;
    }

    public static String printStringArray(String[] a){
	String s = "";

	for(int i = 0; i < a.length; i++){
	    s += a[i] + " ";
	}
	return s;
    }

    public static String stringifyAll(Object[] a){
	return printStringArray(stringify(a));
    }

    public static int linSearch(Object[] a, Object target){
	for(int i = 0; i < a.length; i++){
	    if(a[i] == target)
		return i;
	}
	return -1;
    }

   public static int freq(Object[] a, Object target){
	int ctr = 0;
	for(int i = 0; i < a.length; i++){
	    if(a[i] == target)
		ctr++;
	}
	return ctr;
    }

    public static void main(String[] args){
	Object[] arr = new Object[5];

	System.out.println(stringifyAll(popArray(arr, -5, 6)));

	Object[] a = new Object[3];

	System.out.println("\n" + "TESTING ARRAY STRINGIFIER");

	System.out.println("\n" + "ALL INTS");
	a[0] = 5; a[1] = 3; a[2] = 1;
	System.out.println(stringifyAll(a));

	System.out.println("\n" + "ALL DOUBLES");
	a[0] = -8.999; a[1] = 3.7; a[2] = 2.2;
	System.out.println(stringifyAll(a));

	System.out.println("\n" + "ALL STRINGS");
	a[0] = "unicorn"; a[1] = "3.7"; a[2] = "rainbow";
	System.out.println(stringifyAll(a));

	System.out.println("\n" + "RANDOM");
	a[0] = 5; a[1] = 3.7; a[2] = "rainbow";
	System.out.println(stringifyAll(a));

	Object[] test = {1, 2, 3, 3.9, "yes", "yes", "no", 3.9, "6", 2, 2};

	System.out.println("\n" + "TESTING LINSEARCH");
	System.out.println(stringifyAll(test));

	System.out.println("\n" + "INTS");
	System.out.println(linSearch(test, 2));
	System.out.println(linSearch(test, 4));
	System.out.println("\n" + "DOUBLES");
	System.out.println(linSearch(test, 3.9));
	System.out.println(linSearch(test, 6.94));
	System.out.println("\n" + "STRINGS");
	System.out.println(linSearch(test, "yes"));
	System.out.println(linSearch(test, "lol"));

	System.out.println("\n" + "TESTING FREQ");

	System.out.println("\n" + "INTS");
	System.out.println(freq(test, 2));
	System.out.println(freq(test, 4));
	System.out.println("\n" + "DOUBLES");
	System.out.println(freq(test, 3.9));
	System.out.println(freq(test, 6.94));
	System.out.println("\n" + "STRINGS");
	System.out.println(freq(test, "yes"));
	System.out.println(freq(test, "lol"));

    }
}
