package application.map;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SideMMRec {
	int x;
	int y;
	
	private Rectangle graphic;
	
	public SideMMRec(int x, int y, Pane p) {
		graphic = new Rectangle();// The line going down the middle (Sideways)
		graphic.setHeight(25);
		graphic.setWidth(45);
		graphic.setStroke(Color.RED);
		graphic.setStrokeWidth(5);
		graphic.setX(x);
		graphic.setY(y);
		graphic.setArcWidth(25);
		graphic.setArcHeight(25);
		
		p.getChildren().add(graphic);
	}

}