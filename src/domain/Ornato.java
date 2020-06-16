package domain;

public class Ornato extends AbsArticle{
	
	protected enum material {
		  Plastic,
		  Wood
		}
	material mat;


	public Ornato(int id, String name, String description, double pvp, String material, material mat) {
		super(id, name, description, pvp);
		this.mat=mat.Plastic;
		
	}

}
