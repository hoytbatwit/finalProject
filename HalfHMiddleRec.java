package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HalfHMiddleRec {
	int x;
	int y;
	
	private Rectangle graphic;
	
	public HalfHMiddleRec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		
		graphic = new Rectangle();
		graphic.setHeight(25);
		graphic.setWidth(225);
		graphic.setStroke(Color.BLUE);
		graphic.setStrokeWidth(5);
		graphic.setX(x);
		graphic.setY(y);
		graphic.setArcWidth(25);
		graphic.setArcHeight(25);
		
		p.getChildren().add(graphic);
	}

}
