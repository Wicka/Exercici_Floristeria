package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import application.FlowerShopController;
import domain.Flower_Shop;

public class Main {
	
	private static FlowerShopController controllerShop = new FlowerShopController();

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        boolean exit = false;
	        int opcion; 
	        
         	try {
			//	controllerShop.createFlowerShop("La FLoristeria 01", "Calle Flor 1", "123456787", "Barcelona");
			//	controllerShop.createFlowerShop("La FLoristeria 02", "Calle Flor 2", "123456788", "Madrid");
			//	controllerShop.createFlowerShop("La FLoristeria 03", "Calle Flor 3", "123456789", "Valencia");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		
	     
	        while (!exit) {
	        
<<<<<<< HEAD:src/view/Main.java
	        	Menu.welcome();;	 	   	
=======
	        	Menu.menuPrincipalShop();	 	   	
>>>>>>> a3e02df23df8b6bd79c59e9732e7c8edb3b8f23a:Exercici_Floristeria/src/view/Main.java
	        
	            try {
	 
	                System.out.println("Select one Option");
	                opcion = sc.nextInt();
	 
	                switch (opcion) {
	                
	                    case 1:
	                    	//CREATE NEW SHOP
	                    	
	                    	controllerShop.menuCreateFlowerShop();	                    
	                        break;
	                    
	                    case 2:
	                    	//MOSTRAR TIENDAS
	                    	controllerShop.menuViewShops();
	                    	break;
	                    
	                    case 3:
<<<<<<< HEAD:src/view/Main.java
	                    	//DELETE SHOP
	                    	controllerShop.menuDeleteShop();	                    	
	                    	break;	                    
	                    
=======
	                        System.out.println("Start Flower Shop \n");
	                        Menu.menuPrincipalArticle();
	                        break;
>>>>>>> a3e02df23df8b6bd79c59e9732e7c8edb3b8f23a:Exercici_Floristeria/src/view/Main.java
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
<<<<<<< HEAD:src/view/Main.java
=======
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
		
		try {
			controller.createFlowerShop (name, adress,phone,city);
		} catch (Exception e) {
				e.printStackTrace();
		}
        
		
	}

>>>>>>> a3e02df23df8b6bd79c59e9732e7c8edb3b8f23a:Exercici_Floristeria/src/view/Main.java
}
