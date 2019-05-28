package com.datastructure.binarytree;
class BNode{
	int number;
	BNode leftNode;
	BNode rightNode;
	
	BNode(int number){
		this.number=number;
	}
	
	
}
class BST{
	BNode root;
	public void add(int number) {
		BNode newNode=new BNode(number);
		if(root==null) {
			root=newNode;
		}else {
			BNode focusNode=root;
			BNode parent;
			while(true) {
				
				parent=focusNode;
				if(number<focusNode.number) {
					focusNode=focusNode.leftNode;
					if(focusNode==null) {
						parent.leftNode=newNode;
						return;
					}
					
					
				}else {
					
					focusNode=focusNode.rightNode;
					if(focusNode==null) {
						
						parent.rightNode=newNode;
						return;
					}
					
				}
			}
		}
	}
	public void inOrderTraversal(BNode root) {
		// TODO Auto-generated method stub
		if(root!=null) {
		inOrderTraversal(root.leftNode);
		System.out.print(root.number+"\t");
		inOrderTraversal(root.rightNode);
		}
		
	}
	public void preOrderTraversal(BNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		
		System.out.print(root.number+"\t");
		inOrderTraversal(root.leftNode);
		inOrderTraversal(root.rightNode);
		
	}
	public void postOrderTraversal(BNode root) {
		// TODO Auto-generated method stub
		if(root!=null) {
			
		inOrderTraversal(root.leftNode);
		
		inOrderTraversal(root.rightNode);
		System.out.print(root.number+"\t");
		}
	}
}

public class BinaryTreeImpl {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst=new BST();
		bst.add(1);
		bst.add(2);
		bst.add(5);
		bst.add(3);
		bst.add(6);
		bst.add(4);
		//bst.add(85);
		/*
		 * System.out.println("In Order Traversal"); bst.inOrderTraversal(bst.root);
		 */
		System.out.println();
		System.out.println("In PreOrder Traversal");
		bst.preOrderTraversal(bst.root);
		//bst.
		/*
		 * System.out.println(); System.out.println("In PostOrder Traversal");
		 * bst.postOrderTraversal(bst.root);
		 */
		

	}

}
