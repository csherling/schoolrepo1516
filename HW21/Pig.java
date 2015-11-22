/*
Christopher Sherling
APCS pd5
HW21 Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay 
2015-10-26
 */

//class Pig --- SKELETON
//a Pig Latin translator

public class Pig {

    private static final String VOWELS = "aeiou";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA(“cat”, “a”) → true  
      hasA(“cat”, “p”) → false
      =====================================*/
    public static boolean hasA( String w, String letter ) {

	for(int i = w.length(); i > 0; i--){
	    if (w.substring(0,1).equals(letter))
		return true;
	    w = w.substring(1,i);
	}

	//your implementation here
	return false; //placeholder to get past compiler

    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) {
	if (VOWELS.indexOf(letter) != -1)
	    return true;
	else
	    return false; //placeholder to get past compiler
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels(“meatball”) → 3
      =====================================*/
    public static int countVowels( String w ) {
	int ctr = 0;
	for(int i = w.length(); i > 0; i--){
	    if (isAVowel(w.substring(0,1)))
		ctr += 1;
	    w = w.substring(1,i);
	}
	//your implementation here
	return ctr; //placeholder to get past compiler
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel(“cat”) → true
      hasAVowel(“zzz”) → false
      =====================================*/
    public static boolean hasAVowel( String w ) {

	for(int i = w.length(); i > 0; i--){
	    if (isAVowel(w.substring(0,1)))
		return true;
	    w = w.substring(1,i);
	}
	//your implementation here
	return false; //placeholder to get past compiler
    }


    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels(“meatball”) → “eaa”
      =====================================*/
    public static String allVowels( String w ) {
	String v = "";
	for(int i = w.length(); i > 0; i--){
	    if (isAVowel(w.substring(0,1)))
		v += w.substring(0,1);
	    w = w.substring(1,i);
	}
	//your implementation here
	return v; //placeholder to get past compiler
    }


    /*=====================================
      String firstVowel(String) -- returns first vowel in a String
      pre:  w != null
      post: firstVowel("") --> ""
      firstVowel("zzz") --> ""
      firstVowel("meatball") --> "e"
      =====================================*/
    public static String firstVowel( String w ) {
	for(int i = w.length(); i > 0; i--){
	    if (isAVowel(w.substring(0,1)))
		return w.substring(0,1);
	    w = w.substring(1,i);
	}
	//your implementation here
	return ""; //placeholder to get past compiler
    }


    /*=====================================
      boolean beginsWithVowel(String) -- tells whether String begins with a vowel
      pre:  w != null and w.length() > 0
      post: beginsWithVowel("apple")  --> true
      beginsWithVowel("strong") --> false
      =====================================*/
    public static boolean beginsWithVowel( String w ) {
	if (w.length() == 0)
	    return false;
	if (isAVowel(w.substring(0,1)))
	    return true;
	return false; //placeholder to get past compiler
    }


    /*=====================================
      String engToPig(String) -- converts an English word to Pig Latin
      pre:  w.length() > 0
      post: engToPig("apple")  --> "appleway"
      engToPig("strong") --> "ongstray"
      engToPig("java")   --> "avajay"
      =====================================*/
    public static String engToPig( String w ) {
	String x = "";
	if (beginsWithVowel(w))
	    return w + "way";
	for (int i = w.length(); i > 0; i--){
	    if (beginsWithVowel(w) || w.substring(0,1).equals("y"))
		return w + x + "ay";
	    else
		x += w.substring(0,1);
	    w = w.substring(1,i);
	}
	//your implementation here
	return x;//placeholder to get past compiler
    }


    public static void main( String[] args ) {

	System.out.println(hasA("lol", "o"));
	System.out.println(hasA("lel", "o"));
	System.out.println(hasA("", "o"));
	System.out.println(isAVowel("o"));
	System.out.println(countVowels(""));
	System.out.println(countVowels("ll"));
	System.out.println(countVowels("lol"));
	System.out.println(countVowels("lool"));
	System.out.println(hasAVowel(""));
	System.out.println(hasAVowel("ll"));
	System.out.println(hasAVowel("lol"));
	System.out.println(allVowels(""));
	System.out.println(allVowels("ll"));
	System.out.println(allVowels("lol"));
	System.out.println(firstVowel(""));
	System.out.println(firstVowel("ll"));
	System.out.println(firstVowel("lol"));
	System.out.println(firstVowel("lool"));
	System.out.println(beginsWithVowel(""));
	System.out.println(beginsWithVowel("ol"));
	System.out.println(beginsWithVowel("ll"));
	System.out.println(engToPig("oink"));


	//Some test calls. You are encouraged to add more.
	/*
	  String letter = "p";

	  for( String w : args ) {
	  System.out.println( w + " has " + letter + "? " 
	  + hasA( w, letter ) );
	  }   
	*/

	for( String word : args ) {
	    System.out.println( allVowels(word) );
	    System.out.println( firstVowel(word) );
	    System.out.println( countVowels(word) );
	    System.out.println( engToPig(word) );
	}

    }//end main()

}//end class Pig

