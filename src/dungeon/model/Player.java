package dungeon.model;

public class Player
{
	private static int maxHealth = 100;
	private static int currentHealth = 100;
	private static int playerStrength = 10;
	private static int agility = 100;
	private int precision = 0;
	private int playerSpeed = 0;
	private static int playerXP = 0;
	private int playerLevel = 1;

	public boolean playerHitChance() 
	{
		int hitChance = (int) (Math.random() * 100 +1) + (precision);
		boolean hasHit = false;
		
		if(hitChance > Monster.getMonsterAgility())
		{
			hasHit = true;
		}
		return hasHit;
		
	}

	public void playerAttack() 
	{
		if(playerHitChance() == true)
		Monster.setMonsterCurrentHealth(Monster.getMonsterCurrentHealth() - playerStrength);
	}

	public static boolean playerDeath() 
	{
		if(currentHealth <= 0)
		{
			return true;		
		}
		else
		{
			return false;
		}
		
	}

	public void run() 
	{
		int escapeChance = (int) (Math.random()* 100 + 1) + (playerSpeed);
		
		if(escapeChance > Monster.getMonsterSpeed())
		{
			//Player escapes
		}
	}
	
	public void levelUp()
	{
		if(playerXP >= playerLevel * 10)
		{
			maxHealth = maxHealth + 10;
			currentHealth = currentHealth + 10;
			playerStrength = playerStrength + 2;
			agility = agility + 2;
			precision = precision + 10;
			playerSpeed = playerSpeed + 10;
			playerXP = 0;
			playerLevel = playerLevel + 1;
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
	
	public static int getMaxHealth()
	{
		return maxHealth;
	}
	
	public static void setMaxHealth()
	{
		Player.maxHealth = maxHealth;
	}

	public static int getPlayerXP() 
	{
		return playerXP;
	}

	public static void setPlayerXP(int playerXP) 
	{
		Player.playerXP = playerXP;
	}
	
	public static int getPlayerStrength()
	{
		return playerStrength;
	}
	
	public static void setPlayerStrength(int playerStrength)
	{
		Player.playerStrength = playerStrength;
	}
	

}
