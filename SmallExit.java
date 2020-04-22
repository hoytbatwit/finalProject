package application.map;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SmallExit {
	int x;
	int y;
	
	private Rectangle graphic;
	
	public SmallExit(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		
		graphic = new Rectangle();// Really Small vertical line for the exit (BLUE)
		graphic.setHeight(36);
		graphic.setWidth(3);
		graphic.setStroke(Color.BLUE);
		graphic.setStrokeWidth(5);
		graphic.setX(x);
		graphic.setY(y);
		
		p.getChildren().add(graphic);
	}
}