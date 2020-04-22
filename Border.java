package application.map;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Border {
	int x;
	int y;
	
	
	private Rectangle graphic;
	
	public Border(int x, int y, Pane p) {
		this.x = x;
		this.y = y;
		
		graphic = new Rectangle();// The LOONG line on the top (THAT SHAPES OUT THE BOX)
		graphic.setHeight(3);
		graphic.setWidth(1603);
		graphic.setStroke(Color.BLUE);
		graphic.setStrokeWidth(5);
		graphic.setX(x);
		graphic.setY(y);
		
		
		
		
		
		
		
		
		
		p.getChildren().add(graphic);
	}
	public void LittleBorder(int x, int y, Pane p) {
		
	}
	
}