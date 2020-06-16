package domain;

public class Tree extends AbsArticle{
	
	protected int height;

	public Tree(int id, String name, String description, double pvp, int height) {
		super(id, name, description, pvp);
		this.height=height;
	}

	
}
