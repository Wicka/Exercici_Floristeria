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

	public Flower(int id, String name, String description, double pvp, Colour white) {
		super(id, name, description, pvp);
		this.colour=white;
	}


	@Override
	public String toString() {
		return "Flower [colour=" + colour + ", id=" + id + ", name=" + name + ", description=" + description + ", pvp="
				+ pvp + "]";
	}

}
