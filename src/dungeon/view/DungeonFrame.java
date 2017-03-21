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
	private DungeonEscape escapeAppPanel;
	
	public DungeonFrame (DungeonController baseController)
	{
		super();
		this.baseController = baseController;
		fightAppPanel = new CombatPanel(baseController);
		deathAppPanel = new DeathPanel(baseController);
		winAppPanel = new VictoryPanel(baseController);
		escapeAppPanel = new DungeonEscape(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{   
		this.setContentPane(fightAppPanel);
		this.setTitle("Combat");
		GraphicsDevice screen = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = screen.getDisplayMode().getWidth();
		int height = screen.getDisplayMode().getHeight();
		int windowWidth = width - width/2;
		int windowHeight = height - height/2;
		int xPos = (width - windowWidth)/2;
		int yPos = (height - windowHeight)/2;
		this.setLocation(xPos, yPos);
		this.setSize(new Dimension(windowWidth, windowHeight));
		this.setResizable(false);
		this.setVisible(true);
	}   
	
	public void switchPanel(String Panel)
	{
		this.setVisible(false);
		if(Panel.equals("Death"))
		{
			
			this.setContentPane(deathAppPanel);
		}
		if(Panel.equals("Victory"))
		{
			this.setContentPane(winAppPanel);
		}
		if(Panel.equals("DungeonEscape"))
		{
			this.setContentPane(escapeAppPanel);
			
		}
		this.revalidate();
		this.setVisible(true);
		
	}

}
