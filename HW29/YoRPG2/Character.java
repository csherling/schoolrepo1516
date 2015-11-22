/*
  Team GitRekt - Sachal Malick, Vincent Alykin, Christopher Sherling
  APCS1 pd5
  HW29 -- Ye Olde Role Playing Game, Improved
  2015-11-12
*/

public class Character{

    protected int hp;
    protected int strength;
    protected int defense;
    protected double attack;

    public Character(){
	// Sets attributes;
	hp = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }
	
    public  boolean isAlive(){
	return hp > 0; // If the "hp" is above 0, return true;
    }

    public int getDefense(){
	return defense; // returns the defense
    }

    public void lowerHP(int dmg){
	hp -= dmg; // returns the "hp" after the "damage" has been applied
    }

    public int attack(Character enemy){
	int damage;
	damage = (int)(strength * attack) - enemy.getDefense(); // sets damage
	enemy.lowerHP(damage);
	return damage;
    }

}