package dungeon.controller;

import dungeon.view.*;
import dungeon.model.*;

public class DungeonController 
{
	private DungeonFrame appFrame;
	public static String monsterPicture;
	
	public DungeonController()
	{
		appFrame = new DungeonFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public void startCombat(Monster monster)
	{
//		monster =  new Troll();
		
		if(monster instanceof Troll)
		{
			Troll troll = (Troll)monster;
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
