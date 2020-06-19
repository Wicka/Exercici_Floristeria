package domain;

public class Ornato extends AbsArticle{
	


public static enum Material {
		  Plastic,
		  Wood
		}
	Material mat;


	public Ornato(int id, String name, String description, double pvp,  Material mat) {
		super(id, name, description, pvp);
		this.mat=mat.Wood;
		
	}
	@Override
	public String toString() {
		return "Ornato [mat=" + mat + ", id=" + id + ", name=" + name + ", description=" + description + ", pvp=" + pvp
				+ "]";
	}

}
