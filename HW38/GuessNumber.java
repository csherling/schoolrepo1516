/*  Christopher Sherling
    APCS1 pd5
    HW38 -- Keep Guessing
    2015-11-30 */

import cs1.Keyboard;

public class GuessNumber{

    //private int

    public static int rng(int x, int downBound, int upBound){
	int ctr = 1;
	String in;
	System.out.println("Guess a number from " + downBound + "-" + upBound);
	in = Keyboard.readString();
	int num = Integer.parseInt(in);
	if(num > x){
	    System.out.println("Too high, try again...");
	    ctr += rng(x, downBound, num - 1);
	}
	else if(num < x){
	    System.out.println("Too low, try again...");
	    ctr += rng(x, num + 1, upBound);
	}
	else{
	    return ctr;
	}
	return ctr;
    }

    public static void main(String[] args){
	int lol =rng((int)(Math.random() * 100) + 1, 1, 100);
	System.out.println("Correct! it took " + lol + " guesses");
    }

}