package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HalfVMiddleRec {
	int x;
	int y;
	
	private Rectangle graphic;
	
	public HalfVMiddleRec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		
		graphic = new Rectangle();// The side Lines in the (MIDDLE)
		graphic.setHeight(175);
		graphic.setWidth(25);
		graphic.setStroke(Color.ORANGE);
		graphic.setStrokeWidth(4);
		graphic.setX(x);
		graphic.setY(y);
		graphic.setArcWidth(25);
		graphic.setArcHeight(25);
		
		p.getChildren().add(graphic);
	}

}
