package application;





import java.util.ArrayList;
import java.util.Scanner;

//--------------
import domain.AbsArticle;
import domain.Flower;
import domain.Flower.Colour;

import domain.Flower_Shop;
import domain.Ornato;
import domain.Ornato.Material;
import domain.Tree;
import persistence.ArticleRepository;
import persistence.ShopRepository;

public class FlowerShopController {
	
	//REPOSITORIOS DONDE GUARDAR ARRAY TIENDAS Y ARRAY ARTICULOS
	
	private ArticleRepository repositoryArticles;
	private ShopRepository repositoryShops;

	
	public FlowerShopController() {
		this.repositoryArticles = new ArticleRepository();
		this.repositoryShops = new ShopRepository();		
	}
	
	
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------METODOS TIENDA -------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	
	
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------CREACION TIENDA ---------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	
	
	
	public void menuCreateFlowerShop() throws Exception  {
	
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
			createFlowerShop( name,  adress,  phone,  city);
		} catch (Exception e) {
				e.printStackTrace();
		}
       
	}
		

	public void createFlowerShop(String name, String adress, String phone, String city) throws Exception  {
		Flower_Shop flowershop = new Flower_Shop(name, adress, phone,city); 
		repositoryShops.addShop(flowershop);		
	}

	
	
	
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------ELIMINAR TIENDA --------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------

	public void deleteShop() {
		
		// TODO Auto-generated method stub
	
		
	}


	public void menuDeleteShop() {
		
		int iCont =0;
		Scanner sc = new Scanner (System.in);
		int iOption=-1;
		
		for (Flower_Shop flowershop : getRepositoryShops().getAllShops()) {		
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
			
		} catch (Exception e) {              
			System.out.println("You must enter one number.\n");
			sc.next();
   	 
		}
		}while(iOption <1 || iOption >iCont);
		
		getRepositoryShops().getAllShops().remove(iOption-1);;
	}
	
	
	
	
	
	
	
	
	
	public  void menuViewShops() {
		
    	String allShops=getAllShops();		
		System.out.println("Flowers Shops : " + allShops + " \n");
	}
	
		
		
		

	public void createFlower (int id, String name, String description, double pvp, Colour colour) throws Exception {
		AbsArticle flower = new Flower (id, name, description, pvp, colour);
		repositoryArticles.addArticle(flower);
	}
	
	public void createTree (int id, String name, String description, double pvp, int height) throws Exception {
		AbsArticle tree = new Tree (id, name, description, pvp, height);
		repositoryArticles.addArticle(tree);
	}
	
	public void createOrnato (int id, String name, String description, double pvp, Material material) throws Exception {
		AbsArticle ornato = new Ornato (id, name, description, pvp, material);
		repositoryArticles.addArticle(ornato);
	}

	
	public ShopRepository getRepositoryShops() {
		return repositoryShops;
	}
	
	public String getAllShops() {
		
		String allShops="";
		for (Flower_Shop shop : repositoryShops.getAllShops()) {
			allShops= allShops +"\n"+ shop;
			}			
		return allShops ;
	}



	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------METODOS AUXILIARES ---------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	
	
	//-------------------------------------------------------------------------------------------------------------------------
	//------------------------------------- MOSTRAR REPOSITORIOS --------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	
	
	/*public Flower_Shop findShop(ShopRepository shops){
		Flower_Shop shop = null;
		
	}
	*/
	
}
