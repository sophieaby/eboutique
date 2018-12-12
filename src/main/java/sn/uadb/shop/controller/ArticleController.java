package sn.uadb.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sn.uadb.shop.entities.Article;
import sn.uadb.shop.exception.ArticleException;
import sn.uadb.shop.repositories.ArticleRepository;

@RestController
@CrossOrigin(origins = "*") 
@RequestMapping("/api")
public class ArticleController {
	@Autowired
	private ArticleRepository articleReposytory;
	
	//affichage de la liste des articles
	//@RequestMapping(method= RequestMethod.GET, value ="/articles")
	@GetMapping("/articles")
	public List<Article> getAllAriticle() throws ArticleException{
		return articleReposytory.findAll();
	}
	//insertion dans la base de donnée
	@PostMapping("/article")//racourcis RequestMapping
	public Article saveArticle(@RequestBody Article article) throws ArticleException{
		return articleReposytory.save(article);

	}
	//Recherche dans la base de donnée
	 @GetMapping("/article/{id}")
	public Article findById(@PathVariable(value="id") int id) throws  ArticleException{
		
		return articleReposytory.findById(id).orElseThrow(
				()->new  ArticleException()
				);
	}
	  
	  //suppression dans la base
	  @DeleteMapping("/delarticle/{id}")
	  public void delete(@PathVariable (value= "id")int id) throws Exception{
		  Article a= articleReposytory.findById(id).orElseThrow(
				  ()->new Exception("Cet article n est pas supprimer"));
		  articleReposytory.deleteById(id);
	  
	  }
	  
	  //modifier dans la base
	  @PostMapping("/updateArticle")
	  public Boolean updateArticle(@RequestBody Article article) throws ArticleException {
		  Boolean exist= articleReposytory.existsById(article.getId());
		  if (exist){
			  Article a = articleReposytory.findById(article.getId()).orElseThrow(
					  ()->new ArticleException());
			  a.setCategori(article.getCategori());
			  a.setDescription(article.getDescription());
			  a.setImage(article.getImage());
			  a.setPrix(article.getPrix());
			  a.setQuantity(article.getQuantity());
			  a.setImage(article.getImage());
			  articleReposytory.save(a);
		  }
	    return exist;
	      
	  
	  }
	  
	 
}
