package programs;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class Book {
	public void Call(String a,String b) {
		Ticketbooker t=new Ticketbooker();
		t.Bookticket(a, b);
	}
	public void printdetails() {
		List<Ticketbooker>Hello=new ArrayList<>();
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		sc.nextLine();
		int n=0;
		Book v=new Book();
		while(n<=10) {
			switch(c){
			case 1:
			String a=sc.nextLine();
			String b=sc.nextLine();
			v.Call(a, b);
			case 2:
		    v.printdetails();
			}
			n+=1;
		}
	}
}
