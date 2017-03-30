public class Graph {
	
	public Node root;
	public Graph(){
		this.root = populateTree();
	}
	
	public Node getRoot(){
		return this.root;
	}
	
	public static Node populateTree(){
		
		// root
		Node root = new Node(1, null);
		Node child1 = new Node(2, root);
		Node child2 = new Node(3, root);
		Node child3 = new Node(4, root);
//		Node child4 = new Node(14, root);
		root.addChid(child1);
		root.addChid(child2);
		root.addChid(child3);
//		root.addChid(child4);
		
		// level 1
		Node child11 = new Node(5, child1);
		Node child12 = new Node(6, child1);
		child1.addChid(child11);
		child1.addChid(child12);
		// level 1
		Node child21 = new Node(7, child2);
		Node child22 = new Node(8, child2);
		child2.addChid(child21);
		child2.addChid(child22);
		// level 1
		Node child31 = new Node(9, child3);
		Node child32 = new Node(10, child3);
		child3.addChid(child31);
		child3.addChid(child32);
		
		// level 2
		Node child111 = new Node(15, child11);
		Node child112 = new Node(16, child11);
		child11.addChid(child111);
		child11.addChid(child112);
		
		return root;
	}

}