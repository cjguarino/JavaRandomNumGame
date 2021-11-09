import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RandomGame extends JFrame
{
	private JButton button;
	private JLabel promptLabel;
	private JLabel randomLabel;
	private JLabel resultLabel;
	private JTextField textfield;
	int randomNum, guess;
	
	public RandomGame()
	{
		setLayout(new GridLayout());
		
		promptLabel = new JLabel("Enter a random number 1-10");
		add(promptLabel);
		
		textfield = new JTextField(1);
		add(textfield);
		
		button = new JButton ("Guess!");
		add(button);
		
		resultLabel = new JLabel("");
		add(resultLabel);
		
		randomLabel = new JLabel("");
		add(randomLabel);
		
		Event e = new Event();
		button.addActionListener(e);
	}
	
	public class Event implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			randomNum = (int) (Math.random() * 10 + 1);
			try
			{
				guess = (int)(Double.parseDouble(textfield.getText()));
					if (guess == randomNum)
					{
						resultLabel.setText("You guessed it right");
					}
					else if (guess != randomNum)
					{
						resultLabel.setText("You guessed it wrong");
					}
				randomLabel.setText("Random Num: " + randomNum);
			} catch (Exception ex)
			{
				randomLabel.setText("Please enter numbers only");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		RandomGame game = new RandomGame();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(true);
		game.setTitle("guessing number's game");
		//game.pack();
	}
	
}
