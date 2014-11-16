package com.jerry.tree;

import org.junit.Test;

public class TreeTest {
	
	@Test
	public void treeTest() {
		 Node<String> root = new Node<String>("A",-1);  
	        Tree<String> tree = new ArrayTree<String>(root);  
	        Node<String> b = new Node<String>("B");  
	        Node<String> c = new Node<String>("C");  
	        Node<String> d = new Node<String>("D");  
	        Node<String> e = new Node<String>("E");  
	        Node<String> f = new Node<String>("F");  
	        Node<String> g = new Node<String>("G");  
	        tree.add(b,root);  
	        tree.add(c,root);  
	        tree.add(d,root);  
	          
	        tree.add(e,b);  
	        tree.add(f,b);  
	        tree.add(g,f);  
	          
	          
	        System.out.println(tree.getSize());  
	        System.out.println(tree.getRoot().getData());  
	        System.out.println(tree.getAllNodes());  
	        System.out.println(tree.getDepth());  
	        tree.add(new Node<String>("H"),g);  
	        System.out.println(tree.getDepth());  
//	        tree.enlarge();  
	}
}
