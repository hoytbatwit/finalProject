package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class InsideMidRec {
	int x;
	int y;

	private Rectangle graphic;

	public InsideMidRec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		graphic = new Rectangle();// OUTSIDE RIGHT
		graphic.setHeight(150);
		graphic.setWidth(120.5);
		graphic.setStroke(Color.MEDIUMVIOLETRED);
		graphic.setStrokeWidth(5);
		graphic.setX(x);
		graphic.setY(y);
		graphic.setArcWidth(25);
		graphic.setArcHeight(25);
		
		p.getChildren().add(graphic);
	}

}
