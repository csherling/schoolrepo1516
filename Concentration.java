/*  Team GitRektAgain - Sachal Malick, Vincent Alykin, Christopher Sherling, Mei Huang
    APCS1 pd5
    HW36 -- Some Folks Call It a Memory
    2015-11-23 */
    
/*  Team Christo Meith  - Mei Huang, Christopher Sherling
    APCS1 pd5
    HW36 -- Some Folks Call It a Memory (Revised)
    2015-11-23 */

import java.util.Scanner;

//import cs1.Keyboard;  //if comfortable with Scanner, you may comment this out

		
public class Concentration{
	
		

    //instance variables
    private Tile[][] _board;     //storage for 4x4 grid of Tiles.
    private int _numberFaceUp;   //count of Tiles with faces visible
    //private String[] _words = {"art", "art", "bob", "bob", "cat", "cat","dog","dog","eel","eel","fin","fin","get","get","ice","ice"};     //list of unique Strings used for Tile vals
    private String[] _words;
    private static int _numRows = 4;


    //insert constructor and methods here
    public Concentration() {
	_board = new Tile [4][4];
	_numberFaceUp = 0;
	_words = new String[] {"art","bob","cat","dog","eel","fin","get","ice"};
    }
    
    public void print2() {
    	Tile [] [] a = this._board;
    	for (Tile [] s: a) {
    	    for (Tile x: s) {
    		System.out.print(x);
    	    }
    		
    	    System.out.println();
    	} 
    }
String[] temp = new String[16];
    private void swap( int i, int j ) {
	String extra = temp[i];
	temp[i] = temp[j];
	temp[j] = extra;
    }
	
    public void randomize(String[] a) {
	for (int i=0; i< a.length;i++){
	    swap(i, (int)(Math.random()*(a.length)));
		}
    }
		
    public void populate(){
	//temp array	
	//String[] temp = new String[16];
	for(int y=0; y<_words.length; y++){
		temp[y] = _words[y];
	}	
	for(int z=0; z<_words.length; z++){
		temp[z+8] = _words[z];
	}
	randomize(temp);
	// for(int j=0; j< 2; j++){ //does the first two rows
	//     for(int k=0; k < this._board[j].length; k++){ //does the rows
	// 	this._board[j][k] = new Tile (_words[j * 4 + k]);
	//     }	
	// }
	// randomize();
	// for(int x=2; x< 4; x++){ //does the second two rows
	//     for(int y=0; y < this._board[x].length; y++){ //does the rows
	// 	this._board[x][y] = new Tile (_words[(x-2) * 4 + y]);
	//     }	
	// }
	for (int i=0; i <_board.length; i++) {
	    for(int j=0; j<_board[i].length; j++){
	 	this._board[i][j] = new Tile (temp[i * 4 + j]);	    
		}
    }
    }
    
    public void play() {
    	populate();
    	while (_numberFaceUp < 16) {
    		
    	
	    this.print2();
	    Scanner s = new Scanner(System.in);
	    String firstcol = "";
	    String firstrow = "";
	    String seccol = "";
	    String secrow = "";

    	boolean x = false;
    	Tile t = new Tile("-X-");
		while(x == false){    	
		    System.out.println("Please enter the row of the first string");

		    if (s.hasNext() ) {
			firstrow = s.nextLine();
				}

		    System.out.println("Please enter the column of the first string");

		    if (s.hasNext() ) {
			firstcol = s.nextLine();
			    }	
		    int firsrow = Integer.parseInt(firstrow);
	    	int firstcolo = Integer.parseInt(firstcol);
	   
		    t = this._board[firsrow][firstcolo];

		    if(t.isFaceUp())
		    	System.out.println("Already Flipped");
		   	else{
		    	t.flip();
		    	x = true;
		   	}
		}
	    this.print2(); 
	    
    	boolean y = false;
    	Tile j = new Tile("-X-");
		while(y == false){    	
		    System.out.println("Please enter the row of the second string");

		    if (s.hasNext() ) {
			secrow = s.nextLine();
	    		}
	    		
		    System.out.println("Please ente-r the column of the second string");

		    if (s.hasNext() ) {
			seccol = s.nextLine();
	    		}
	    		
	  		int secundorow = Integer.parseInt(secrow);
		    int secundocolo = Integer.parseInt(seccol);

	/***    int firsrow = Integer.parseInt(firstrow);
	    int secundorow = Integer.parseInt(secrow);
	    int firstcolo = Integer.parseInt(firstcol);
	    int secundocolo = Integer.parseInt(seccol);
	    Tile t = this._board[firsrow][firstcolo];
	    t.flip(); 
	    this.print2(); 
	    ***/
		    j = this._board[secundorow][secundocolo];
		    
		    if(j.isFaceUp())
		    	System.out.println("Already Flipped");
		   	else{
		    	j.flip();
		    	y = true;
		   	}
		}
	   this.print2();
	   
	    if (t.isFaceUp()) { 
	    	System.out.println("Already flipped. Choose another."); 
	    	t.flip();
	    }
	    if (j.isFaceUp()) {
	    	System.out.println("Already flipped. Choose another.");
	    	t.flip();
	    }
	    
	   	if (t.equals(j)) {
				_numberFaceUp += 2; 
				System.out.println("Fantastic!");
			}
				else {
				t.flip(); 
				j.flip();
			}
	System.out.println("Try again" + "\n");
    	}
	 
	    // if (!t.equals(j)) {
    	//     	t.set_isFaceUp(false);
     //       	j.set_isFaceUp(false);
	    // }
	    // else {
    	//     	_numberFaceUp+=2;
	    // }
    	// }
    	System.out.println("game over");
    }
		
    //DO NOT MODIFY main()
    public static void main(String[] args){
	Concentration game = new Concentration();
	game.play();
    }

}//end class Concentration

