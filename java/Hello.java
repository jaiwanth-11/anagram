package programs;
import java.util.*;
public class Hello {
	int front;
	int rear;
	int size;
	int a[];
	public Hello(int sizeofArray){
		a=new int[sizeofArray];
		front=sizeofArray;
		rear=-1;
		size=0;
 }
	public void enqueue(int b) {
		int response=0;
		if(rear!= a.length-1) {
			rear++;
			a[rear]=b;
			size++;
		}
	}
	public int dequeue() {
			int response=0;
			if(size!=0) {
				front--;
				response=a[front];
				size--;
			}
			return response;
	}
		
	}
