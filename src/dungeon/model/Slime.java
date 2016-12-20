package dungeon.model;

public class Slime extends Monster
{
public static int slimeChance = (int) (Math.random() * 100 + 1);
	
	public Slime()
	{
		super(30, 30, 2, slimeChance, 100, 90, 20, 0, 5);
	}
}
