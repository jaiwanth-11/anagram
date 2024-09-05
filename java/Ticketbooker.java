package programs;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Ticketbooker {
   static int availablelowerberth=10;
   static int availablemiddleberth=10;
   static int availableupperberth=10;
   static List<Integer> lowerberth=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
   static List<Integer> middleberth=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
   static List<Integer> upperberth=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
   public void Bookticket(String a,String b) {
	   if(b.equals("L") && Ticketbooker.availablelowerberth>0) {
		   System.out.print("Name: "+a);
		   System.out.println();
		   System.out.print("alloted berth: "+Ticketbooker.lowerberth.get(0)+b);
		   Ticketbooker.lowerberth.remove(0);
		   Ticketbooker.availablelowerberth--; 
	   }
	   else if(b.equals("M") && Ticketbooker.availablemiddleberth>0) {
		   System.out.print("Name: "+a);
		   System.out.println();
		   System.out.print("alloted berth: "+Ticketbooker.middleberth.get(0)+b);
		   Ticketbooker.middleberth.remove(0);
		   Ticketbooker.availablemiddleberth--; 
	   }
	   else if(b.equals("U") && Ticketbooker.availableupperberth>0) {
		   System.out.print("Name: "+a);
		   System.out.println();
		   System.out.print("alloted berth: "+Ticketbooker.upperberth.get(0)+b);
		   Ticketbooker.upperberth.remove(0);
		   Ticketbooker.availableupperberth--; 
   }
}
}
