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
import view.Menu;

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
	//-------------------------------------VISUALIZAR TIENDA --------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------

	
	public  void menuViewShops() {
		
    	String allShops=getAllShops();		
		System.out.println("Flowers Shops : " + allShops + " \n");
		
		//SELECCIONAR TIENDA
		
		Menu.selectShop();
		
		Menu.oneShopMenu();
		
	}
	
		
	
	
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------ELIMINAR TIENDA --------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------

	


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
		
		iOption=iOption-1;
		deleteShop( iOption);		
	
	}
	
	
		public void deleteShop(int position) {
		
		System.out.println(getRepositoryShops().getAllShops().get(position));
		
		getRepositoryShops().getAllShops().remove(position-1);
		
		System.out.println(getRepositoryShops().getAllShops().get(position));	
	
		
	}
	
	
		//-------------------------------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------------------
		//---------------------------------------------METODOS ARTICULOS -------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------------------
		
		
		//-------------------------------------------------------------------------------------------------------------------------
		//-------------------------------------CREACION ARTICULO ---------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------------------
		
		
	
		public void menuCreateArticle() throws Exception  {
			
			Scanner sc = new Scanner (System.in);
			
	        String name, description;
	        double pvp;
	        int iColour=-1, iType=-1, iMaterial;
	        Colour colour;
	        int height=-1;	        
	        Material material;
	        
	        try {
		        System.out.println("Enter What type of articles. (1. Flor, 2. Arbol, 3. Decoracion )\n");			
		        iType=sc.nextInt();
				
				
				System.out.println("Enter name. \n");
				name=sc.next();
				
				System.out.println("Enter description. \n");
				description=sc.next();
				
				System.out.println("Enter PVP. \n");
				pvp=sc.nextInt();
				
				
				switch (iType) {
					case 1:		
						//QUEREMOS UN FLOR
						System.out.println("Enter Colour");
						System.out.println("1. " + Colour.Blue);
						System.out.println("2. " + Colour.Green);
						System.out.println("3. " + Colour.Pink);
						System.out.println("4. " + Colour.Red);
						System.out.println("5. " + Colour.white);
						System.out.println("6. " + Colour.Yellow);
						
						iColour=sc.nextInt();
					
						switch (iColour) {
						case 1:
							colour=Colour.Blue;
						break;
						case 2:			
							colour=Colour.Green;					
						break;
						case 3:					
							colour=Colour.Pink;					
						break;
						case 4:					
							colour=Colour.Red;					
						break;
						case 5:					
							colour=Colour.white;					
						break;
						case 6:					
							colour=Colour.Yellow;					
						break;

						default:
							colour=Colour.white;					
						break;
						}
						
						createFlower( name,  description,  pvp,  colour);
						
					break;
					case 2:		
						//QUEREMOS UN ARBOL
						System.out.println("Enter Heigth");						
						height=sc.nextInt();								
						createTree ( name, description, pvp, height);
					break;
					case 3:		
						//QUEREMOS DECORACION
						System.out.println("Enter Material");
						System.out.println("1. " + Material.Wood);
						System.out.println("2. " + Material.Wood);
						iMaterial=sc.nextInt();
						
						switch (iMaterial) {
						
							case 1:	
								material=Material.Wood;
							break;
							case 2:
								material=Material.Plastic;
							break;
							default:
								material=Material.Plastic;								
							break;
						}
						createOrnato ( name, description, pvp, material);
					break;
					default:
						System.out.println("NO HAN PUESTO NINGUN TIPO ERROR");
					break;
					}
						
				
			} catch (Exception e) {
					e.printStackTrace();
			}
	       
		}
		

	public void createFlower (String name, String description, double pvp, Colour colour) throws Exception {
		AbsArticle flower = new Flower (name, description, pvp, colour);
		repositoryArticles.addArticle(flower);
	}
	
	public void createTree ( String name, String description, double pvp, int height) throws Exception {
		AbsArticle tree = new Tree (name, description, pvp, height);
		repositoryArticles.addArticle(tree);
	}
	
	public void createOrnato ( String name, String description, double pvp, Material material) throws Exception {
		AbsArticle ornato = new Ornato (name, description, pvp, material);
		repositoryArticles.addArticle(ornato);
	}

	
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------VER ARTICULOS ---------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	

	
	
	
	
	

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
	
	

	public ShopRepository getRepositoryShops() {
		return repositoryShops;
	}
	
	
	//-------------------------------------------------------------------------------------------------------------------------
	//------------------------------------- RECUPERAR ARRAYLIST TIENDAS EN STRING --------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------

	public String getAllShops() {
		
		String allShops="";
		for (Flower_Shop shop : repositoryShops.getAllShops()) {
			allShops= allShops +"\n"+ shop;
			}			
		return allShops ;
	}

	
	
	//-------------------------------------------------------------------------------------------------------------------------
	//------------------------------------- MOSTRAR REPOSITORIOS --------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	
	
	public int findShop(){
		int position=-1;
		for (Flower_Shop shop : ShopRepository.getShops()) {
			
		}
		Flower_Shop shop = null;
		return position;		
	}
	
	
}
