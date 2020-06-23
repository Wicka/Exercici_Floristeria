package application;

import java.util.Scanner;

import domain.Flower_Shop;
import persistence.ShopRepository;
import view.Menu;

public class FlowerShopController {

	private ShopRepository repositoryShops;

	private ArticleController controllerArticle;

	public FlowerShopController() {
		this.repositoryShops = new ShopRepository();
		this.controllerArticle = new ArticleController();
	}

	// -------------------------------------------------------------------------------------------------------------------------
	// -------------------------------------CREACION TIENDA
	// ---------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------------------------

	public void menuCreateFlowerShop() {

		Scanner sc = new Scanner(System.in);

		String name, adress, city, phone;
		
		System.out.println("Enter Name new Flower Shop. \n");
		name = sc.nextLine();
		System.out.println("Enter Adress. \n");
		adress = sc.nextLine();
		System.out.println("Enter Phone. \n");
		phone = sc.nextLine();
		System.out.println("Enter City. \n");
		city = sc.nextLine();

		try {

			createFlowerShop(name, adress, phone, city);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void createFlowerShop(String name, String adress, String phone, String city) throws Exception {
		Flower_Shop flowershop = new Flower_Shop(name, adress, phone, city);
		repositoryShops.addShop(flowershop);
		System.out.println("This Shop has been successfully created:\n" + flowershop.toString());
	}

	// -------------------------------------------------------------------------------------------------------------------------
	// -------------------------------------VISUALIZAR TIENDA
	// --------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------------------------

	public void menuViewShops() {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int iOption = -1;

		int iCont = repositoryShops.getAllShops().size();

		// MUESTRO TIENDAS
		// FIN MOSTRAR TIENDAS
		// ELIJA TIENDA
		if (iCont == 0) {
			System.out.println("There are no shops yet in the shops network\nSelect 1. to create a shop");
		} else {
			do {
				Menu.showsShop(repositoryShops);
				try {

					iOption = sc.nextInt();
					// FALTA TRATAR QUE SE ENTRE CORRECTAMENTE
					// PUES CON ESTE SI ENTRA LETRA SE VA AL TRY CATH INICIAL

				} catch (Exception e) {

					iOption = sc.nextInt();
				}
		
				System.out.println(
						"YOUR SELECTION IS:  " + repositoryShops.getAllShops().get(iOption - 1).getName() +"\n");
			} while (iOption < 1 || iOption > iCont);

			// FIN ELIJO TIENDA

			iOption = -1;

			// ENTRO EN MENU ARTICULOS

			// DEPENDIENDO QUE ELIJA SE ENVIA MENU
			// NUEVO ARTICULO
			// VER ARTICULO
			// BORRAR ARTICUL
			// VOLVER MENU ANTERIOR

			while (!exit) {

				Menu.oneShopMenu();

				System.out.println("Select one Option");
				iOption = sc.nextInt();

				try {
					switch (iOption) {

					case 1:
						// CREATE NEW ARTICLE
						controllerArticle.menuCreateArticle();
						break;

					case 2:
						// MOSTRAR ARTICULOS
						controllerArticle.menuSeeArticle();
						break;

					case 3:
						// DELETE ARTICULOS
						controllerArticle.menuDeleteArticle();
						break;

					case 4:
						System.out.println("Go back to Previous Menu");
						exit = true;
						break;

					default:
						System.out.println("You must enter a number between (1,2,3,4) \n");
					}

				} catch (Exception e) {
					System.out.println("Select one Option");
					iOption = sc.nextInt();
				}

			}
		}

	}

	// -------------------------------------------------------------------------------------------------------------------------
	// -------------------------------------ELIMINAR TIENDA
	// --------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------------------------

	public void menuDeleteShop() {

		int iCont = 0;
		Scanner sc = new Scanner(System.in);
		int iOption = -1;

		for (Flower_Shop flowershop : getRepositoryShops().getAllShops()) {
			iCont++;
			System.out.println(iCont + ". " + flowershop.getName() + "\n");
		}
		if (ShopRepository.getShops().isEmpty()) {
			System.out.println("There are no shops yet in the shops network\nSelect 1. to create a shop");
		} else {
			do {
				try {
					System.out.println("Select the Shop to Delete");
					iOption = sc.nextInt();

					if (iOption < 1 || iOption > iCont) {
						System.out.println("You must choice one Shop to delete it");
					}

				} catch (Exception e) {
					System.out.println("You must enter one number.\n");// a number?
					sc.next();// ?

				}
			} while (iOption < 1 || iOption > iCont);

			iOption = iOption - 1;
			deleteShop(iOption);
		}
	}

	public void deleteShop(int position) {

		repositoryShops.deleteShop(position);

		System.out.println(
				"This Shop was successfully deleted. Those are the actual shops in the network:\n" + getAllShops());
	}
	// -------------------------------------------------------------------------------------------------------------------------
	// ------------------------------------- MOSTRAR REPOSITORIOS
	// --------------------------------------------------------------
	// ------------------------------------------------A
	// COMPLETAR--------------------------------------------------------

	public int findShop() {
		int position = -1;
		for (Flower_Shop shop : ShopRepository.getShops()) {

		}
		Flower_Shop shop = null;
		return position;
	}

	// -------------------------------------------------------------------------------------------------------------
	// ------------------------------------- GETTERS
	// --------------------------------------------------------------

	public ShopRepository getRepositoryShops() {
		return repositoryShops;
	}

	public ArticleController getControllerArticle() {
		return controllerArticle;
	}

	// -------------------------------------------------------------------------------------------------------------------------
	// ------------------------------------- RECUPERAR ARRAYLIST TIENDAS EN STRING
	// --------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------------------------

	public String getAllShops() {

		String allShops = "";
		for (Flower_Shop shop : repositoryShops.getAllShops()) {
			allShops = allShops + "\n" + shop;
		}
		return allShops;
	}

}
