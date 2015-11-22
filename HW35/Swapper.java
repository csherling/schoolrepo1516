import cs1.Keyboard;

public class Swapper {
	
    public static void print2( String [][] a ) { 
	for (String [] s: a) {
	    for (String x: s) {
		System.out.print(x + " ,");
	    }
		
	    System.out.println();
	} 
    }

    public static void Swap (String sach [] []) {

	String firstrow;
	String firstcol;
	String secrow;
	String seccol;

	print2(sach);

	System.out.println("Please enter the row of the first string");
	firstrow = Keyboard.readString();

	System.out.println("Please enter the column of the first string");
	firstcol = Keyboard.readString();

	System.out.println("Please enter the row of the second string");
	secrow = Keyboard.readString();

	System.out.println("Please enter the column of the second string");
	seccol = Keyboard.readString();


	int firsrow = Integer.parseInt(firstrow);
	int secundorow = Integer.parseInt(secrow);
	int firstcolo = Integer.parseInt(firstcol);
	int secundocolo = Integer.parseInt(seccol);

	String temp = sach[firsrow][firstcolo];

	sach[firsrow][firstcolo] = sach[secundorow][secundocolo];
	sach[secundorow][secundocolo] = temp;

	print2(sach);


    }

	
    public static void main(String[] args) {
	String [] [] s = {{"Dog","Cat","Mouse"},{"Worm","Roach","Beatle"},{"Bat","Hawk","Raven"}};
	Swap(s);
	print2(s);
		
    }

}
