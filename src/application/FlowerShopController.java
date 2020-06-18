package application;




//--------------

import domain.Flower_Shop;
import persistence.ArticleRepository;
import persistence.ShopRepository;

public class FlowerShopController {
	
	private ArticleRepository repositoryA;
	private ShopRepository repositoryF;

	
	public FlowerShopController() {
		this.repositoryA = new ArticleRepository();
		this.repositoryF = new ShopRepository();		
	}
	

	public void createFlowerShop(String name, String adress, String phone, String city)  {
		Flower_Shop flowershop = new Flower_Shop(name, adress, phone,city); 
		repositoryF.addShops(flowershop);		
	}


	public ShopRepository getRepositoryShops() {
		return repositoryF;
	}
	
	public String getAllShops() {
		
		String allShops="";
		for (Flower_Shop shop : repositoryF.getAllShops()) {
			allShops= allShops +"\n"+ shop;
			}			
		return allShops ;
	}
	
	
	
}
