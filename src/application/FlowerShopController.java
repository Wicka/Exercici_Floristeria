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
	
	private ShopRepository repositoryShops;
	
	private ArticleController controllerArticle;

	
	public FlowerShopController() {
			this.repositoryShops = new ShopRepository();		
			this.controllerArticle = new ArticleController();
	}
	
	
	
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
		Scanner sc =new Scanner (System.in);
		
		int iOption=-1;
		
		int iCont=repositoryShops.getAllShops().size();
		
  		//MUESTRO TIENDAS
		Menu.showsShop(repositoryShops);			
		// FIN MOSTRAR TIENDAS 
		
		//ELIJA TIENDA
		
 
        do {
        	
        	try {

    			iOption=sc.nextInt();
    			
    			//FALTA TRATAR QUE SE ENTRE CORRECTAMENTE
    			//PUES CON ESTE SI ENTRA LETRA SE VA AL TRY CATH INICIAL
    				
    		} catch (Exception e) {

    			iOption=sc.nextInt();
    		}
        	
        }while (iOption <1 || iOption >iCont);
		
		
		//FIN ELIJO TIENDA
	
        System.out.println("SELECCIONO LA TIENDA " + repositoryShops.getAllShops().get(iOption-1).getName());
		
		Menu.oneShopMenu();
		
		//DEPENDIENDO QUE ELIJA SE ENVIA MENU
		//NUEVO ARTICULO
		//VER ARTICULO
		//BORRAR ARTICUL
		//VOLVER MENU ANTERIOR
		
		//DESDE AQUI LLAMAR AL CONTROLLER ARTICULO
    	
      	controllerArticle.menuCreateArticle();
      	controllerArticle.menuSeeArticle();
      	controllerArticle.menuDeleteArticle();
		
     	
		
	
	      		
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
		
	}
	
	

	
	//-------------------------------------------------------------------------------------------------------------------------
	//------------------------------------- MOSTRAR REPOSITORIOS --------------------------------------------------------------
	//------------------------------------------------A COMPLETAR--------------------------------------------------------
	
	
	public int findShop(){
		int position=-1;
		for (Flower_Shop shop : ShopRepository.getShops()) {
			
		}
		Flower_Shop shop = null;
		return position;		
	}
	
	
	
	//-------------------------------------------------------------------------------------------------------------
	//------------------------------------- GETTERS  --------------------------------------------------------------

	
	public ShopRepository getRepositoryShops() {
		return repositoryShops;
	}
	
	public ArticleController getControllerArticle() {
		return controllerArticle;
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
	
}
