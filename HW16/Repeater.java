/*
Christopher Sherling
APCS pd5
HW16 Do I repeat myself? Very well, then I repeat myself  I am possibly unending, I contain potentially multitudes
2015-10-15
 */

public class Repeater {

    //fenceW. Makes a fence with the number of posts given.
    public static String fenceW(int posts) {

	// if (posts < 1)
	//     return "";

	String fence;
	fence = "|";

	while (posts > 1) {
	    System.out.println("post: " + posts);
	    fence += "--|";
	    posts -= 1;
	}
	return fence;
    }

    //fenceR. Makes a fence with the number of posts given.
    public static String fenceR(int posts) {

	String fence;
	fence = "|--";

	if (posts > 1) {
	    System.out.println("post: " + posts);
	    posts -= 1;
	    fence += fenceR(posts);
	}
	else {
	    fence = "|";
	}

	return fence;

	/*
	  if (posts < 1)
	  return "";

	  if (posts < 2)
	  return "|"
	  else
	  return fenceR(posts-1) + "--|";
	 */


    }

    public static void main(String[] args){
	System.out.println("TESTING fenceW");
	System.out.println(fenceW(1) + "\n");
	System.out.println(fenceW(2) + "\n");
	System.out.println(fenceW(3) + "\n");
	System.out.println("\n TESTING fenceR");
	System.out.println(fenceR(1) + "\n");
	System.out.println(fenceR(2) + "\n");
	System.out.println(fenceR(3) + "\n");
    }
}