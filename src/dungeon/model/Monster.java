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
	Player player; 

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
	
	

	

	public int getMonsterAgility() {
		return monsterAgility;
	}

	public void setMonsterAgility(int monsterAgility) {
		this.monsterAgility = monsterAgility;
	}

	public int getMonsterCurrentHealth() {
		return monsterCurrentHealth;
	}

	public void setMonsterCurrentHealth(int monsterCurrentHealth) {
		this.monsterCurrentHealth = monsterCurrentHealth;
	}

	public int getMonsterSpeed() {
		return monsterSpeed;
	}

	public void setMonsterSpeed(int monsterSpeed) {
		this.monsterSpeed = monsterSpeed;
	}
	
	public int getMonsterStrength()
	{
		return monsterStrength;
	}
	
	public void setMonsterStrength()
	{
		this.monsterStrength = monsterStrength;
	}
	
	public void setPlayer(Player current)
	{
		this.player = current;
	}

}
