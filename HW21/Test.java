public class Test{
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