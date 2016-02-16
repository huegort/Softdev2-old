package ie.gmit.softdev2.w8;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GameBoard extends JPanel{
	
	public GameBoard(){
		super();
		this.setBackground(Color.BLACK);
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		System.out.println("paint componet is called ");
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(50, 50, 100, 100);
		g.setColor(Color.red);
		g.fillOval(50, 50, 60, 60);
		g.setColor(Color.green);
		g.drawOval(50, 50, 30, 30);
		
		int[] xs = {20,30,30,40};
		int[] ys = {20,100,110,50};
		
		g2.setStroke(new BasicStroke(10 ));
		g.drawPolygon(xs, ys, 4);
 		
		
	}
	
	

}
