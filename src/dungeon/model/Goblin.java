package dungeon.model;

public class Goblin extends Monster 
{
public static int goblinChance = (int) (Math.random() * 100 + 1);
	
	public Goblin()
	{
		super(40, 40, 5, goblinChance, 20, 40, 40, 70, 10);
	}
}
