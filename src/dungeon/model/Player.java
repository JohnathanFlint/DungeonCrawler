package dungeon.model;

import java.util.Random;

public class Player
{
	private int maxHealth = 100;
	private static int currentHealth = 100;
	private int playerStrength = 0;
	private int hitChance; 
	private static int agility = 100;
	private int precision = 0;
	private int playerSpeed = 0;

	public boolean playerHitChance() 
	{
		hitChance = (int) (Math.random() * 100 +1) + (precision);
		boolean hasHit = false;
		
		if(hitChance > Monster.monsterAgility)
		{
			hasHit = true;
		}
		return hasHit;
		
	}

	public void playerAttack() 
	{
		if(playerHitChance() == true)
		Monster.monsterCurrentHealth = Monster.monsterCurrentHealth - playerStrength;
	}

	public void playerDeath() 
	{
		if(currentHealth <= 0)
		{
			//display game over and restart/quit buttons
		}
		
	}

	public void run() 
	{
		int escapeChance = (int) (Math.random()* 100 + 1) + (playerSpeed);
		
		if(escapeChance > Monster.monsterSpeed)
		{
			//Player escapes
		}
	}

	public static int getAgility() 
	{
		return agility;
	}

	public static void setAgility(int agility) 
	{
		Player.agility = agility;
	}

	public static int getCurrentHealth() 
	{
		return currentHealth;
	}

	public static void setCurrentHealth(int currentHealth) 
	{
		Player.currentHealth = currentHealth;
	}
	

}
