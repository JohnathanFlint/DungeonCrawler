package dungeon.model;

public abstract class Monster 
{
	private int monsterHealth;
	private int monsterCurrentHealth;
	private int monsterStrength;
	private int dropChance;	
	private String monsterType;
	private int monsterPrecision;
	private int dropResist;
	private int monsterAgility;
	private int monsterSpeed;
	private int monsterXP;
	private String monsterPic;
	private String monsterName;
	Player player = new Player();
	Monster monster = new Monster();

	public Monster(int monsterHealth, int monsterCurrentHealth, int monsterStrength, int dropChance, int monsterPrecision, 
			int dropResist, int monsterAgility, int monsterSpeed, int monsterXP, String monsterPic, String monsterName)
	{
		this.monsterHealth = monsterHealth;
		this.setMonsterCurrentHealth(monsterCurrentHealth);
		this.monsterStrength = monsterStrength;
		this.dropChance = dropChance;
		this.monsterPrecision = monsterPrecision;
		this.dropResist = dropResist;
		this.setMonsterAgility(monsterAgility);
		this.setMonsterSpeed(monsterSpeed);
		this.monsterName = monsterName;
		this.monsterPic = monsterPic;
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
			
			Player.setCurrentHealth(player.getCurrentHealth() - monsterStrength);
		}
	}

	public static boolean monsterDeath() 
	{
		if(getMonsterCurrentHealth() <= 0)
		{
			if(dropChance >= dropResist)
				{
					//drops item
				}
			Player.setPlayerXP(Player.getPlayerXP() + monsterXP);
			return true;		
		}
		else
		{
			return false;
		}
	}

	public static int getMonsterAgility() {
		return monsterAgility;
	}

	public static void setMonsterAgility(int monsterAgility) {
		Monster.monsterAgility = monsterAgility;
	}

	public static int getMonsterCurrentHealth() {
		return monsterCurrentHealth;
	}

	public static void setMonsterCurrentHealth(int monsterCurrentHealth) {
		Monster.monsterCurrentHealth = monsterCurrentHealth;
	}

	public static int getMonsterSpeed() {
		return monsterSpeed;
	}

	public static void setMonsterSpeed(int monsterSpeed) {
		Monster.monsterSpeed = monsterSpeed;
	}
	
	public static int getMonsterStrength()
	{
		return monsterStrength;
	}
	
	public static void setMonsterStrength()
	{
		Monster.monsterStrength = monsterStrength;
	}

}
