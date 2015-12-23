
import java.util.ArrayList;
public class Test{

    public static void main(String[] args){
	ArrayList glen = new ArrayList<Integer>();
	  
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	/*
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  
	  selectionSortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	  
	  System.out.println(getMinIndex(glen));
	*/
	ArrayList s = new ArrayList();
	  
	s = glen;
	s.set(0,3);
	System.out.println(glen);

    }
}