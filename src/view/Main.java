package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import application.FlowerShopController;
import domain.Flower_Shop;

public class Main {
	
	private static FlowerShopController controller = new FlowerShopController();

	public static void main(String[] args) {
		
		  	Scanner sc = new Scanner(System.in);
	        boolean exit = false;
	        int opcion; 
	     
	        while (!exit) {
	        	Menu.welcome();	 	   	
	        
	            try {
	 
	                System.out.println("Select one Option");
	                opcion = sc.nextInt();
	 
	                switch (opcion) {
	                    case 1:
	                        System.out.println("New Flower Shop");
	                        createShop(); //TODO: Fix error when you write a full adress
	                        System.out.println("Your New Flower Shop has been created");
	                        break;
	                    case 2:
	                        System.out.println("View Flower Shop");
	                        viewShops();
	                        break;
	                    /*case 3:
	                        System.out.println("Start Flower Shop");
	                        Menu.oneShopMenu();
	                        break;*/
	                    case 4:
	                        System.out.println("Delete Flower Shop");
	                        Menu.line();
	                        System.out.println("If you do not see a numbered list is that you still have to create the first shop");
	                        Menu.line();
	                        deleteShop();
	                        break;	              
	                    case 5:
	                    	System.out.println("I want to Exit the program. Bye, bye");
	                    	exit = true;
	                        break;
	                    default:
	                        System.out.println("You must enter a number between (1,2,3,4)");
	                }
	                
	            } catch (InputMismatchException e) {
	            	
	                System.out.println("You must enter a number \n");
	                sc.next();
	                
	            }finally{
					//System.out.println("Continue");						
				}
	      
	        }
}

	private static void deleteShop() {
		
		int iCont =0;
		Scanner sc = new Scanner (System.in);
		int iOption=-1;
		
		for (Flower_Shop flowershop : controller.getRepositoryShops().getAllShops()) {		
			iCont++;
			System.out.println(iCont + ". " + flowershop.getName() +"\n");
		}
		do {
		try {
			System.out.println("Select the Shop to Delete");
			iOption=sc.nextInt();		
			
			
			if (iOption <1 || iOption >iCont) {
				System.out.println("You must choose one Shop to delete it");				
			}
			
		} catch (InputMismatchException e) {              
			System.out.println("You must enter one number.\n");
			sc.next();
   	 
		}
		}while(iOption <1 || iOption >iCont);
		
		controller.getRepositoryShops().getAllShops().remove(iOption-1);

	}

	private static void viewShops() {
		
    	String allShops=controller.getAllShops();		
		System.out.println("Flowers Shops : " + allShops + " \n");
	}
	

	private static void createShop() {
		
		Scanner sc = new Scanner (System.in);

				
        String name,adress,phone,city;
		System.out.println("Enter  the name of the new Flower Shop.");
		name=sc.nextLine();
		System.out.println("Enter the Adress.");
		adress=sc.nextLine();
		System.out.println("Enter the Phone.");
		phone=sc.nextLine();
		System.out.println("Enter the City.");
		city=sc.nextLine();

		
		
		controller.createFlowerShop (name,adress,phone,city);
        

	}

}
