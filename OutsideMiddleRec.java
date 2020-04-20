package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class OutsideMiddleRec {
	int x;
	int y;
	
	private Rectangle graphic;
	
	public OutsideMiddleRec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		
		graphic = new Rectangle();// OUTISDE Right
		graphic.setHeight(140); 
		graphic.setWidth(142.5);
		graphic.setStroke(Color.TURQUOISE);
		graphic.setStrokeWidth(5);
		graphic.setX(x);
		graphic.setY(y);
		graphic.setArcWidth(25);
		graphic.setArcHeight(25);
		
		p.getChildren().add(graphic);
	}

}
