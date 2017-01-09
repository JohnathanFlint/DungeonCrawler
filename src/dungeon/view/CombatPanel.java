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
	private JButton fightButton;
	private JButton runButton;
	private JLabel playerDamage;
	private JLabel monsterPic;
	private JLabel playerPic;
	
	public CombatPanel(DungeonController baseController)
	{
		super();
		
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fightButton = new JButton("Attack");
		runButton = new JButton("Run");
		//layerDamage = new JLabel(Player.getPlayerStrength());
		monsterPic = new JLabel
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
//new ImageIcon(new HealthBar(width, height,maxHealth,health).render());