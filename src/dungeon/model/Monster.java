package dungeon.model;

public abstract class Monster 
{
	public int monsterHealth;
	public static int monsterCurrentHealth;
	public int monsterStrength;
	public int dropChance;	
	public String monsterType;
	public int monsterPrecision;
	public int dropResist;
	public static int monsterAgility;
	public static int monsterSpeed;
	public static int monsterXP;

	public Monster(int monsterHealth, int monsterCurrentHealth, int monsterStrength, int dropChance, int monsterPrecision, int dropResist, int monsterAgility, int monsterSpeed, int monsterXP)
	{
		this.monsterHealth = monsterHealth;
		this.monsterCurrentHealth = monsterCurrentHealth;
		this.monsterStrength = monsterStrength;
		this.dropChance = dropChance;
		this.monsterPrecision = monsterPrecision;
		this.dropResist = dropResist;
		this.monsterAgility = monsterAgility;
		this.monsterSpeed = monsterSpeed;
	}
	
	public String getType()
	{
		return this.getClass().getSimpleName();
	}
	
	public boolean monsterHitChance() 
	{
		int hitChance = (int)(Math.random() * 100 + 1) + (monsterPrecision);
		boolean hasHit = false;
		
		if(hitChance > Player.getAgility())
		{
			hasHit = true;
		}
		else
		{
			hasHit = false;
		}
		return hasHit;
	}

	public void monsterAttack() 
	{
		if(monsterHitChance())
		{
			
			Player.setCurrentHealth(Player.getCurrentHealth() - monsterStrength);
		}
	}

	public void monsterDeath() 
	{
		if(monsterCurrentHealth <= 0)
		{
			if(dropChance >= dropResist)
				{
					//drops item
				}
			Player.setPlayerXP(Player.getPlayerXP() + monsterXP);
				//monster dies & combat ends
		}
	}
}
