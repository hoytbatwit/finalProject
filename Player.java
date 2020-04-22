package application;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

/**
 * This allows the program to create a player
 */
public class Player {
	//x and y location data
	private int x;
	private int y;
	
	//the player object knows about its graphic
	private Arc graphic;
	
	/**
	 * This constructor sets up the parameters needed to create an arc which is used
	 * as the player character. It is also used for the ghost just that the arc is zero 
	 * so it is a circle.
	 */
	Player(int x, int y, int width, int height,int startAngle, int angleLength,  Color c){
		this.x=x;
		this.y=y;
		graphic=new Arc(x,y,width,height,startAngle,angleLength);
		graphic.setFill(c);
		graphic.setType(ArcType.ROUND);
	}
	
	/**
	 * This method allows for the movement of the player it will get the new x
	 * and y from the input and move the player to that location
	 */
	public void move(int x, int y, GridPane p) {
		this.x=x;
		this.y=y;
		//removes the player graphic from the grid
		p.getChildren().remove(graphic);
		p.add(graphic, x, y); 
	}
	
	/**
	 * Getter of the element graphic
	 */
	public Arc getGraphic() {
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