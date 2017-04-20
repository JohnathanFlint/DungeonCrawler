package dungeon.model;

public class HealthPotion extends Item
{
	//private int potionChance = (int)(Math.random() * );
	
	public HealthPotion(Boolean isTemp, String name, int increase, int dropChance)
	{
		super(true, "Health Potion", 10, dropChance);
	}

}
