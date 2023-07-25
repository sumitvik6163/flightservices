package assinment.day2;

import java.util.Scanner;

class Node {
	char data;
	Node next;
	Node(char data){
		this.data=data;
		next=null;				
	}
}
public class ReverseString {
	Node tos;
	void createStack() {
		tos=null;
	}
	void push(char val) {
		Node n=new Node(val);
		if(tos==null)
			tos=n;
		else {
			n.next=tos;
			tos=n;
		}
		
	}
	void pop() {
		String result=null;
		if(tos==null) {
			System.out.println("Empty Stack");
		}
		else {
			Node t=tos;
			tos=tos.next;
			result = result+t.data;
			System.out.print(t.data);
		}
	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter String");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			obj.push(str.charAt(i));
		}
		System.out.println("Reversed String is");
		for(int i=0;i<str.length();i++)
			obj.pop();
		
	}

}
