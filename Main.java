package application;
	
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import application.map.AllExit;
import application.map.AllOrbs;
import application.map.AllRec;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


/**
 *This is the main code of our project it is where all of the 
 *code comes together. First a grid pane is generated and 
 * then players are added to the pane and all of the accessory
 * class are called bellow that.
 */
public class Main extends Application {
	
	//global variables for use in the code
	public final static int GRIDHEIGHT=10;
	public final static int GRIDWIDTH=10;
	public final static int WINDOWHEIGHT=1000;
	public final static int WINDOWWIDTH=1800;
	public static int xLocation = 1;
	public static int yLocation = 0;
	public static int xGoal = 7;
	public static int yGoal = 4;
	public static List<Point2D> grid = new ArrayList<>();
	AnimationTimer gameLoop;
	public static List<Point2D> path = new ArrayList<>();
	public static Point2D location = new Point2D(0,0);
	public int direction = 30;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
			 * This code is used to put a map in the background.
			 * This allows there to be two panes in the scene just one on top of each other.
			 */
			Pane root2 = new Pane();
			root2.setStyle("-fx-background-color: black");
			AllOrbs Orbs = new AllOrbs(root2);
			AllExit Border = new AllExit(root2);
			AllRec Rec = new AllRec(root2);
			AllRec SmallRec = new AllRec(root2);
			AllRec TinyRec = new AllRec(root2);
			AllExit Exit = new AllExit(root2);
			AllExit SmallExit = new AllExit(root2);
			AllExit ShortBorder = new AllExit(root2);
			AllRec MediumRec = new AllRec(root2);
			AllRec TopMediumRec = new AllRec(root2);
			AllRec CenterRec = new AllRec(root2);
			AllRec SkinnyHRec = new AllRec(root2);
			AllRec OutsideMiddleRec = new AllRec(root2);
			AllRec InsideMidRec = new AllRec(root2);
			AllRec VMiddleRec = new AllRec(root2);
			AllRec HMiddleRec = new AllRec(root2);
			AllRec MicroMiddleRec = new AllRec(root2);
			AllRec SideMicroMiddleRec = new AllRec(root2);
			AllRec SideMMRec = new AllRec(root2);
			AllRec HalfHMidleRec = new AllRec(root2);
			AllRec BottomLRRec = new AllRec(root2);
			GridPane root = new GridPane();
			
			//This finds the size of each node
			int graphicSize=180;
			
			//This creates all of the nodes and adds them to an array list which is used later in the code
			for(int i=0;i<GRIDHEIGHT;i++) {
				for (int j=0;j<GRIDWIDTH;j++) {
					root.add(new GridElement(i,j,graphicSize).getGraphic(), i, j);
					Point2D node = new Point2D(i,j);
					grid.add(node);
				}
			}
			
//			//creates the ghost and adds it to the pane
			Player p = new Player(xLocation,yLocation,15, 15, direction, 360, Color.RED);     
			root.add(p.getGraphic(), xLocation, yLocation);
			
//			//This is a Point2D which is used in the search algoithm
			location = new Point2D(xLocation, yLocation);
//			
//			//Adds the pacman to the pane
			Player goal = new Player(xGoal,yGoal,20, 20, direction, 270, Color.YELLOW);
			root.add(goal.getGraphic(), xGoal, yGoal);
//			
//			
//			//This code displays the whole scene with everything on it
			Scene scene = new Scene(root,WINDOWWIDTH,WINDOWHEIGHT);
			root.getChildren().addAll(root2);
			primaryStage.setScene(scene);
			primaryStage.show();
			root.requestFocus();
//			
//			
			//This creates an adjacencyList which contains a point and a point that it is connected to
			List<List<Point2D>> adjacencyList = new ArrayList<>();
			for(Point2D point: grid) {
				//first it finds the x and y of the point and creates a list that contains the neighbors
				double x = point.getX();
				double y = point.getY();
				List<Point2D> neighbors = new ArrayList<>();
				/*
				 * These if statements check to make sure that the points that are created are inside
				 * of the graph and if they are they are added to the neighbors list
				 */
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
			
			/*
			 * This event is used to update the position of the ghost
			 * every second it updates the position of the ghost based on the 
			 * path that was created.
			 */
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
				
				
			/*
			 * This key event serves multiple purposes. The first thing that is updated is the position of the pacman. 
			 * Based on which key was pressed the player will move in a different direction. Next the path is updated.
			 * This allows the program to always know where the player is and allows there to always be an accurate 
			 * path to the player.
			 */
		root.setOnKeyPressed(
					(e)->{
						//These variables are all needed and used in the updating of different things inside the key event
						int i = 0;
						int x=goal.getX();
						int y=goal.getY();
						int playerX = goal.getX();
						int playerY = goal.getY();
						int x2 = p.getX();
						int y2 = p.getY();
						Point2D location2 = new Point2D((double) x2, (double) y2);
						Point2D goal2 = new Point2D((double) playerX,(double) playerY);
						Map<Point2D,Point2D> cameFrom = breadthSearch.getPath(adjacencyList, location2, goal2, grid);
						path = breadthSearch.returnPath(location2, goal2, cameFrom);
						if(e.getCode()==KeyCode.UP) {
							int val=y-1;
							if(val<0) val=0;
							goal.move(x,val,root);	
							playerX =  goal.getX();
							playerY = goal.getY();
							goal2 = new Point2D((double) playerX,(double) playerY);
							cameFrom = breadthSearch.getPath(adjacencyList, location2, goal2, grid);
							path = breadthSearch.returnPath(location2, goal2, cameFrom);
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
							cameFrom = breadthSearch.getPath(adjacencyList, location2, goal2, grid);
							path = breadthSearch.returnPath(location2, goal2, cameFrom);
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
							cameFrom = breadthSearch.getPath(adjacencyList, location2, goal2, grid);
							path = breadthSearch.returnPath(location2, goal2, cameFrom);
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
							cameFrom = breadthSearch.getPath(adjacencyList, location2, goal2, grid);
							path = breadthSearch.returnPath(location2, goal2, cameFrom);
							location = path.get(i);
							grid.remove(i);
							direction = 30;
						}
					}
				);
			
			//Standard JavaFX stuff to show the window.
//			
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}