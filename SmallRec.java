package application.map;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class SmallRec {
	int x;
	int y;

	private Rectangle graphic;

	public SmallRec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;

		graphic = new Rectangle();// Rectangle on the top left side nearing the middle (ALL SET!!!)
		graphic.setHeight(40);
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
