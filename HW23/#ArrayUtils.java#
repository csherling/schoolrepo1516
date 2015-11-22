public class ArrayUtils{

    public static int[] popArray(int[] w, int x, int y){

	for(int i = 0; i < w.length; i++){
	    w[i] = x + (int)(Math.random() * (y - x));
	}
	return w;	
    }

    public static String[] stringify(int[] a){
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

    public static String stringifyAll(int[] a){
	return printStringArray(stringify(a));
    }

    public static void main(String[] args){
	int[] arr = new int[5];

	System.out.println(stringifyAll(popArray(arr, -5, 6)));

	int[] a = new int[3];

	a[0] = 5; a[1] = 3; a[2] = 1;

	System.out.println(stringifyAll(a));


    }
}
