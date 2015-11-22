public class Fooya {

    public boolean booya(int a) {

        a = 4; return true;

    }

    public int hooya() {

	int a = 1; int b = 2; int c = 3;

	if ( a == 1 || booya(a) )         {return c;}

	else if ( b == 1 || booya(a) )  {return b;}

    }

    public static void Fooya() {

	int a = 42;

	System.out.println( hooya() + this.c );

    }
}