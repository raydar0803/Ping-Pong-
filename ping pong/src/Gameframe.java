import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Gameframe extends JFrame {
	
	GamePanel panel ;
	
	
	Gameframe()
	{
		panel= new GamePanel();
		this.add(panel);
		this.setTitle("PONG GAME");
		this.setResizable(false);
		this.setBackground(Color. black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
		

    }
	

}
