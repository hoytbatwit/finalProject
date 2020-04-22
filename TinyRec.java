package application.map;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TinyRec {
	int x;
	int y;

	private Rectangle graphic;

	public TinyRec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;

		graphic = new Rectangle();
		graphic.setHeight(40);
		graphic.setWidth(100);
		graphic.setStrokeWidth(5);
		graphic.setStroke(Color.BLUE);
		graphic.setX(x);
		graphic.setY(y);
		graphic.setArcWidth(25);
		graphic.setArcHeight(25);

		p.getChildren().add(graphic);

	}
}