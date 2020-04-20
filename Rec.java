package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rec {
	int x;
	int y;
	
	private Rectangle graphic;
	
	public Rec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		graphic = new Rectangle();// Rectangle on the top Left Side (ALL SET!!!)
		graphic.setHeight(60);
		graphic.setWidth(150);
		graphic.setStroke(Color.BLUE);
		graphic.setStrokeWidth(5);
		graphic.setX(x);
		graphic.setY(y);
		graphic.setArcWidth(25);
		graphic.setArcHeight(25);
		
		p.getChildren().add(graphic);
		
	}
}
