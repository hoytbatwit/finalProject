package application.map;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class VMiddleRec {
	int x;
	int y;
	
	private Rectangle graphic;
	
	public VMiddleRec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		

		graphic = new Rectangle();// The side Lines in the (MIDDLE) BOTTOM{}{}{}
		graphic.setHeight(225);
		graphic.setWidth(20);
		graphic.setStroke(Color.GREEN);
		graphic.setStrokeWidth(4);
		graphic.setX(x);
		graphic.setY(y);
		graphic.setArcWidth(25);
		graphic.setArcHeight(25);
		
		p.getChildren().add(graphic);
	}

}