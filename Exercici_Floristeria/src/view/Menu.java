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

	public static void oneShopMenu() {
		blankLine();
		System.out.println("What do you want to do? : ");
		System.out.println("1. New Article");
		System.out.println("2. See Articles");
		System.out.println("3. Delete Article");
		System.out.println("4. Exit");
		blankLine();

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
		System.out.println("SELECCIONA TIENDA");
		
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
