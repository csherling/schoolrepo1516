/*
  Christopher Sherling
  APCS1 pd5
  HW26 What Makes a Person?
  2015-11-08
*/

public class Face{

    private String hair;
    private String eyes;
    private String nose;
    private String mouth;

    public String toString(){
	String info = "";
	info += hair + "\n";
	info += eyes + "\n";
	info += nose + "\n";
	info += mouth + "\n";
	return info;
    }

    public Face(){
	hair =  "|||||||";
	eyes =  "| o o |";
	nose =  "|  ^  |";
	mouth = "|  _  |";
    }

    public Face(String newHair, String newEyes, String newNose, String newMouth){
	hair = newHair;
	eyes = newEyes;
	nose = newNose;
	mouth = newMouth;
    }

    public void setHair(String newHair){
	hair = newHair;
    }
    public void setEyes(String newEyes){
	eyes = newEyes;
    }
    public void setNose(String newNose){
	nose = newNose;
    }
    public void setMouth(String newMouth){
	mouth = newMouth;
    }
    public String getHair(){
	return hair;
    }
    public String getEyes(){
	return eyes;
    }
    public String getNose(){
	return nose;
    }
    public String getMouth(){
	return mouth;
    }
}