/*****************************
 * SKELETON for
 * class SuperArray --  A wrapper class for an array. 
 * Maintains functionality:
 *  access value at index
 *  overwrite value at index
 * Adds functionality to std Java array:
 *  resizability
 *  ability to print meaningfully
 *****************************/

public class SuperArray {

		//~~~~~INSTANCE VARS~~~~~
		//underlying container, or "core" of this data structure:
    private int[] _data;

		//position of last meaningful value
    private int _lastPos;

		//size of this instance of SuperArray
    private int _size;

		
		//~~~~~METHODS~~~~~
    //default constructor – initializes 10-item array
    
    public SuperArray() { 
	_data = new int[10];	
}

		
    //output array in [a,b,c] format, eg
    // {1,2,3}.toString() -> "[1,2,3]"
    public String toString() { 
	String info = "[";
	for(int i = 0; i < this._data.length; i++){
	    if(i < this._data.length - 1){
		info += this._data[i] + ", ";
	    }
	    else{
		info += this._data[i];
	    }
	}
	info += "]";
	return info;
    }




    //double capacity of this SuperArray
    private void expand() { 
	int[] temp = new int[this._data.length * 2];
	for(int i = 0; i < this._data.length; i++){
	    temp[i] = this._data[i];
	}
	this._data = temp;
    }				
    //accessor -- return value at specified index
    public int get( int index ) { 
	return this._data[index];
    }		
    //mutator -- set value at index to newVal, 
    //           return old value at index
    public int set( int index, int newVal ) { 
	int oldVal = this._data[index];
	this._data[index] = newVal;
	return oldVal;
    }

    //main method for testing
    public static void main( String[] args ) {
	SuperArray sa = new SuperArray();
	System.out.println(sa.toString());
	sa.set(0, 1);
	sa.set(1, 2);
	sa.set(2, 3);
	sa.set(3, 4);
	sa.set(4, 5);
	sa.set(5, 6);
	sa.set(6, 7);
	sa.set(7, 8);
	sa.set(8, 9);
	sa.set(9, 10);
	System.out.println(sa.toString());
	System.out.println(sa.get(2));
	sa.expand();
	System.out.println(sa.toString());
	sa.set(10, 11);
	sa.set(11, 12);
	sa.set(12, 13);
	sa.set(13, 14);
	sa.set(14, 15);
	sa.set(15, 16);
	sa.set(16, 17);
	sa.set(17, 18);
	sa.set(18, 19);
	sa.set(19, 20);
	System.out.println(sa.toString());
	System.out.println(sa.get(0));
	System.out.println(sa.get(1));
	System.out.println(sa.get(2));
	System.out.println(sa.get(3));
	System.out.println(sa.get(4));
	System.out.println(sa.get(5));
	System.out.println(sa.get(6));
	System.out.println(sa.get(7));
	System.out.println(sa.get(8));
	System.out.println(sa.get(9));
    }//end main
		
}//end class
