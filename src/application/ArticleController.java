package application;

import java.util.ArrayList;
import java.util.Scanner;

//--------------
import domain.AbsArticle;
import domain.Flower;
import domain.Flower.Colour;

import domain.Flower_Shop;
import domain.Ornato;
import domain.Ornato.Material;
import domain.Tree;
import persistence.ArticleRepository;
import persistence.ShopRepository;
import view.Menu;

public class ArticleController {
	
	private ArticleRepository repositoryArticles;
	
	
	 public ArticleController() {
		this.repositoryArticles = new ArticleRepository();
		}
	
	
	
		
		//-------------------------------------------------------------------------------------------------------------------------
		//-------------------------------------CREACION ARTICULO ---------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------------------
		
		
	
		public void menuCreateArticle()  {
			
			Scanner sc = new Scanner (System.in);
			
	        String name, description;
	        double pvp;
	        int iColour=-1, iType=-1, iMaterial;
	        Colour colour;
	        int height=-1;	        
	        Material material;
	        
	        try {
	        	
		       // ELIGE QUE TIPO ARTICULO
	        	System.out.println("ELIGE TIPO ARTICULO");
	        	Menu.categorysForArticles();
	        	
	        	iType=sc.nextInt();
				
	        	//PARAMETROS COMUNES A TODOS LOS ARTICULOS
				
				System.out.println("Enter name. \n");
				name=sc.next();
				
				System.out.println("Enter description. \n");
				description=sc.next();
				
				System.out.println("Enter PVP. \n");
				pvp=sc.nextInt();
				
				
				//PARAMETROS ESPECIFICO DE TIPO ARTICULO
				
				switch (iType) {
				
					case 1:		
						//QUEREMOS UN FLOR
						System.out.println("Enter Colour");
						
						System.out.println("1. " + Colour.Blue);
						System.out.println("2. " + Colour.Green);
						System.out.println("3. " + Colour.Pink);
						System.out.println("4. " + Colour.Red);
						System.out.println("5. " + Colour.white);
						System.out.println("6. " + Colour.Yellow);
						
						iColour=sc.nextInt();
					
						switch (iColour) {
							case 1:
								colour=Colour.Blue;
							break;
							case 2:			
								colour=Colour.Green;					
							break;
							case 3:					
								colour=Colour.Pink;					
							break;
							case 4:					
								colour=Colour.Red;					
							break;
							case 5:					
								colour=Colour.white;					
							break;
							case 6:					
								colour=Colour.Yellow;					
							break;
	
							default:
								colour=Colour.white;					
							break;
						}
						
						createFlower( name,  description,  pvp,  colour);
						
					break;
				
					case 2:		
						
						//QUEREMOS UN ARBOL
						System.out.println("Enter Heigth");						
						height=sc.nextInt();								
						createTree ( name, description, pvp, height);
					
					break;
					
					case 3:		
					
						//QUEREMOS DECORACION
						System.out.println("Enter Material");
						System.out.println("1. " + Material.Wood);
						System.out.println("2. " + Material.Wood);
						iMaterial=sc.nextInt();
						
						switch (iMaterial) {
						
							case 1:	
								material=Material.Wood;
							break;
							case 2:
								material=Material.Plastic;
							break;
							default:
								material=Material.Plastic;								
							break;
						}
						
						createOrnato ( name, description, pvp, material);
					break;
					
					default:
						System.out.println("NO HAN PUESTO NINGUN TIPO ERROR A TRATAR");
					break;
					}
						
				
			} catch (Exception e) {
					e.printStackTrace();
			}
	       
		}
		

	public void createFlower (String name, String description, double pvp, Colour colour) throws Exception {
		AbsArticle flower = new Flower (name, description, pvp, colour);
		repositoryArticles.addArticle(flower);
	}
	
	public void createTree ( String name, String description, double pvp, int height) throws Exception {
		AbsArticle tree = new Tree (name, description, pvp, height);
		repositoryArticles.addArticle(tree);
	}
	
	public void createOrnato ( String name, String description, double pvp, Material material) throws Exception {
		AbsArticle ornato = new Ornato (name, description, pvp, material);
		repositoryArticles.addArticle(ornato);
	}




	public void menuSeeArticle() {
		Menu.showArticles();
			
	}




	public void menuDeleteArticle() {
		Menu.deleteArticle();
		
	}

	
	
	
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------VER ARTICULOS ---------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
	
	
	//-------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------BORRAR ARTICULOS ---------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
		
	
	
	
	
	

	
	
}
