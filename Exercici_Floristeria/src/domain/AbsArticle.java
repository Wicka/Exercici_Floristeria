package domain;

public abstract class AbsArticle {
	protected String name;
	protected String description;
	protected double pvp;
<<<<<<< HEAD:src/domain/AbsArticle.java

	public AbsArticle(String name, String description, double pvp) {

=======
	
	public AbsArticle(int id, String name, String description, double pvp) {
	
		this.id = id;
>>>>>>> a3e02df23df8b6bd79c59e9732e7c8edb3b8f23a:Exercici_Floristeria/src/domain/AbsArticle.java
		this.name = name;
		this.description = description;
		this.pvp = pvp;
	}

	public String getName() {
		return name;
	}

}
