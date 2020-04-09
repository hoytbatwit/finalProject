package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Basic Grid element that will form the basis of the
 * grid background
 * @author schuster
 */
public class GridElement {
	//x and y location data
	//this is NOT connected to the GridPane
	//we do that in the nested loop in Start()
	private int x;
	private int y;
	//The GridElement knows about its graphic
	private Rectangle graphic;
	
	/**
	 * Constructor, sets location and graphic
	 * 
	 * @param x    x-Location data for the element
	 * @param y    y-Location data for the element
	 * @param size Physical size of the graphic (Rectangle)
	 */
	GridElement(int x, int y, int size){
		this.x=x;
		this.y=y;
		graphic=new Rectangle(size,size);
		graphic.setFill(Color.WHITE);
		graphic.setStroke(Color.BLACK);
		graphic.setStrokeWidth(3);
	}
	
	/**
	 * Getter of the element graphic
	 * @return Rectangle graphic (for adding to the pane)
	 */
	public Rectangle getGraphic() {
		return graphic;
	}
	
	/**
	 * Getter for the x coordinate
	 * @return x-location
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Getter for the y coordinate
	 * @return y-location
	 */
	public int getY() {
		return y;
	}
}