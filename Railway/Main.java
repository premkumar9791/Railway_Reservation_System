package Railway;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	

//			1.Main Class: Offers a menu for users to book, cancel, check availability, and view ticket status.
//			2.Ticket Booking: Users can reserve seats while checking availability.
//			3.Ticket Cancellation: Allows cancellations by name with a confirmation prompt.
//			4.Railway_reservation Class: Manages passenger details and reservation lists.
		
		

//  features for railway reservation system:
//
//			1.Ticket Booking: Users can reserve AC, non-AC, and seater tickets based on availability.
//			2.Ticket Cancellation: Users can cancel booked tickets by providing their name, with a confirmation step.
//			3.Availability Check: Users can check the number of available seats for different categories before booking.
//			4.Status Checking: Users can view their booked and canceled reservations with details.
//			5.User-Friendly Interface: Provides a menu-driven interface for easy navigation and interaction.
//		
         Scanner n=new Scanner(System.in);
         boolean loop=true;
         int ac_num=60;
         int non_ac_num=60;
         int seaters_num=60;
         
         Railway_reservation rail=new Railway_reservation();
         while(loop) {
        	 System.out.println("enter a number \n1.ticket booking \n2.ticket cancellation \n3.availability check \n4.Status checking \n5.exit");
        	 int number=n.nextInt();
        	 if(number == 1) {
        		 System.out.println("enter your name");
        		 String name=n.next();
        		 System.out.println("enter how many ac seats you want");
        		 int ac=n.nextInt();
        		 System.out.println("eneter how many non_ac seats you want");
        		 int non_ac=n.nextInt();
        		 System.out.println("eneter how many Seater seats you want");
        		 int seaters=n.nextInt();
        		 if(ac <= ac_num && non_ac <= non_ac_num && seaters <= seaters_num) {
        			 ac_num-=ac;
        			 non_ac_num-=non_ac;
        			 seaters_num-=seaters;
        			 Railway_reservation n1=new Railway_reservation(name,ac,non_ac,seaters);
            		 rail.status.add(n1); 
        		 }
        		 else {
        			 System.out.println("seat is not available ");
        			 System.out.println("----------------------------------------");
            		 System.out.println("available ac seats ="+ ac_num );
            		 System.out.println("available non_ac seats ="+ non_ac_num );
            		 System.out.println("available seater seats ="+ seaters_num );
        		 }
        		
        	 }
        	 else if(number == 2) {
        		 System.out.println("enter your name");
        		 String name=n.next();
        		 for(Railway_reservation sts:rail.status) {
            		 if(sts.name.equals(name)) {
            			 System.out.println(sts.toString());
            			 System.out.println("eneter yes to cancle the ticket");
            			 String ans=n.next();
            			 if(ans.equals("yes")) {
            				 rail.cancle_list.add(sts);
            				 rail.status.remove(sts);
            			 }
            			 else {
            				 System.out.println("your ticket is not cancle");
            			 }
            		 }
            	 }
        	 }
        	 else if(number == 3 ) {
        		 System.out.println("----------------------------------------");
        		 System.out.println("available ac seats ="+ ac_num );
        		 System.out.println("available non_ac seats ="+ non_ac_num );
        		 System.out.println("available seater seats ="+ seaters_num );
        		 System.out.println("----------------------------------------");
        	 }
             else if(number == 4) {
            	  System.out.println("booked Seats");
            	  System.out.println("----------------------------------------");
            	 for(Railway_reservation sts:rail.status) {
            		 System.out.println(sts.toString());
            	 }
            	 System.out.println("----------------------------------------------------------------------");
            	 System.out.println("cancled seats");
            	 System.out.println("-------------------------------------------");
            	 for(Railway_reservation sts:rail.cancle_list) {
            		 System.out.println(sts.toString());
            	 }
        	 }
             else if(number == 5) {
            	 loop = false; 
        		System.out.println("you are exited the booking reservation System");
             }
             else {
            	 loop =false;
            	 System.out.println("you enter wrong number");
             }
        	 

         }
	}
}
