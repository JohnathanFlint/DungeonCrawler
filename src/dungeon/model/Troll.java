package dungeon.model;

public class Troll extends Monster
{
	public static int trollChance = (int) (Math.random() * 100 + 1);
	
	public Troll()
	{
		super(60, 60, 10, trollChance, 40, 20, 0, 20);
	}
	
}
