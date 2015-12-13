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
    

    // main method solely for testing purposes
    public static void main( String[] args ) 
    {
	OrderedArrayList Franz = new OrderedArrayList();

	System.out.println("\nValues to add via addLinear() calls:");

	// testing linear search
	for( int i = 0; i < 15; i++ ) {
	    int valToAdd = (int)( 50 * Math.random() );
	    System.out.println( valToAdd );
	    Franz.addBinary( valToAdd );
	}

	System.out.println("\nafter population via addLinear() calls:");
	System.out.println( Franz );
	System.out.println();

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class OrderedArrayList
 
