package dungeon.view;

import dungeon.model.*;
import javax.swing.*;
import dungeon.controller.DungeonController;
import java.awt.Color;
import java.awt.event.*;

public class DeathPanel extends JPanel
{
	private DungeonController baseController;
	private SpringLayout baseLayout;
	
	private JButton quitButton;
	private JButton continueButton;
	private JLabel deathLabel;
	private JLabel deathPic;
	
	
	public DeathPanel(DungeonController baseController)
	{
		super();
		
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		quitButton = new JButton("Quit?");
		deathLabel = new JLabel("You are dead. Congratulations!");
		baseLayout.putConstraint(SpringLayout.WEST, deathLabel, 119, SpringLayout.WEST, this);
		deathPic = new JLabel(new ImageIcon(getClass().getResource("images/deadAdventurer.jpg")));
		baseLayout.putConstraint(SpringLayout.NORTH, deathPic, 74, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, quitButton, 3, SpringLayout.SOUTH, deathPic);
		baseLayout.putConstraint(SpringLayout.WEST, quitButton, 10, SpringLayout.WEST, deathPic);
		baseLayout.putConstraint(SpringLayout.SOUTH, deathLabel, -28, SpringLayout.NORTH, deathPic);
		baseLayout.putConstraint(SpringLayout.WEST, deathPic, 72, SpringLayout.WEST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(quitButton);
		this.add(deathLabel);
		continueButton = new JButton("Continue?");
		baseLayout.putConstraint(SpringLayout.NORTH, continueButton, 0, SpringLayout.NORTH, quitButton);
		baseLayout.putConstraint(SpringLayout.EAST, continueButton, 0, SpringLayout.EAST, deathPic);
		this.add(continueButton);
		this.add(deathPic);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		quitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}

		});

}
	}

