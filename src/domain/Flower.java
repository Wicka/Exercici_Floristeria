package domain;

public class Flower extends AbsArticle{
	
	protected String colour;

	public Flower(int id, String name, String description, double pvp, String colour) {
		super(id, name, description, pvp);
		this.colour=colour;
	}

}
