package dungeon.controller;

import dungeon.view.*;
import dungeon.model.*;

public class DungeonController 
{
	private Troll troll = new Troll();
	private Slime slime = new Slime();
	private Goblin goblin = new Goblin();
	private Player playerProfile;
	private DungeonFrame appFrame;
	public String monsterPicture = "images/Troll.jpg";
	Monster currentMonster = goblin;	
	
	public DungeonController()
	{
		playerProfile = new Player();		
		appFrame = new DungeonFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public void startCombat(Monster monster)
	{
		monster =  new Goblin();
		
		if(monster instanceof Troll)
		{
			monsterPicture = "images/Troll.jpg";
			currentMonster = troll;
		}
		
		if(monster instanceof Goblin)
		{
			monsterPicture = "images/Goblin.jpg";
			currentMonster = goblin;
		}
		
		if(monster instanceof Slime)
		{
			monsterPicture = "images/Slime.jpg";
			currentMonster = slime;
		}
				
		currentMonster.setPlayer(playerProfile);

	}
	
	//Player Methods
	
	public boolean playerHitChance() 
	{
		int hitChance = (int) (Math.random() * 100 +1) + (playerProfile.getPrecision());
		boolean hasHit = false;
		
		if(hitChance > currentMonster.getMonsterAgility())
		{
			hasHit = true;
		}
		return hasHit;
		
	}

	public void playerAttack() 
	{
		if(playerHitChance() == true)
		currentMonster.setMonsterCurrentHealth(currentMonster.getMonsterCurrentHealth() - playerProfile.getPlayerStrength());
		
		monsterDeath();
	}
	
	public boolean run() 
	{
		int escapeChance = (int) (Math.random()* 100 + 1) + (playerProfile.getPlayerSpeed());
		
		if(escapeChance > currentMonster.getMonsterSpeed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	//monster methods
	public boolean monsterHitChance() 
	{
		int hitChance = (int)(Math.random() * 100 + 1) + (currentMonster.getMonsterPrecision());
		boolean hasHit = false;
		
		if(hitChance > playerProfile.getAgility())
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
			
			playerProfile.setCurrentHealth(playerProfile.getCurrentHealth() - currentMonster.getMonsterStrength());
		}
	}
	
	public boolean monsterDeath() 
	{
		if(currentMonster.getMonsterCurrentHealth() <= 0)
		{
			if(currentMonster.getDropChance() >= currentMonster.getDropResist())
				{
					//drops item
				}
			playerProfile.setPlayerXP(playerProfile.getPlayerXP() + currentMonster.getMonsterXP());
			return true;		
		}
		else
		{
			return false;
		}
		
		
	}
	

	public void combatEnd()
	{
		if(playerProfile.playerDeath())
		{
			appFrame.switchPanel("Death");
		}
		else if(monsterDeath())
		{
			appFrame.switchPanel("Victory");
		}
		else if(run())
		{
			//escape screen call
		}
	}
	
	public Monster getCurrentMonster()
	{
		return currentMonster;
	}

	public void setCurrentMonster(Monster currentMonster)
	{
		this.currentMonster = currentMonster;
	}
	public void setMonsterPicture(String monsterPicture)
	{
		this.monsterPicture = monsterPicture;
	}

	public String getMonsterPicture()
	{
		return monsterPicture;
	}
	
	

}
