package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.AbsArticle;

public class ArticleRepository {

	private static List<AbsArticle> articles;

	public ArticleRepository() {
		this.articles = new ArrayList<>();
	}

	public List<AbsArticle> getArticles() {
		return new ArrayList<>(articles);
	}

<<<<<<< HEAD:src/persistence/ArticleRepository.java
	public void addArticle(AbsArticle article) throws Exception {
		if (article == null)
			throw new Exception();
=======
	public void addArticle(AbsArticle article) throws Exception{
		if(article==null) throw new Exception();
>>>>>>> a3e02df23df8b6bd79c59e9732e7c8edb3b8f23a:Exercici_Floristeria/src/persistence/ArticleRepository.java
		articles.add(article);
	}

	public void deleteArticle(int position) {
		articles.remove(position);
	}

}
