package programs;
import java.util.*;
public class Program {
	 int b=5;
	 int a[];
	 int top;
	public void Program() {
		a=new int[b];
		top=-1;
	}
	public void push(int c) {
		if(isFull()) {
			System.out.print("Cannot add elements");
		}
		top=top+1;
		a[top]= c;	
	}
	public void pop() {
		if(isEmpty()) {
			System.out.print("Cannot pop element");
		}
		top--;
	}
	public boolean isFull() {
		return (top==b-1);
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	 public String toString() {
		    return "Stack: " + Arrays.toString(a);
		  }
	public static void main(String[]args) {
		Program p=new Program();
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);
		System.out.print(p);
		p.pop();
		p.push(6);
		System.out.print(p);
		
}
}
