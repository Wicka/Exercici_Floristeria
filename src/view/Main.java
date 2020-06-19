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
	        
	        	Menu.welcome();;	 	   	
	        
	            try {
	 
	                System.out.println("Select one Option");
	                opcion = sc.nextInt();
	 
	                switch (opcion) {
	                
	                    case 1:
	                    	//CREATE NEW SHOP
	                    	controller.menuCreateFlowerShop();	                    	
	                    break;
	                    
	                    case 2:
	                    	//MOSTRAR TIENDAS
	                        controller.menuViewShops();
	                    break;
	                    
	                    case 3:
	                    	//DELETE SHOP
	                    	controller.menuDeleteShop();	                    	
	                    break;	                    
	                    
	                    case 4:
	                    	System.out.println("I want to Exit the program. Bye, bye");	            	        
	                    	exit = true;
	                    break;
	                   
	                    default:
	                        System.out.println("You must enter a number between (1,2,3,4) \n");
	                }
	                
	            } catch (Exception e) {
	            	
	                System.out.println("You must enter a number \n");
	                sc.next();
	                
	            }finally{
					//System.out.println("Continue");						
				}
					
	        }
		}
}
