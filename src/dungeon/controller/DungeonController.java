package dungeon.controller;

import dungeon.view.*;
import dungeon.model.*;

public class DungeonController 
{
	public void start()
	{
		
	}
	
	public void startCombat(Monster monster)
	{
		if( monster instanceof Troll)
		{
			
		}
		
		if(monster instanceof Goblin)
		{
			
		}
		
		if(monster instanceof Slime)
		{
			
		}
	}
	
	public void playerDeath()
	{
		if(Player.playerDeath())
		{
			//set to death pane
		}
	}
}
