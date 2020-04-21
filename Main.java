
package application;
	
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;

/**
 * Program to demonstrate GridPane usage.
 * 
 */
public class Main extends Application {
	
	//Variables to determine gird and window size
	public final static int GRIDHEIGHT=10;
	public final static int GRIDWIDTH=10;
	public final static int WINDOWHEIGHT=500;
	public final static int WINDOWWIDTH=500;
	public static int xLocation = 0;
	public static int yLocation = 0;
	public static int xGoal = 9;
	public static int yGoal = 9;
	public static List<Point2D> grid = new ArrayList<>();
	AnimationTimer gameLoop;
	public static List<Point2D> path = new ArrayList<>();
	public static Point2D location = new Point2D(0,0);
	public int direction = 30;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			
			//This assumes square window and graphic!
			//Stroke size must be subtracted...
			int graphicSize=WINDOWHEIGHT/GRIDHEIGHT - 3;
			
			//create all of the grid location and
			//add them to the GridPane;
			for(int i=0;i<GRIDHEIGHT;i++) {
				for (int j=0;j<GRIDWIDTH;j++) {
					root.add(new GridElement(i,j,graphicSize).getGraphic(), i, j);
					Point2D node = new Point2D(i,j);
					grid.add(node);
				}
			}
			
			//create player object and add player to gridpane
			Player p = new Player(xLocation,yLocation,15, 15, direction, 360, Color.RED);     
			root.add(p.getGraphic(), xLocation, yLocation);
			
			
			location = new Point2D(xLocation, yLocation);
			
			Player goal = new Player(xGoal,yGoal,15, 15, direction, 270, Color.YELLOW);
			root.add(goal.getGraphic(), 9, 9);
			
			
			
			Scene scene = new Scene(root,WINDOWWIDTH,WINDOWHEIGHT);
			primaryStage.setScene(scene);
			primaryStage.show();
			root.requestFocus();
			
			
			
			List<List<Point2D>> adjacencyList = new ArrayList<>();
			for(Point2D point: grid) {
				double x = point.getX();
				double y = point.getY();
				List<Point2D> neighbors = new ArrayList<>();
				if(x - 1 > -1) {
					neighbors.add(new Point2D(x - 1, y));
					//System.out.printf("%s%n", new Point2D(x -1, y).toString());
				}
				if(x + 1 < 10) {
					neighbors.add(new Point2D(x + 1, y));
				}
				if(y - 1 > -1) {
					neighbors.add(new Point2D(x, y - 1));
				}
				if(y + 1 < 10) {
					neighbors.add(new Point2D(x, y + 1));
				}
				adjacencyList.add(neighbors);
			}
			
			EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					if(path.size()>0) {
						Point2D current = path.get(0);
						path.remove(0);
						double x = current.getX();
						double y = current.getY();
						p.move((int) x,(int) y, root);
						System.out.printf("point: %d %f %f%n",path.size(), x,y);
						grid.remove(current);
					}
				}
				
			};
			Timeline tl = new Timeline(new KeyFrame(Duration.millis(1000),handler));
			tl.setCycleCount(Timeline.INDEFINITE);
			tl.play();
				
				
//			setting up keyboard interaction
		root.setOnKeyPressed(
					(e)->{
						int i = 0;
						int x=goal.getX();
						int y=goal.getY();
						int playerX =  goal.getX();
						int playerY = goal.getY();
						Point2D goal2 = new Point2D((double) playerX,(double) playerY);
						Map<Point2D,Point2D> cameFrom = breadthSearch.getPath(adjacencyList, location, goal2, grid);
						path = breadthSearch.returnPath(location, goal2, cameFrom);
						//moves the player piece based on key input
						//the val variable and the if statement
						//ensure that you don't move past the edge
						//of the grid.
						if(e.getCode()==KeyCode.UP) {
							int val=y-1;
							if(val<0) val=0;
							goal.move(x,val,root);	
							playerX =  goal.getX();
							playerY = goal.getY();
							goal2 = new Point2D((double) playerX,(double) playerY);
							cameFrom = breadthSearch.getPath(adjacencyList, location, goal2, grid);
							path = breadthSearch.returnPath(location, goal2, cameFrom);
							grid.remove(i);
							location = path.get(i);
							direction = 130;
						}
						if(e.getCode()==KeyCode.DOWN) {
							int val=y+1;
							if(val>GRIDHEIGHT-1) val=GRIDHEIGHT-1;
							goal.move(x,val,root);
							playerX =  goal.getX();
							playerY = goal.getY();
							goal2 = new Point2D((double) playerX,(double) playerY);
							cameFrom = breadthSearch.getPath(adjacencyList, location, goal2, grid);
							path = breadthSearch.returnPath(location, goal2, cameFrom);
							grid.remove(i);
							location = path.get(i);
							direction = 0;
							
						}
						if(e.getCode()==KeyCode.LEFT) {
							int val=x-1;
							if(val<0) val=0;
							goal.move(val,y,root);
							playerX =  goal.getX();
							playerY = goal.getY();
							goal2 = new Point2D((double) playerX,(double) playerY);
							cameFrom = breadthSearch.getPath(adjacencyList, location, goal2, grid);
							path = breadthSearch.returnPath(location, goal2, cameFrom);
							grid.remove(i);
							location = path.get(i);
							direction = 230;
						}
						if(e.getCode()==KeyCode.RIGHT) {
							int val=x+1;
							if(val>GRIDWIDTH-1) val=GRIDWIDTH-1;
							goal.move(val,y,root);
							playerX =  goal.getX();
							playerY = goal.getY();
							goal2 = new Point2D((double) playerX,(double) playerY);
							cameFrom = breadthSearch.getPath(adjacencyList, location, goal2, grid);
							path = breadthSearch.returnPath(location, goal2, cameFrom);
							location = path.get(i);
							direction = 30;
						}
					}
				);
			
			//Standard JavaFX stuff to show the window.
			
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
