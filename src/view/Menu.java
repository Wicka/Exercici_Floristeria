package view;

public interface Menu {

	public static void menuFloristeria() {
		System.out.println("1. New Article.");
		System.out.println("2. View Stock.");
		System.out.println("3. Delete Article.");
		System.out.println("4. Exit. \n");		
	}

	public static void menuPrincipal() {
		System.out.println("1. New Flower Shop.");
		System.out.println("2. View Flower Shops.");
		System.out.println("3. Start Flower Shop.");
		System.out.println("4. Delete Flower Shop.");
		System.out.println("0. Exit. \n");
		
	}
	
	public static void welcome() {
		System.out.println("Welcome to the Flower Shop KEN");
		System.out.println("What do you want to do? : ");
		
	}
}
