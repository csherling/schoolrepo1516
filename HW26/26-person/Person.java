/*
  Christopher Sherling
  APCS1 pd5
  HW26 What Makes a Person?
  2015-11-08
*/

public class Person{

    private Face face;
    private Body body;
    private String fName;
    private String lName;

    public String toString(){
	String info = "";
	info += face + "\n";
	info += body + "\n";
	info += fName + " ";
	info += lName + "\n";
	return info;
    }

    public Person(){
	Face f = new Face();
	face = f;
	Body b = new Body();
	body = b;
	fName =  "John";
	lName =  "Doe";

    }
    
    public Person(String newFName, String newLName, Face f){
	face = f;
	Body b = new Body();
	body = b;
	fName = newFName;
	lName = newLName;
    }

    public void setFace(Face newFace){
	face = newFace;
    }
    public void setBody(Body newBody){
	body = newBody;
    }
    public void setFName(String newFName){
	fName = newFName;
    }
    public void setLName(String newLName){
	lName = newLName;
    }
    public Face getFace(){
	return face;
    }
    public Body getBody(){
	return body;
    }
    public String getFName(){
	return fName;
    }
    public String getLName(){
	return lName;
    }
}