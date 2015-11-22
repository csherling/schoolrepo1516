import java.util.Scanner;

public class ScannerTestDrive {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    // if (sc.next().equals("stop"))
	    // 	break;
	    System.out.println(sc.next());
	    System.out.println(sc.next());
	    System.out.println(sc.next());
	}
    }
}