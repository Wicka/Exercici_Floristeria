 package domain;

public abstract class AbsArticle {
	protected int id;
	protected String name;
	protected String description;
	protected double pvp;
	
	public AbsArticle(int id, String name, String description, double pvp) {
	
		this.id = id;
		this.name = name;
		this.description = description;
		this.pvp = pvp;
	}
	
	

}
