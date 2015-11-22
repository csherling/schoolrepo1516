public class DrivingStats{

    public static void main(String[] args){

	int one;
	int two;
	int three;
	double uno;
	double dos;
	double tres;

	System.out.println("int mean");
	one = Stats.mean(5, 15);
	System.out.println(one);

	System.out.println("double mean");
	uno = Stats.mean(5.0, 15.0);
	System.out.println(uno);

	System.out.println("int max");
	two = Stats.max(5, 15);
	System.out.println(two);

	System.out.println("double maxn");
	dos = Stats.max(5.0, 15.0, 10.00);
	System.out.println(dos);

	System.out.println("int geo mean");
	three = Stats.geoMean(3, 3, 3);
	System.out.println(three);

	System.out.println("double geo mean");
	tres = Stats.geoMean(3.0, 3.0, 3.0);
	System.out.println(tres);


    }

}