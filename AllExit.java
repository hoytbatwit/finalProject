
package application.map;

import java.util.ArrayList;

import javafx.scene.layout.Pane;

public class AllExit {
	ArrayList<Exit> allExit = new ArrayList<Exit>();
	
	ArrayList<SmallExit> allSmallExit = new ArrayList<SmallExit>();
	
	ArrayList<ShortBorder> allShortBorder = new ArrayList<ShortBorder>();
	
	ArrayList<Border> allBorders = new ArrayList<Border>();

	public AllExit(Pane p) {
		allExit.add(new Exit(100, 379, p));
		allExit.add(new Exit(100, 520, p));
		allExit.add(new Exit(1503, 379, p));
		allExit.add(new Exit(1503, 526, p));
		allExit.add(new Exit(1503, 485, p));
		allExit.add(new Exit(1503, 420, p));
		allExit.add(new Exit(100, 485, p));
		allExit.add(new Exit(100, 420, p));
		
		allSmallExit.add(new SmallExit(297, 385, p));
		allSmallExit.add(new SmallExit(297, 490, p));
		allSmallExit.add(new SmallExit(1503, 386, p));
		allSmallExit.add(new SmallExit(1503, 490, p));

		allShortBorder.add(new ShortBorder(100, 128, p));
		allShortBorder.add(new ShortBorder(100, 528, p));
		allShortBorder.add(new ShortBorder(1700, 128, p));
		allShortBorder.add(new ShortBorder(1700, 531, p));
		
		allBorders.add(new Border(100, 100, p));
		allBorders.add(new Border(100, 800, p));

	}

}