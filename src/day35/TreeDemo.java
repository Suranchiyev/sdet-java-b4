package day35;

public class TreeDemo {
	public static void main(String[] args) {
//		TreeNode root = new TreeNode(8);
//		
//		TreeNode node = new TreeNode(4);
//		
//		if (root.value > node.value) {
//			root.leftChild = node;
//		} else {
//			// if same goes to the right
//			root.rightChild = node;
//		}
		
		Tree tree = new Tree();
		tree.add(8);
		tree.add(4);
		tree.add(2);
		tree.add(1);
		tree.add(7);
		tree.add(50);
		tree.add(30);
		tree.add(189);
		tree.add(25);
		tree.add(49);
		tree.add(456);
		tree.display();
		
		tree.add(0);
		tree.display();
		
		// TreeSet
		// TreeMap
		
		// Break till 11:25 AM
		
	}
}
