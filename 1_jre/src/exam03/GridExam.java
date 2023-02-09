package exam03;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;

public class GridExam extends Frame{
	Button bt1 = new Button("Button 1");
	Button bt2 = new Button("Button 2");
	Button bt3 = new Button("Button 3");
	Button bt4 = new Button("Button 4");
	Button bt5 = new Button("Button 5");
	
	GridLayout gl = new GridLayout(2,4);
	
	GridExam(String title){
		super(title);
		
		this.setLayout(gl);
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		
		super.setSize(300,200);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		int xPos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int yPos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		
		super.setLocation(xPos, yPos);
		super.setResizable(true);
		super.setVisible(true);
	}
	
	public static void main(String[] args) {
		GridExam ge = new GridExam("FlowLayout");
	}
}