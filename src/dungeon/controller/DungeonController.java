package dungeon.controller;

import dungeon.view.*;
import dungeon.model.*;

public class DungeonController 
{
	private DungeonFrame appFrame;
	public static String monsterPicture = "images/Troll.jpg";
	
	public DungeonController()
	{
		appFrame = new DungeonFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public void startCombat(Monster monster)
	{
		//monster =  new Troll();
		
		if(monster instanceof Troll)
		{
			monsterPicture = "images/Troll.jpg";
		}
		
		if(monster instanceof Goblin)
		{
			monsterPicture = "images/Goblin.jpg";
		}
		
		if(monster instanceof Slime)
		{
			monsterPicture = "images/Slime.jpg";
		}
	}
	
	public static String getMonsterPicture()
	{
		return monsterPicture;
	}

	public static void setMonsterPicture(String monsterPicture)
	{
		DungeonController.monsterPicture = monsterPicture;
	}

	public void combatEnd()
	{
		if(Player.playerDeath())
		{
			appFrame.switchPanel("Death");
		}
		else if(Monster.monsterDeath())
		{
			appFrame.switchPanel("Victory");
		}
	}
}
