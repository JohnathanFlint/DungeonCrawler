package dungeon.controller;

import dungeon.view.*;
import dungeon.model.*;

public class DungeonController 
{
	private DungeonFrame appFrame;
	public void start()
	{
		
	}
	
	public void startCombat(Monster monster)
	{
		if(monster instanceof Troll)
		{
			
		}
		
		if(monster instanceof Goblin)
		{
			
		}
		
		if(monster instanceof Slime)
		{
			
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
