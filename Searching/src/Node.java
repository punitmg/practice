import java.util.ArrayList;
import java.util.List;

public class Node{
	int value;
	List<Node> children;
	Node parent;
	
	public Node(int value, Node parent){
		this.value = value;
		this.parent = parent;
	}
	
	public void addChid(Node child){
		if(this.children == null){
			children = new ArrayList<Node>();
		}
		children.add(child);
	}
	
	public List<Node> getChildren(){
		return this.children;
	}
	
	public int getValue(){
		return this.value;
	}
}