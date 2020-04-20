package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ShortBorder {
int x;
int y;

private Rectangle graphic;

public ShortBorder(int x, int y, Pane p) {
	this.x = x;
	this.y = y;
	
	graphic = new Rectangle();// First Vertical line in the top left corner (THAT SHAPES OUT THE BOX)
	graphic.setHeight(250);
	graphic.setWidth(3);
	graphic.setStroke(Color.BLUE);
	graphic.setStrokeWidth(5);
	graphic.setX(x);
	graphic.setY(y);
	
	p.getChildren().add(graphic);
}
}
