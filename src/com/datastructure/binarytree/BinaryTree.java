package com.datastructure.binarytree;

import java.util.Stack;

public class BinaryTree  extends BinaryTreeBase{
	
	public Node invertedBinaryTree(Node root) {
		if(root==null) {
			return root;
		}
		invertedBinaryTree(root.leftChild);
		invertedBinaryTree(root.rightChild);
		Node n=root.leftChild;
		root.leftChild=root.rightChild;
		root.rightChild=n;
		
		return root;
	}
	
	public int kthSmallest(Node root, int k) {
	    Stack<Node> stack=new Stack<>();
	    Node next=root;
	    int result=0;
	    while(next!=null || !stack.isEmpty()) {
	    	if(next!=null) {
	    		stack.push(next);
	    		next=next.leftChild;
	    		
	    	}else {
	    		Node t=stack.pop();
	    		k--;
	    		if(k==0) {
	    			result=t.key;
	    		}
	    		next=t.rightChild;
	    	}
	    }
		
		return result;
	}
	
	
	public void leafNodes(Node root) {
		if(root==null) {
			return;
		}
		if( root.leftChild==null && root.rightChild==null) {
			System.out.println(root.key);
			
		}
		leafNodes(root.leftChild);
		leafNodes(root.rightChild);
	}
	
	
	public void levelOrder(Node root) {
		int height=findTheHeight(root);
		System.out.println("Height"+height);
		for(int i=0;i<=height;i++) {
			printLevel(root,i);
		}
	}

	private void printLevel(Node root, int i) {
		// TODO Auto-generated method stub
		if(root==null) {
			return ;
		}
		if(i==1) {
			System.out.println(root.key);
		}else {
			printLevel(root.leftChild, i-1);
			printLevel(root.rightChild, i-1);
			
		}
		
	}

	private int findTheHeight(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return 0;
		}else {
			int leftHeigh=findTheHeight(root.leftChild);
			int rightHeight=findTheHeight(root.rightChild);
			return Math.max(leftHeigh+1, rightHeight+1);
		}
		//return 0;
	}
	
	public boolean isValidBinaryTree(Node root,int max,int min) {
		if(root==null) {
			return true;
		}
		if(root.key<min || root.key>max ) {
			return false;
		}
		return isValidBinaryTree(root.leftChild, min, root.key) 
				&& isValidBinaryTree(root.leftChild, root.key, max);
	}
}
