package ie.gmit.week11;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.Set;

/**
 * The interface Actor extends Shape
 *  
 * @author AndrewBeatty
 *
 */

public interface Actor extends Shape{
	// actor now returns a boolean true to stay, false to remove
	public boolean move(Set<Actor> allActors);
	public void draw(Graphics2D g);
}
