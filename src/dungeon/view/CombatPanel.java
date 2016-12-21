package dungeon.view;

import dungeon.model.*;
import javax.swing.*;
import dungeon.controller.DungeonController;
import java.awt.Color;
import java.awt.event.*;


public class CombatPanel extends JPanel
{	
	private DungeonController baseController;
	private SpringLayout baseLayout;
	
	public CombatPanel(DungeonController baseController)
	{
		super();
		
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
//new ImageIcon(new HealthBar(width,height,maxHealth,health).render());