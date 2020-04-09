package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


import javafx.geometry.Point2D;

public class breadthSearch{
	
	public static List<Point2D> getPath(List<List<Point2D>> adjacencyList, Point2D start, Point2D dest){
		List<Point2D> frontier = new ArrayList<>();
		List<Point2D> visited = new ArrayList<>();
		frontier.add(start);
		visited.add(start);
		while(frontier.isEmpty() != true) {
				Point2D current = frontier.remove(frontier.size() - 1);
				if(current == dest) {
					visited.add(current);
					return visited;
				}else {
					double currentX = current.getX();
					double currentY = current.getY();
					int index = ((int) currentX * 10) + (int) currentY;
					for(Point2D neighbor : adjacencyList.get(index)) {
							if(visited.contains(neighbor) != true) {
								frontier.add(neighbor);
								visited.add(current);
							}
						}
					}
				return visited;
				}
		return null;
	}
}
	
//	public List<Point2D> getNeighbors(ArrayList<ArrayList<Double>> test){
//		ArrayList<Point2D> neighbors = new ArrayList<>();
////		Point2D north = new Point2D(x - 1, y);
////		Point2D east = new Point2D(x, y + 1);
////		Point2D south = new Point2D(x + 1, y);
////		Point2D west = new Point2D(x, y - 1);
////		if(north.getX() <= gridWidth && north.getX() >= 0) {
////			if(north.getY() <= gridHeight && north.getY() >= 0) {
////					neighbors.add(north);
////			}
////		}
////		if(east.getX() <= gridWidth && east.getX() >= 0) {
////			if(east.getY() <= gridHeight && east.getY() >= 0) {
////					neighbors.add(east);
////			}
////		}
////		if(south.getX() <= gridWidth && south.getX() >= 0) {
////			if(south.getY() <= gridHeight && south.getY() >= 0) {
////					neighbors.add(south);
////			}
////		}
////		if(west.getX() <= gridWidth && west.getX() >= 0) {
////			if(west.getY() <= gridHeight && west.getY() >= 0) {
////					neighbors.add(west);
////			}
////		}
//		for(int i = 0; i < test.size(); i++) {
//			for(int j = 0; j < test.get(i).size(); j++){
//				double point = test.get(i).get(j);
//				Point2D pointOnGraph = nodes.get((int) point);
//				neighbors.add(pointOnGraph);
//			}
//		}
//		return neighbors;
//	}
//	
//	public void addEdge(ArrayList<ArrayList<Double>> test, double u, double v) {
//		test.get((int) u).add(v);
//		test.get((int) v).add(u);
//	}
//}


