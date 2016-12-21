package dungeon.view;

import dungeon.model.*;
import javax.swing.*;
import dungeon.controller.DungeonController;
import java.awt.Color;
import java.awt.event.*;

public class VictoryPanel extends JPanel
{
	private DungeonController baseController;
	private SpringLayout baseLayout;
	
	public VictoryPanel(DungeonController baseController)
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
