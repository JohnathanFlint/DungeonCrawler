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
		baseLayout.putConstraint(SpringLayout.NORTH, fightButton, 68, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, fightButton, 119, SpringLayout.WEST, this);
		runButton = new JButton("Run");
		//playerDamage = new JLabel(Player.getPlayerStrength());
		monsterPic = new JLabel(new ImageIcon(getClass().getResource(DungeonController.monsterPicture)));
		playerPic = new JLabel(new ImageIcon(getClass().getResource("images/redCube.jpg")));		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		
		this.add(monsterPic);
		this.add(playerPic);
		this.add(fightButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, playerPic, 76, SpringLayout.SOUTH, fightButton);
		baseLayout.putConstraint(SpringLayout.EAST, playerPic, 0, SpringLayout.EAST, fightButton);
	}
	
	private void setupListeners()
	{
		
	}
}
//new ImageIcon(new HealthBar(width, height,maxHealth,health).render());