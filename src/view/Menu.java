package view;

public interface Menu {

	public static void menuPrincipalArticle() {
		System.out.println("Article Menu, tell us what do you want to do?");
		System.out.println("1. New Article.");
		System.out.println("2. View Stock.");
		System.out.println("3. Update Article.");
		System.out.println("4. Delete Article.");
		System.out.println("5. Exit. \n");		
	}

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
	}
	
	
	
	
	public static void welcome() {
		System.out.println("Welcome to the Flower Shop Aplication of KEN");
		blankLine();
		System.out.println("What do you want to do? : ");
		System.out.println("1. Create, View, Update, Delete a Shop");
		System.out.println("2. Create, View, Update, Delete an Article");
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
}
