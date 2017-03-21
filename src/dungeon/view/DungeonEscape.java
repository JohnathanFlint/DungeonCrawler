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
import dungeon.model.Slime;
import dungeon.model.Troll;
import dungeon.model.Goblin;

public class DungeonEscape extends JPanel
{
	private DungeonController baseController;
	private SpringLayout baseLayout;
	private JButton continueButton;
	private JLabel escapeLabel;
	private JLabel rewardLabel;
	
	
	Monster currentMonster;
	
	public DungeonEscape(DungeonController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		currentMonster = baseController.getCurrentMonster();
		continueButton = new JButton("Continue?");
		escapeLabel = new JLabel("This will change");
		baseLayout.putConstraint(SpringLayout.NORTH, continueButton, 79, SpringLayout.SOUTH, escapeLabel);
		baseLayout.putConstraint(SpringLayout.EAST, continueButton, 0, SpringLayout.EAST, escapeLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, escapeLabel, 95, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, escapeLabel, 419, SpringLayout.WEST, this);
		
		if(currentMonster instanceof Slime)
		{
			escapeLabel.setText("Congrats you escaped the slime. It's about as dangerous as spoiled jello.");
		}
		else 
		{
			escapeLabel.setText("You escaped.");
		}
		
		rewardLabel = new JLabel("You get nothing!");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);;
		this.setPreferredSize(new Dimension(960, 540));
		this.setBackground(Color.GRAY);
		
		
		this.add(escapeLabel);
		this.add(continueButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		//switch to world
		continueButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						
					}

					
				});
	}
}
	
	
		


