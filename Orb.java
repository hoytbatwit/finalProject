package application.map;

import java.util.ArrayList;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Orb {

	int x;
	int y;

	private Circle graphic;

	public Orb(int x, int y, Pane p) {
		this.x = x;
		this.y = y;

		graphic = new Circle();
		graphic.setCenterX(x);
		graphic.setCenterY(y);
		graphic.setRadius(5);
		graphic.setStroke(Color.YELLOW);
		graphic.setFill(Color.YELLOW);
		
		
		
		
//		graphic.setFill(Color.BLACK);
		
		
		p.getChildren().add(graphic);
	}

//	ArrayList<Orb> adjecentOrbs;

//	public void addAdjecent(Orb o) {
//		adjecentOrbs.add(o);
//	}
}