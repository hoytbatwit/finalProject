package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BottomLRRec {
	int x;
	int y;
	
	private Rectangle graphic;
	
	public BottomLRRec(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		graphic = new Rectangle();// Left
		graphic.setHeight(155);
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
