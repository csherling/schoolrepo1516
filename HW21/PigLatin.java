public class PigLatin{
    public static String trans(String s){
	String f = s.substring(0, 1);
	if (f.equals("a") || f.equals("e") || f.equals("i") || f.equals("o") || f.equals("u"))
    }

    public static void main(String[] args){
	String foo = "bar";

	System.out.println(foo.indexOf("b"));
	System.out.println(foo.indexOf("a"));
	System.out.println(foo.indexOf("r"));
	System.out.println(foo.indexOf("f"));
	System.out.println(foo.indexOf("ar"));
	System.out.println(foo.indexOf("arr"));
	System.out.println("bar".indexOf("b"));
	System.out.println("bar".indexOf("a"));
	System.out.println("bar".indexOf("r"));
	System.out.println("bar".indexOf("f"));
	System.out.println("bar".indexOf("ar"));
	System.out.println("bar".indexOf("arr"));
	System.out.println("bar".indexOf("bar"));
    }
}

/*

First, create class Translator and a main() fxn...

public class Translator {

    private static final String VOWELS = "aeiou";
     public static void main( String[] args) {
     String letter = "a";
     for( String w : args ) {
      System.out.println( w + "contains " + letter + ": " + hasA(w,letter) );
     }
    }
}

N: Final is a JAva keyword to denote a CONSTANT.
(convention is to use CAPS to name constant vars)
Q: Why is it a good idea to have the VOWELS constant?