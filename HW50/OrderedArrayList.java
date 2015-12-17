/*
  Christopher Sherling, Advay Sriram, Vincent Alykin TEAM ALEKSWAG
  APCS1 PD5
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
    
    

    // determine whether element present in data structure using linear search
    // return index of occurrence or -1 if not found
    public int findLin( Comparable target ) { 
	for(int i = 0; i < _data.size(); i++){
	    if(_data.get(i).compareTo(target) == 0){
		return i;
	    }
	}
	return -1;
    }
    public int binSearch (Comparable target, int hi, int lo){
    	if (hi == lo){
	    return -1;
    	}
    	else if(_data.size() == 0){
	    return -1;
    	}
    	int i = (hi + lo)/2;
    	if(_data.get(i).compareTo(target) == 0){
	    return i;
    	}
    	else if (_data.get(i).compareTo (target) < 0){
	    return binSearch (target, i, lo);
    	}
    	else {
	    return binSearch (target, hi, i + 1);
    	}
    }

    public long testLin(Comparable target){
	long init;
	long outit;
	init = System.currentTimeMillis();
	this.findLin(target);
	outit = System.currentTimeMillis();
	return outit - init;
    }

    // main method solely for testing purposes
    
    public long testbin (Comparable target, int hi, int lo){
    	long in, out;
    	
    	in = System.currentTimeMillis ();
    	this.binSearch (target, hi, lo);
    	out = System.currentTimeMillis ();
    	return out-in;
    	
    }
    public static void main( String[] args ) {
	int s = 1000000;
	int p = 1;
	OrderedArrayList Franz = new OrderedArrayList();

	System.out.println("\nValues to add via addLinear() calls:");
	// testing linear search
	for( int i = 0; i < s; i++ ) {
	    int valToAdd = (int)( p * Math.random() );
	    //System.out.println( valToAdd );
	    Franz.addBinary( valToAdd );
	}
	
	Franz.addBinary(p/2);

	
	System.out.println("\nafter population via addLinear() calls:");
	System.out.println( Franz );
	System.out.println();

	//System.out.println(Franz.testLin(p));
	// System.out.println(Franz.testLin(p));
	// System.out.println(Franz.testLin(p));
	// System.out.println(Franz.testLin(p));
	// System.out.println(Franz.testLin(p));
	// System.out.println(Franz.testLin(p/2));
	// System.out.println(Franz.testLin(3*p/4));
	// System.out.println(Franz.testLin(7*p/8));
	// System.out.println(Franz.testLin(15*p/16));
	// System.out.println(Franz.testLin(31*p/32));
	// System.out.println(Franz.testLin(63*p/64));
	// System.out.println(Franz.testLin(127*p/128));
	System.out.println(Franz.testbin(p, s - 1 ,0));
	// System.out.println(Franz.testbin(p/2, s - 1, 0));
	// System.out.println(Franz.testbin(3*p/4, s - 1 ,0));
	// System.out.println(Franz.testbin(7*p/8, s - 1, 0));
	// System.out.println(Franz.testbin(15*p/16, s - 1 ,0));
	// System.out.println(Franz.testbin(31*p/32, s - 1, 0));
	// System.out.println(Franz.testbin(63*p/64, s - 1 ,0));
	// System.out.println(Franz.testbin(127*p/128, s - 1, 0));


	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class OrderedArrayList
 
