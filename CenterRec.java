package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CenterRec {
	int x; 
	int y;
	
	private Rectangle graphic;
	
	public CenterRec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		graphic = new Rectangle();// The center rectangle where the ghost go
		graphic.setHeight(100);
		graphic.setWidth(200);
		graphic.setStroke(Color.BLUE);
		graphic.setStrokeWidth(5);
		graphic.setX(x);
		graphic.setY(y);
		graphic.setArcWidth(25);
		graphic.setArcHeight(25);
		
		p.getChildren().add(graphic);
	}
}
