/*
  Christopher Sherling
  APCS1 pd5
  HW25 Recurse, Recurse, on Elements Not the First! . 
  2015-11-05
*/

public class Loopier{

    public static int linSearch(int[] a, int target){
	for(int i = 0; i < a.length; i++){
	    if(a[i] == target)
		return i;
	}
	return -1;
    }

    public static int[] oneLess(int[] a){
	int[] b = new int[a.length - 1];
	for (int i = 0; i < a.length -1; i++){
	    b[i] = a[i + 1];
	}
	return b;
    }

    public static int rekt(int[] a, int target){
	int ctr = 0;
	int olength = a.length;

	if(a.length == 0){
	    return 0;
	}
	else if(a[0] == target)
	    return 0;
	else
	    ctr = 1 + rekt(oneLess(a), target);
	return ctr;
    }

    public static int linSearchR(int[] a, int target){
	if (a.length == rekt(a, target))
	    return -1;
	else 
	    return rekt(a, target);
    }
    
    public static int freq(int[] a, int target){
	int ctr = 0;
	for(int i = 0; i < a.length; i++){
	    if(a[i] == target)
		ctr++;
	}
	return ctr;
    }

    public static int freqR(int[] a, int target){
	int ctr = 0;
	if (a.length == 0)
	    return 0;
	else if (a[0] == target)
	    ctr = 1 + freqR(oneLess(a), target);
	else
	    ctr = freqR(oneLess(a), target);
	return ctr;
    }

    public static String stringify(int[] a){
	String s = "";

	for(int i = 0; i < a.length; i++){
	    s += a[i] + " ";
	}
	return s;
    }

    public static void main(String[] args){
	int[] x = {5, 5, 4, 9};
	System.out.println(linSearch(x, 2));
	System.out.println(stringify(oneLess(x)));
	System.out.println(linSearchR(x, 5));
	System.out.println(linSearchR(x, 4));
	System.out.println(linSearchR(x, 8));
	System.out.println(freq(x, 4));
	System.out.println(freqR(x, 4));
	System.out.println(freqR(x, 5));
    }

}