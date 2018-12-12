package sn.uadb.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.uadb.shop.entities.Article;
import sn.uadb.shop.entities.Categorie;
import sn.uadb.shop.repositories.ArticleRepository;
import sn.uadb.shop.repositories.CategoryRepository;

@SpringBootApplication
public class EboutiqueApplication implements CommandLineRunner {

		@Autowired //injection du class  CategoryRepository dans 
		private CategoryRepository categoryRepository;
		@Autowired
		private ArticleRepository articleRepository;
		
	public static void main(String[] args) {
		SpringApplication.run(EboutiqueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categorie c1= categoryRepository.save(new Categorie("ALIMENTAIRE"));
		Categorie c2= categoryRepository.save(new Categorie("ELECTROMENAGER"));
		Categorie c3= categoryRepository.save(new Categorie("BEAUTE"));
		Categorie c4= categoryRepository.save(new Categorie("HIHAB"));
		Categorie c5= categoryRepository.save(new Categorie("HABILLEMENT"));
		Categorie c6= categoryRepository.save(new Categorie("INFORMATIQUE"));
		Categorie c7= categoryRepository.save(new Categorie("BIEN-ETRE"));
		Categorie c8= categoryRepository.save(new Categorie("SOIN-CORPS"));
		
		Article a1= new Article("lait","1litre",1,1000,"img");
		Article a2= new Article("JUS","Concentre",5,1000,"img");
		Article a3= new Article("chips","1litre",10,200,"img");
		Article a4= new Article("Patte","1litre",50,300,"img");
		Article a5= new Article("ROBE","femme",1,3000,"img");
		Article a6= new Article("ORDINATEUR","HP",1,150000,"img");
		Article a7= new Article("CREME-MAIN","NATUREL",2,9000,"img");
		Article a8= new Article("FAIRE-WHITE","TIENT-CLAIRE",2,15000,"img");
		
		a1.setCategori(c1);
		a2.setCategori(c2);
		a3.setCategori(c3);
		a4.setCategori(c4);
		a5.setCategori(c5);
		a6.setCategori(c6);
		a7.setCategori(c7);
		a8.setCategori(c8);
		
		articleRepository.save(a1);
		articleRepository.save(a2);
		articleRepository.save(a3);
		articleRepository.save(a4);
		articleRepository.save(a5);
		articleRepository.save(a6);
		articleRepository.save(a7);
		articleRepository.save(a8);
		
		

		
		
		
		
		
	}
}
