package dungeon.model;

import java.util.Random;

public class Character
{
	public int playerMaxHealth = 100;
	public int playerCurrentHealth;
	public int playerStrength = 0;
	public int hitChance; 

	public boolean playerHitChance() 
	{
		hitChance = (int) (Math.random() * 100 +1);
		
	}

	public void playerAttack() 
	{
	}

	public void monsterDeath()
	{
		
	}

	public void playerDeath() 
	{
		
	}

	public void run() 
	{
		
	}
	

}
