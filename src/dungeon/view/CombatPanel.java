package dungeon.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import dungeon.controller.DungeonController;
import dungeon.model.HealthBar;
import dungeon.model.Monster;
import dungeon.model.Player;


public class CombatPanel extends JPanel
{	
	private DungeonController baseController;
	private SpringLayout baseLayout;
	private JButton fightButton;
	private JButton runButton;
	private JLabel playerDamage;
	private JLabel monsterPic;
	private JLabel playerPic;
	private JLabel monsterDamage;
	private int frameWidth;
	private int frameHeight;
	private HealthBar playerHealth;
	private HealthBar monsterHealth;
	private JLabel playerHealthRender;
	Player player = new Player();
	Monster currentMonster;
	
	public CombatPanel(DungeonController baseController)
	{
		super();
		
		this.baseController = baseController;
		currentMonster = baseController.getCurrentMonster();
		baseController.startCombat(baseController.getCurrentMonster());
		baseLayout = new SpringLayout();
		fightButton = new JButton("Attack");		
		runButton = new JButton("Run");		
		playerDamage = new JLabel("Your damage is " + Integer.toString(player.getPlayerStrength()));		
		monsterDamage = new JLabel("The monster's damage is " + Integer.toString(currentMonster.getMonsterStrength()));
		monsterPic = new JLabel(new ImageIcon(getClass().getResource(baseController.getMonsterPicture())));			
		playerPic = new JLabel(new ImageIcon(getClass().getResource("images/redCube.jpg")));
		playerHealth = new HealthBar(500, 200, player.getMaxHealth(), player.getCurrentHealth());
		playerHealthRender = new JLabel(new ImageIcon(playerHealth.render()));
		try
		{
			ImageIO.write(playerHealth.render(),"PNG",new File("/Users/nwhi5696/Desktop/test.png"));
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(960, 540));
		this.setBackground(Color.GRAY);
		
		this.add(monsterPic);
		this.add(playerPic);
		this.add(fightButton);
		this.add(runButton);
		this.add(playerDamage);
		this.add(monsterDamage);
		this.add(playerHealthRender);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, monsterPic, 1, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, monsterPic, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fightButton, 28, SpringLayout.SOUTH, playerDamage);
		baseLayout.putConstraint(SpringLayout.WEST, playerDamage, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, playerDamage, -6, SpringLayout.NORTH, playerPic);
		baseLayout.putConstraint(SpringLayout.WEST, playerPic, -96, SpringLayout.WEST, fightButton);
		baseLayout.putConstraint(SpringLayout.EAST, playerPic, -27, SpringLayout.WEST, fightButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, playerPic, -51, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, monsterDamage, 6, SpringLayout.SOUTH, monsterPic);
		baseLayout.putConstraint(SpringLayout.EAST, monsterDamage, -10, SpringLayout.EAST, monsterPic);
		baseLayout.putConstraint(SpringLayout.NORTH, runButton, 0, SpringLayout.NORTH, fightButton);
		baseLayout.putConstraint(SpringLayout.WEST, runButton, 40, SpringLayout.EAST, fightButton);
		baseLayout.putConstraint(SpringLayout.EAST, fightButton, -769, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, playerHealthRender, 6, SpringLayout.SOUTH, playerPic);
		baseLayout.putConstraint(SpringLayout.WEST, playerHealthRender, 0, SpringLayout.WEST, playerPic);
	}
	
	private void setupListeners()
	{
		fightButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						baseController.playerAttack();
						repaint();
						baseController.monsterAttack();
						repaint();
						baseController.combatEnd();
					}
				});
	}
}


/* I like the concept of the project, and it seems really cool */