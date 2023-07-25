package assinment.day2;

import java.util.Scanner;
import java.util.Stack;


public class BracketBalance {

	int tos,maxsize;
	char stack[];
	void createStack(int size) {
		stack=new char[size];
		maxsize=size;
		tos=0;
	}
	void push(char e) {
		tos++;
		stack[tos]=e;
	}
	char pop() {
		char temp=stack[tos];
		tos--;
		return temp;
	}
	boolean isFull() {
		if(tos==maxsize-1)
			return true;
		return false;
	}
	boolean isEmpty() {
		if(tos==-1)
			return true;
		return false;
	}
	public static void main(String[] args) {
		BracketBalance obj = new BracketBalance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int size=sc.nextInt();
		obj.createStack(size);
		System.out.println("Plese enter String with perentesis");
		String value=sc.nextLine();
		char ch;
		char temp[]=new char[size];
		int j=0;
		for(int i=0;i<value.length();i++) {
			ch=value.charAt(i);
			if(ch=='{'||ch=='('||ch=='[') {
				obj.push(ch);
			}
			if(ch=='}'||ch==')'||ch==']') {
				char comp =obj.pop();
				if(comp!='('||comp!='{'||comp!='[') {
					temp[j]=comp;
					j++;
				}
			}
			
		}
	}

}



