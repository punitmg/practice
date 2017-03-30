package graph;

import java.util.List;

import util.Graph;
import util.Node;

public class DFS {

	public static void main(String[] args) {
		Graph g = new Graph();
		boolean found = search(g.getRoot(), 15);
		System.out.println("Found: "+found);
	}
	
	public static boolean search(Node root, int value){
		
		if(root.getValue() == value){
			return true;
		}else{
			List<Node> children = root.getChildren();
			
			if(children != null){
				int i = 0;
				while(i < children.size()){
					boolean found = search(children.get(i), value);
					if(found){
						return true;
					}else{
						i++;
					}
				}
			}
			return false;
		}

	}
}
