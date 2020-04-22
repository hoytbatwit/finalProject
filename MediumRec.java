package application.map;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MediumRec {
int x;
int y;

private Rectangle graphic;

	public MediumRec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		
		graphic = new Rectangle();// Rectangle directly in the middle on the left side
		graphic.setHeight(60);
		graphic.setWidth(120);
		graphic.setStroke(Color.BURLYWOOD);
		graphic.setStrokeWidth(5);
		graphic.setX(x);
		graphic.setY(y);
		graphic.setArcWidth(25);
		graphic.setArcHeight(25);	
		
		p.getChildren().add(graphic);

	}
}