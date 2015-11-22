/*  
    Christopher Sherling
    APCS1 pd5
    HW34 -- Arrays of Arrays
    2015-11-19 
*/

// Working file for 
// class TwoDimArray
// ...practice working with 2D arrays


public class TwoDimArray {

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a ) { 
	for(int i = 0; i < a.length; i++){
	    for(int j = 0; j < a[i].length; j++){
		System.out.print(a[i][j] + " ");
	    }
	    System.out.println("");
	}
    }

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOREACH loop
    public static void print2( int[][] a ) { 
    	for(int[] i: a){
    	    for(int j: i){
    		System.out.print(j + " ");
    	    }
    	    System.out.println("");
    	}
    }
    
    //postcond: returns sum of all items in 2D int array a
    public static int sum1( int[][] a ) { 
	int z = 0;
	for(int i = 0; i < a.length; i++){
	    for(int j = 0; j < a[i].length; j++){
		z += a[i][j];
	    }
	}
	return z;
    }

    //postcond: returns sum of all items in 2D int array a
    //          * uses helper fxn sumRow
    public static int sum2( int [][] m ) { 
	int z = 0;
	for(int i = 0; i < m.length; i++){
	    z += sumRow(i, m);
	}
	return z;
    }

    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOR loop
    public static int sumRow( int r, int[][] a ) { 
	int z = 0;
	for(int i = 0; i < a[r].length; i++){
	    z += a[r][i];
	}
	return z;
    }

    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOREACH loop
    public static int sumRow2(int r, int[][] m){ 
	int z = 0;
    	for(int i: m[r]){
	    z += i;
	}
	return z;
    }
    /*
    */
    public static void main(String [] args) {

	int [][] m1 = new int[4][2];
	int [][] m2 = { {2,4,6}, {3,5,7} };
	int [][] m3 = { {2}, {4,6}, {1,3,5} };
	print1(m1);
	print1(m2);
	print1(m3);
	print2(m1);
	print2(m2);
	print2(m3);

	System.out.print("testing sum1...\n");
	System.out.println("sum m1 : " + sum1(m1));
	System.out.println("sum m2 : " + sum1(m2));
	System.out.println("sum m3 : " + sum1(m3));
	System.out.print("testing sum2...\n");
	System.out.println("sum m1 : " + sum2(m1));
	System.out.println("sum m2 : " + sum2(m2));
	System.out.println("sum m3 : " + sum2(m3));
	System.out.print("testing sumRow...\n");
	System.out.println("sumRow m1 : " + sumRow(1, m1));
	System.out.println("sumRow m2 : " + sumRow(1, m2));
	System.out.println("sumRow m3 : " + sumRow(1, m3));
	System.out.print("testing sumRow2...\n");
	System.out.println("sumRow2 m1 : " + sumRow2(1, m1));
	System.out.println("sumRow2 m2 : " + sumRow2(1, m2));
	System.out.println("sumRow2 m3 : " + sumRow2(1, m3));


	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class TwoDimArray
