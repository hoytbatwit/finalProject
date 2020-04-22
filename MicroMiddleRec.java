package application.map;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MicroMiddleRec {
	int x;
	int y;
	
	private Rectangle graphic;
	
	public MicroMiddleRec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		
		graphic = new Rectangle();// The line going down the middle
		graphic.setHeight(45);
		graphic.setWidth(25);
		graphic.setStroke(Color.BLUE);
		graphic.setStrokeWidth(5);
		graphic.setX(x);
		graphic.setY(y);
		graphic.setArcWidth(25);
		graphic.setArcHeight(25);
		
		p.getChildren().add(graphic);

	}

}