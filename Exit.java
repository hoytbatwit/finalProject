package application.map;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Exit {
	int x;
	int y;

	private Rectangle graphic;

	public Exit(int x, int y, Pane p) {
		this.x = y;
		this.x = y;

		graphic = new Rectangle();// (Horizontal Left Exit Line ) (ALL SET RIGHT EXIT STUFF)
		graphic.setHeight(3);
		graphic.setWidth(200);
		graphic.setStroke(Color.BLUE);
		graphic.setStrokeWidth(5);
		graphic.setX(x);
		graphic.setY(y);
		
		p.getChildren().add(graphic);
	}
}