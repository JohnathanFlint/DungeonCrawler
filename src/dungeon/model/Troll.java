package dungeon.model;

public class Troll extends Monster
{
	public int monsterHealth;
	public int monsterCurrentHealth = ;
	public int monsterStrength = 10;
	public int dropChance = (int) (Math.random() * 10 + 9);	
	public String monsterType = "Troll";
	
	public boolean monsterHitChance() 
	{
		return false;
	}

	public void monsterAttack() 
	{
		
	}

	public void monsterDeath() 
	{
		
	}

}
