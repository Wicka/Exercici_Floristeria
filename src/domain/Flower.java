package domain;


public class Flower extends AbsArticle{

	public static enum Colour {
		  Blue,
		  Red,
		  Green,
		  Yellow,
		  Pink,
		  white
		}
	Colour colour;

	public Flower( String name, String description, double pvp, Colour colour) {
		super(name, description, pvp);
		this.colour=colour.white;
	}


	@Override
	public String toString() {
		return "Flower [colour=" + colour +  ", name=" + name + ", description=" + description + ", pvp="
				+ pvp + "]";
	}

}
