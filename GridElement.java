package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * This forms a grid that is hidden from the player but it used
 * for many of the classes in the project
 */
public class GridElement {
	//x and y location data
	private int x;
	private int y;
	//The GridElement knows about its graphic
	private Rectangle graphic;
	
	/**
	 *This constructor sets how big a node is and where it is located on
	 *the graph using x and y coordinates and a size variable.
	 *The color is always set to black so that the player cannot
	 *see the individual grid spaces
	 */
	GridElement(int x, int y, int size){
		this.x=x;
		this.y=y;
		graphic=new Rectangle(size,size);
		graphic.setFill(Color.BLACK);
		graphic.setStroke(Color.BLACK);
		graphic.setStrokeWidth(3);
	}
	
	/**
	 * Getter of the element graphic
	 */
	public Rectangle getGraphic() {
		return graphic;
	}
	
	/**
	 * Getter for the x coordinate
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Getter for the y coordinate
	 */
	public int getY() {
		return y;
	}
}