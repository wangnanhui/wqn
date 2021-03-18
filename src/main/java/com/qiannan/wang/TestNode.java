package com.qiannan.wang;

import java.util.concurrent.locks.ReentrantLock;

public class TestNode {
	
	static ReentrantLock lock ; 
	
	
	Node root ; 
	
	public static void main(String[] args) {
		
		
		Integer [] arr = {1,1,1,1,1,1,1,1,43,7,1,14,1,1,1,56,1,3,1,2,4,32,67,32,67,24,89,1,1,45};
		TestNode t = new TestNode();
		t.put(arr);
		System.out.print("原始：");
		t.print(t.root);
		System.out.println();
		System.out.print("去除：");
		t.delete(1);
	
		
	}
	

	public Node delete(int delete) {

		Node temp = root;

		while (temp != null && temp.val == delete) {
			temp = temp.next;
		}
		Node head = temp;
		if (head == null)
			return head;
		while (head.next != null) {
			Node hNext = head.next;
			if (hNext.val == delete) {
				head.next = hNext.next;
			} else {
				head = head.next;
			}
		}
		print(temp);

		return temp;

	}
	
	
	
	public void put(Integer [] arr ) {
		
		root = new Node();
		root.val =  arr[0]; 
		
		
		Node temp =  root ; 
		
		for (int i = 1; i < arr.length; i++) {
			int j = arr[i];
			
			if(temp.next == null) {
				temp.next = new Node();
				temp.next.val = j ; 
			}
			temp = temp.next;
			
			
		}
		
		
		
	}
	
	void print(Node root) {
		Node temp = root;  
		while(temp != null) {
			System.out.print(temp.val +"->");
			temp = temp.next;
			
			
			
		}
	
		
		
	}
	
	
	

}
class Node{
	public Integer val ; 
	public Node next ; 
	
}
