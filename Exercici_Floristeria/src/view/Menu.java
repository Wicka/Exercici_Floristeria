package view;

import domain.Flower_Shop;
import persistence.ShopRepository;

public class Menu {

	public static void categorysForArticles() {
		
		blankLine();
		System.out.println("1. Flower");
		System.out.println("2. Tree");
		System.out.println("3. Decoration");
		System.out.println("4. Delete Article.");
		blankLine();
		
	}

<<<<<<< HEAD:src/view/Menu.java
	public static void oneShopMenu() {
		blankLine();
		System.out.println("What do you want to do? : ");
		System.out.println("1. New Article");
		System.out.println("2. See Articles");
		System.out.println("3. Delete Article");
		System.out.println("4. Exit");
		blankLine();

=======
	public static void menuPrincipalShop() {
		System.out.println("Shop Menu, tell us what do you want to do?");
		System.out.println("1. New Flower Shop.");
		System.out.println("2. View Flower Shop.");
		//System.out.println("3. Start Flower Shop.");
		System.out.println("3. Update information of one Flower Shop");
		System.out.println("4. Delete Flower Shop.");
		System.out.println("0. Exit. \n");
		
		doubleLine();
		
		
		
		/*
		switch(option) {
	        case 1:
	            System.out.println("New Flower Shop \n");
	            //createShop();
	            System.out.println("New Flower Shop has been created");
	            break;
	        case 2:
	            System.out.println("View Flower Shop \n");
	            //viewShops();
	            break;
	        case 3:
	            System.out.println("Update Flower Shop \n");
	            //Menu.menuFloristeria();
	            break;
	        case 4:
	            System.out.println("Update Flower Shop \n");
	            //deleteShop();
	            break;	              
	        case 0:
	        	System.out.println("I want to Exit the program. Bye, bye");
	        	exit = true;
	            break;
	        default:
	            System.out.println("You must enter a number between (0,1,2,3,4) \n");
		}*/
>>>>>>> a3e02df23df8b6bd79c59e9732e7c8edb3b8f23a:Exercici_Floristeria/src/view/Menu.java
	}
	
	
	
	
	public static void welcome() {
		System.out.println("Welcome to the Flower Shop Aplication of KEN");
		blankLine();
		System.out.println("What do you want to do? : ");
		System.out.println("1. New Shop");
		System.out.println("2. See Shop");
		System.out.println("3. Delete Shop");
		System.out.println("4. Exit");
		blankLine();
		line();
	}
	
	
		

	public static void blankLine() {
		System.out.println("                                                                                                                         ");
	}
	
	public static void line() {
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}
	
	public static void doubleLine() {
		System.out.println("_________________________________________________________________________________________________________________________");
		System.out.println("_________________________________________________________________________________________________________________________");
	}

	
	
	
	public static void showsShop(ShopRepository repositoryShops) {
		int iCont=0;
		System.out.println("Slect your Shop");
		
		for (Flower_Shop shop : repositoryShops.getAllShops()) {
			iCont=iCont+1;
			System.out.println(iCont+ ". " + shop.getName());
		}
		
	}

	public static void showArticles() {
	
		
	}

	public static void deleteArticle() {
	
		
	}
}
