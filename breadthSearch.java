package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import javafx.geometry.Point2D;

public class breadthSearch{
	
	public static Map<Point2D,Point2D> getPath(List<List<Point2D>> adjacencyList, Point2D start, Point2D dest, List<Point2D> nodes){
		Queue<Point2D> frontier = new LinkedList<>();
		Map<Point2D,Point2D> cameFrom = new HashMap<>();
		frontier.offer(start);
		cameFrom.put(start,null);
		while(frontier.isEmpty() != true) {
			Point2D current = frontier.poll();
			if(current.equals(dest)) {
				break;
			}else {
//				int index = 0;
//				int test = adjacencyList.size();
//				int i = 0;
//				while(i<test) {
//					if(adjacencyList.get(i) == current) {
//						index = i;
//					}
//				}
				double currentX = current.getX();
				double currentY = current.getY();
				int index = ((int) currentX * 10) + (int) currentY;
				for(Point2D neighbor : adjacencyList.get(index)) {
					if(cameFrom.containsKey(neighbor) != true) {
						frontier.offer(neighbor);
						cameFrom.put(neighbor, current);
					}
				}
			}
		}
		return cameFrom;
	}
	
	public static List<Point2D> returnPath(Point2D start, Point2D dest, Map<Point2D,Point2D> cameFrom){
		List<Point2D> path = new ArrayList<>();
		Point2D current = dest;
		while(!current.equals(start)) { 
			path.add(current);
			current = cameFrom.get(current);
		}
		Collections.reverse(path);
		return path;
	}
}

