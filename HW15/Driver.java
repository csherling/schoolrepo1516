/*
Christopher Sherling
APCS pd5
HW15 Loopy
2015-10-13
 */

/*=============================
  driver for class Coin
  ~~~ SUGGESTED WORKFLOW: ~~~
  1. Compile this file and run.
  2. Cut&paste the "TOP" line below the first statement. 
  (with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
  3. Compile and run again. 
  4. Resolve errors 1 at a time until it works
  5. Repeat 2-4 until TOP meets BOTTOM
  =============================*/

public class Driver {


    public static void main( String[] args ) {

	//build Objects from blueprint specified by class Coin

	//test default constructor
	Coin mine = new Coin();

	//test 1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//test 2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );


	//test toString() methods of each Coin
	System.out.println("mine: " + mine);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//test flip() method
	System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//test equals() method


	System.out.println("---------------------------------");
	System.out.println("HEAD COUNTER");
	while (wayne.headsCtr < 5) {

	    wayne.flip();
	    System.out.println("Wayne: " + wayne);
	    System.out.println(wayne.getHeadsCtr());
	}

	System.out.println("---------------------------------");
	System.out.println("Match counter");
	while (wayne.getMatchCtr() < 5) {
	    yours.flip();
	    wayne.flip();
	    // System.out.println(yours.getUpFace());
	    // System.out.println(wayne.getUpFace());
	    // System.out.println(yours.equals(wayne));
	    // System.out.println(wayne.getMatchCtr());
	    // System.out.println();
	    if ( yours.equals(wayne) ) {
	    	System.out.println( "Matchee matchee!" );
	    	wayne.increaseMatchCtr();
		System.out.println(wayne.getMatchCtr());
	    }
	    else {
	    	System.out.println( "No match. Firestarter you can not be." );
		System.out.println(wayne.getMatchCtr());
	    }

	}

	System.out.println("---------------------------------");
	System.out.println("Match counter 13");

// 	while (
//  (wayne.getMatchCtr() %  wayne.getValue() != 0) 
// && 
// (wayne.getMatchCtr() %  yours.getValue() != 0)
// ) { 
// 	    wayne.flip();
// 	    yours.flip();
// 	    if ( yours.equals(wayne) ) {
// 	    	//System.out.println( "Matchee matchee!" );
// 	    	wayne.increaseMatchCtr();
// 		//System.out.println(wayne.getMatchCtr());
// 	    }
// 	    else {
// 	    	//System.out.println( "No match. Firestarter you can not be." );
// 		//System.out.println(wayne.getMatchCtr());
// 	    }
// 	    System.out.println(wayne.getMatchCtr());
// 	    System.out.println(wayne.getHeadsCtr());
// 	    System.out.println(wayne.getTailsCtr());
// 	    System.out.println(yours.getHeadsCtr());
// 	    System.out.println(yours.getTailsCtr());
// 	}
	System.out.println(wayne.getMatchCtr());


	/*===================TOP==========================
	    ====================BOTTOM======================*/

    }//end main

}//end class
