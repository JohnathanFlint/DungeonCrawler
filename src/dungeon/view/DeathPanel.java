package dungeon.view;

import dungeon.model.*;
import javax.swing.*;
import dungeon.controller.DungeonController;
import java.awt.Color;
import java.awt.Dimension;
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
		deathPic = new JLabel(new ImageIcon(getClass().getResource("images/deadAdventurer.jpg")));
		baseLayout.putConstraint(SpringLayout.NORTH, deathPic, 160, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, deathPic, -299, SpringLayout.EAST, this);
		quitButton = new JButton("Quit?");
		baseLayout.putConstraint(SpringLayout.NORTH, quitButton, 25, SpringLayout.SOUTH, deathPic);
		deathLabel = new JLabel("You are dead. Congratulations!");
		baseLayout.putConstraint(SpringLayout.WEST, quitButton, 0, SpringLayout.WEST, deathLabel);
		baseLayout.putConstraint(SpringLayout.WEST, deathLabel, 0, SpringLayout.WEST, deathPic);
		baseLayout.putConstraint(SpringLayout.SOUTH, deathLabel, -5, SpringLayout.NORTH, deathPic);
		continueButton = new JButton("Continue?");
		baseLayout.putConstraint(SpringLayout.NORTH, continueButton, 0, SpringLayout.NORTH, quitButton);
		baseLayout.putConstraint(SpringLayout.EAST, continueButton, 0, SpringLayout.EAST, deathPic);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(960, 540));
		this.setBackground(Color.GRAY);
		this.add(quitButton);
		this.add(deathLabel);
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
				System.exit(0);
			}

		});
		
		continueButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				//switch to geran's
			}

		});
}
	}

