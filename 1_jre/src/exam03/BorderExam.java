package exam03;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class BorderExam extends Frame{
	Button bt1 = new Button("Button 1");
	Button bt2 = new Button("Button 2");
	Button bt3 = new Button("Button 3");
	Button bt4 = new Button("Button 4");
	Button bt5 = new Button("Button 5");
	
	BorderLayout bl = new BorderLayout();
	
	BorderExam(String title){
		super(title);
		
		this.setLayout(bl);
		this.add("North", bt1);
		this.add("South", bt2);
		this.add("East", bt3);
		this.add("West", bt4);
		this.add("Center", bt5);
		
		super.setSize(300,200);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		int xPos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int yPos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		
		super.setLocation(xPos, yPos);
		super.setResizable(true);
		super.setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderExam be = new BorderExam("BorderLayout");
	}
}