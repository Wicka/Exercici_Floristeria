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
	        	Menu.menuPrincipal();	 	   	
	        
	            try {
	 
	                System.out.println("Select one Option");
	                opcion = sc.nextInt();
	 
	                switch (opcion) {
	                    case 1:
	                        System.out.println("New Flower Shop \n");
	                        createShop();
	                        System.out.println("New Flower Shop has been created");
	                        break;
	                    case 2:
	                        System.out.println("View Flower Shop \n");
	                        viewShops();
	                        break;
	                    case 3:
	                        System.out.println("Start Flower Shop \n");
	                        Menu.menuFloristeria();
	                        break;
	                    case 4:
	                        System.out.println("Delete Flower Shop \n");
	                        deleteShop();
	                        break;	              
	                    case 0:
	                    	System.out.println("I want to Exit the program. Bye, bye");
	                    	exit = true;
	                        break;
	                    default:
	                        System.out.println("You must enter a number between (0,1,2,3,4) \n");
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
				System.out.println("You must choice one Shop to delete it");				
			}
			
		} catch (InputMismatchException e) {              
			System.out.println("You must enter one number.\n");
			sc.next();
   	 
		}
		}while(iOption <1 || iOption >iCont);
		
		controller.getRepositoryShops().getAllShops().remove(iOption-1);;
	}

	private static void viewShops() {
		
    	String allShops=controller.getAllShops();		
		System.out.println("Flowers Shops : " + allShops + " \n");
	}
	

	private static void createShop() {
		
		Scanner sc = new Scanner (System.in);
		
        String name, adress,phone,city;
		System.out.println("Enter Name new Flower Shop. \n");
		name=sc.next();
		System.out.println("Enter Adress. \n");
		adress=sc.next();
		System.out.println("Enter Phone. \n");
		phone=sc.next();
		System.out.println("Enter City. \n");
		city=sc.next();
		
		controller.createFlowerShop (name, adress,phone,city);
        
		
	}

}
