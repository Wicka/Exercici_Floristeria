package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.AbsArticle;
import domain.Flower_Shop;

public class ShopRepository {
	
	private static List<Flower_Shop> shops;
	
	public ShopRepository() {
		this.shops= new ArrayList<>();
	}

	public List<Flower_Shop> getAllShops() {
		return new ArrayList<>(shops);
	}

	public void addShop(Flower_Shop shop) throws Exception {
		if(shop==null) throw new Exception();
		shops.add(shop);
	}

	
}
