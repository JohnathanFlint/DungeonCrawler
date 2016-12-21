package dungeon.view;

import javax.swing.JFrame;
import dungeon.controller.DungeonController;
import java.awt.*;
import dungeon.model.*;

public class DungeonFrame extends JFrame
{
	private DungeonController baseController;
	private CombatPanel fightAppPanel;
	private DeathPanel deathAppPanel;
	private VictoryPanel winAppPanel;
	
	public DungeonFrame (DungeonController baseController)
	{
		super();
		this.baseController = baseController;
		fightAppPanel = new CombatPanel(baseController);
		deathAppPanel = new DeathPanel(baseController);
		winAppPanel = new VictoryPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{   
		
	}   
	
	public void switchPanel(String Panel)
	{
		if(Panel.equals("Death"))
		{
			this.setContentPane(deathAppPanel);
		}
		else if(Panel.equals("Victory"));
		{
			this.setContentPane(winAppPanel);
		}
	}

}
