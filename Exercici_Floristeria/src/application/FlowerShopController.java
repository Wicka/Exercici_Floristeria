package application;





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
	
	private ArticleRepository repositoryArticles;
	private ShopRepository repositoryShops;

	
	public FlowerShopController() {
		this.repositoryArticles = new ArticleRepository();
		this.repositoryShops = new ShopRepository();		
	}
	

	public void createFlowerShop(String name, String adress, String phone, String city) throws Exception  {
		Flower_Shop flowershop = new Flower_Shop(name, adress, phone,city); 
		repositoryShops.addShop(flowershop);		
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
	
	
	
}
