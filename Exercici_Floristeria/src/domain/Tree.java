package domain;

public class Tree extends AbsArticle{
	
	protected int height;

	public Tree( String name, String description, double pvp, int height) {
		super( name, description, pvp);
		this.height=height;
	}

	@Override
	public String toString() {
<<<<<<< HEAD:src/domain/Tree.java
		return "Tree [height=" + height + ", name=" + name + ", description=" + description + ", pvp="
=======
		return "Tree [height=" + height + ", id=" + id + ", name=" + name + ", description=" + description + ", pvp="
>>>>>>> a3e02df23df8b6bd79c59e9732e7c8edb3b8f23a:Exercici_Floristeria/src/domain/Tree.java
				+ pvp + "]";
	}

	
}
