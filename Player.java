package application;

import java.util.List;

import javafx.geometry.Point2D;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Player element
 * Represented by a Red square that can move around the grid
 * @author schuster
 */
public class Player {
	//x and y location data
	//this is NOT connected to the GridPane
	private int x;
	private int y;
	
	//the player object knows about its graphic
	private Rectangle graphic;
	
	/**
	 * Constructor, sets location and graphic
	 * 
	 * @param x    x-Location data for the element
	 * @param y    y-Location data for the element
	 * @param size Physical size of the graphic (Rectangle)
	 */
	Player(int x, int y, int size, Color c){
		this.x=x;
		this.y=y;
		graphic=new Rectangle(size,size);
		graphic.setFill(c);
	}
	
	/**
	 * Method that moves the player to a new x,y location
	 * in the GridPane p.
	 * 
	 * This method is not safe, if the passed in GridPane
	 * does not contain the player, the program will crash.
	 * It may be better to include a reference to the GridPane
	 * as part of the class data.
	 * 
	 * @param x New x-location
	 * @param y New y-location
	 * @param p The GridPane that this player belongs to
	 */
	public void move(int x, int y, GridPane p) {
		//update the Player class data
		this.x=x;
		this.y=y;
		//remove the player graphic from the grid
		p.getChildren().remove(graphic);
		//add the player graphic to the grid in
		//its new location
		p.add(graphic, x, y); //THIS is now we connect to the GridPane
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