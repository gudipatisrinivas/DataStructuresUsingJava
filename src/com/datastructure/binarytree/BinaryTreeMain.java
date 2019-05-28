package com.datastructure.binarytree;

public class BinaryTreeMain {
	public static void main(String[] args) {

		BinaryTree theTree = new BinaryTree();

		theTree.addNode(50);

		theTree.addNode(25);

		theTree.addNode(15);

		theTree.addNode(30);

		theTree.addNode(75);

		theTree.addNode(85);


		
		/*
		 * System.out.println(); System.out.println(" Pre Order");
		 * theTree.preorderTraverseTree(theTree.root);
		 * 
		 * theTree.invertedBinaryTree(theTree.root); System.out.println();
		 * System.out.println(" Inverted Pre Order");
		 * theTree.preorderTraverseTree(theTree.root);
		 * System.out.println("\n"+theTree.kthSmallest(theTree.root, 4));
		 * System.out.println("Leaf Nodes"); theTree.leafNodes(theTree.root);
		 */
		theTree.levelOrder(theTree.root);
		System.out.println("Is Valid BST"+theTree.isValidBinaryTree(theTree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));

}

}
