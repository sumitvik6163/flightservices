package assinment.day3;

import java.util.Scanner;

class Node2 {
	int data;
	Node2 left,right;
	Node2(int data){
		this.data=data;
		left=right=null;
	}
}
public class DoubllyCircularLinkList {
	
	Node2 root,last;
	void creatList() {
		root=last=null;
	}
	void insertLeft(int val) {
		Node2 n=new Node2(val);
		if(root==null) {
			root=last=n;
			last.right=root;
			root.left=last;
		}
		else {
			n.right=root;
			root.left=n;
			last.right=n;
			n.left=last;
			root=n;
		}
	}
	void insertRight(int val) {
		Node2 n=new Node2(val);
		if(root==null) {
			root=last=n;
			last.right=root;
			root.left=last;
		}
		else {
			last.right=n;
			n.left=last;
			root.left=n;
			n.right=root;
			last=n;
		}
	}
	void deleteLeft() {
		if(root==null) {
			System.out.println("Empty List");
		}
		else {
			Node2 t= root;
			if(root==last) {
				root=last=null;
			}
			else {
				root=root.right;
				root.left=last;
				last.right=root;
			}
			System.out.println("Deleted: "+t.data);
		}
	}
	void deleteRight() {
		if(root==null) {
			System.out.println("Empty List");
		}
		else {
			Node2 t= last;
			if(root==last) {
				root=last=null;
			}
			else {
				last=last.left;
				root.left=last;
				last.right=root;
			}
			System.out.println("Deleted: "+t.data);
		}
	}
	void printList() {
		if(root==null) {
			System.out.println("Empty List");
		}
		else {
			Node2 t=root;
			do {
				System.out.print("|"+t.data+"|-->");
				t=t.right;
			}while(t!=root);		
		}
	}
	
	public static void main(String[] args) {
		DoubllyCircularLinkList obj = new DoubllyCircularLinkList();
		Scanner sc = new Scanner(System.in);
		int choice;
		obj.creatList();
		do {
			int e;
			System.out.println("\n1. Insert Left\n2. Insert Right\n3. Delete Left\n4. Delete Right\n5. Print All\n0. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
					System.out.println("Enter Element");
					e = sc.nextInt();
					obj.insertLeft(e);
				break;
			case 2:
				System.out.println("Enter Element");
				e = sc.nextInt();
				obj.insertRight(e);
			break;
			case 3:
					obj.deleteLeft();
				break;
			case 4:
				obj.deleteRight();
			break;
			case 5:
				obj.printList();
				break;
			case 0:
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}while(choice!=0);
	}		
}
