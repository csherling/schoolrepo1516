/*
Christopher Sherling
APCS PD5
HW47 Halving the Halves
2015-12-12
 */

/*============================================
  class OrderedArrayList
  Wrapper class for ArrayList.
  Imposes the restriction that stored items 
  must remain sorted in ascending order
  ============================================*/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;


public class OrderedArrayList {

    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList() {
	_data = new ArrayList<Comparable>();
    }


    public String toString() { 
	return _data.toString(); 
    }


    public Comparable remove( int index ) { 
	return _data.remove(index); 
    }


    public int size() { 
	return _data.size();
    }

    
    public Comparable get( int index ) { 
	return _data.get(index); 
    }


    // addLinear takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index
    public void addLinear( Comparable newVal ) 
    { 
	for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { //newVal < oal[p]
		_data.add( p, newVal );
		return; //Q:why not break?
	    }
	}
	_data.add( newVal ); //newVal > every item in oal, so add to end
    }


    // addBinary takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a binary search to find appropriate index
    public void addBinary( Comparable newVal ) { 
	//initialize upperbound, lowerbound and median
	int lo = 0;
	int hi = _data.size()-1;
	//int med = (lo + hi)/2; //no	
	addBinaryR(newVal, hi, lo);
    }	

    //Binary function recursive. Called by he original
    public void addBinaryR(Comparable newVal, int hi, int lo){
	int med = (hi + lo)/2;

	if(_data.size() == 0) //if data is size 0, just add
	    _data.add(newVal);
	else if(hi == lo){ //if data is size 1 or unluckiest guess reached
	    if(newVal.compareTo(_data.get(med)) > 0)
		_data.add(newVal);
	    else
		_data.add(med, newVal);
	}
	else{ //if data size is >1
	    if((newVal.compareTo(_data.get(med)) >= 0) &&
		(newVal.compareTo(_data.get(med+1)) <= 0))
		_data.add(med+1, newVal);
	    else if(newVal.compareTo(_data.get(med)) > 0)
		addBinaryR(newVal, hi, med + 1);
	    else 
		addBinaryR(newVal, med, lo);
	}
    }
    

    public int findLin(Comparable target) {
	for(int i = 0; i < _data.size(); i++){
	    if(_data.get(i).compareTo(target) == 0){
		return i;
	    }
	}
	return -1;
    }

    // main method solely for testing purposes
    public static void main( String[] args ) {

	int s = 100000;
	int p = 500;
    
	OrderedArrayList Franz = new OrderedArrayList();

	System.out.println("\nValues to add via addLinear() calls:");
	long init;
	long outit;
	init = System.currentTimeMillis();
        // testing linear search
	for( int i = 0; i < s; i++ ) {
	    int valToAdd = (int)( p * Math.random() );
	    //System.out.println( valToAdd );
	    Franz.addBinary( valToAdd );
	}
	outit = System.currentTimeMillis();
	Franz.addBinary(p/2);
	/*
	OrderedArrayList Ferd = new OrderedArrayList();

	long init1;
	long outit1;
	init1 = System.currentTimeMillis();
	// testing linear search
	for( int j = 0; j < s; j++ ) {
	    int valToAdd = (int)( p * Math.random() );
	    //System.out.println( valToAdd );
	    Ferd.addBinary( valToAdd );
	}
	outit1 = System.currentTimeMillis();

	OrderedArrayList F2 = new OrderedArrayList();

	long init2;
	long outit2;
	init2 = System.currentTimeMillis();
	// testing linear search
	for( int k = 0; k < s; k++ ) {
	    int valToAdd = (int)( p * Math.random() );
	    //System.out.println( valToAdd );
	    F2.addBinary( valToAdd );
	}
	outit2 = System.currentTimeMillis();

	OrderedArrayList F3 = new OrderedArrayList();

	long init3;
	long outit3;
	init3 = System.currentTimeMillis();
	// testing linear search
	for( int l = 0; l < s; l++ ) {
	    int valToAdd = (int)( p * Math.random() );
	    //System.out.println( valToAdd );
	    F3.addBinary( valToAdd );
	}
	outit3 = System.currentTimeMillis();

	OrderedArrayList F4 = new OrderedArrayList();
	long init4;
	long outit4;
	init4 = System.currentTimeMillis();
	// testing linear search
	for( int m = 0; m < s; m++ ) {
	    int valToAdd = (int)( p * Math.random() );
	    //System.out.println( valToAdd );
	    F4.addBinary( valToAdd );
	}
	outit4 = System.currentTimeMillis();
*/
	//addlin
	//1 mil

	//addbin
	//1 mil, 5mil, 450575 millis
	//1 mil, 500k, 445610 millis
	//1 mil, 50k, 454353 millis
	//1 mil, 5k, 449684 millis
	//1 mil, 500, 440244 millis
	//1 mil, 50, 438579 millis
	//1 mil, 5, 430708 millis
	//1 mil, 1, 417445 millis 
	//100k, 5mil, 2167
	//100k, 500k, 2242
	//100k, 50k, 2166
	//100k, 5k, 2139
	//100k, 500, 2107
	//100k, 50, 2083
	//100k, 5, 2067
	//100k, 1, 2050
	//10k, 5mil, 52
	//10k, 500k, 52
	//10k, 50k, 52
	//10k, 5k, 51
	//10k, 500, 50
	//10k, 50, 48
	//10k, 5, 42
	//10k, 1, 39
	//1k, 5 mil, 22
	//1k, 500k, 22
	//1k, 50k, 22
	//1k, 5k, 21
	//1k, 500, 20
	//1k, 50, 16
	//1k, 5, 10
	//1k, 1, 7
	//100, 5 mil, 2
	//100, 500k, 2
	//100, 50k, 2
	//100, 5k, 2
	//100, 500, 2
	//100, 50, 1
	//100, 5, 1
	//100, 1, 0 

	System.out.println("\nafter population via addLinear() calls:");
	System.out.println( Franz );
	System.out.println();
	long a = (outit - init);
	// long a1 = (outit1 - init1);
	// long a2 = (outit2 - init2);
	// long a3 = (outit3 - init3);
	// long a4 = (outit4 - init4);


	System.out.println(a);
	// System.out.println(a1);
	// System.out.println(a2);
	// System.out.println(a3);
	// System.out.println(a4);
	// System.out.println((a + a1 + a2 + a3 + a4) / 5);
	int li;
	long in;
	long out;
	in = System.currentTimeMillis();
	li = Franz.findLin(p);
	out = System.currentTimeMillis();	
	int li1;
	long in1;
	long out1;
	in1 = System.currentTimeMillis();
	li1 = Franz.findLin(p/2);
	out1 = System.currentTimeMillis();	


	long b = (out - in);
	long b1 = (out1 - in1);
	System.out.println(li);
	System.out.println(b);
	System.out.println(li1);
	System.out.println(b1);
	    

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class OrderedArrayList
 
