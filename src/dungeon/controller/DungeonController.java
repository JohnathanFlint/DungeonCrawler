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
	Monster currentMonster = troll;
	
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
		monster =  new Troll();
		
		if(monster instanceof Troll)
		{
			System.out.println("Troll");
			monsterPicture = "images/Troll.jpg";
			currentMonster = troll;
		}
		
		if(monster instanceof Goblin)
		{
			System.out.println("Goblin");
			monsterPicture = "images/Goblin.jpg";
			currentMonster = goblin;
		}
		
		if(monster instanceof Slime)
		{
			System.out.println("Slime");
			monsterPicture = "images/Slime.jpg";
			currentMonster = slime;
		}
				
		currentMonster.setPlayer(playerProfile);
		System.out.println("End");
		System.out.println(currentMonster);

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
		System.out.println(currentMonster.getMonsterCurrentHealth());

		if(playerHitChance() == true)
		{
			currentMonster.setMonsterCurrentHealth(currentMonster.getMonsterCurrentHealth() - playerProfile.getPlayerStrength());
		}
		
		System.out.println(currentMonster.getMonsterCurrentHealth());
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
		//System.out.println(playerProfile.getCurrentHealth());
		
		if(monsterHitChance())
		{
			
			playerProfile.setCurrentHealth(playerProfile.getCurrentHealth() - currentMonster.getMonsterStrength());
		}
		//System.out.println(playerProfile.getCurrentHealth());
	}
	
	public boolean monsterDeath() 
	{
		if(currentMonster.getMonsterCurrentHealth() <= 0)
		{
			
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
			//System.out.println("You dead");
			appFrame.switchPanel("Death");
		}
		else if(monsterDeath())
		{
			//System.out.println("They dead");
			if(currentMonster.getDropChance() >= currentMonster.getDropResist())
			{
				//drops item
			}
			//System.out.println(currentMonster.getMonsterXP());
			playerProfile.setPlayerXP(playerProfile.getPlayerXP() + currentMonster.getMonsterXP());
			appFrame.switchPanel("Victory");
		}
		else if(run())
		{
			//System.out.println("You coward");

			appFrame.switchPanel("DungeonEscape");
		}
		else
		{
			//System.out.println("Fail");
		}
	}
	
	public void levelPlayer()
	{
		playerProfile.levelUp();
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
	
	public Player getPlayerProfile()
	{
		return playerProfile;
	}

	public void setPlayerProfile(Player playerProfile)
	{
		this.playerProfile = playerProfile;
	}
	
	

}
