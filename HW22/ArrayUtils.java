public class Array{
    /*
    public static void popArray(Array w, int x, int y){

	

    }
    */
    public static String[] stringify(int[] a){
	
	String[] b = new String[a.length];

	for(int i = 0; i < a.length; i++){

	    b[i] = a[i] + "";

	}

	return b;

    }

    public static void main(String[] args){


	int[] a = new int[3];

	a[0] = 5; a[1] = 3; a[2] = 1;

	System.out.println(stringify(a));

    }



}
