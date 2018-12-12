package sn.uadb.shop.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
@Entity
public class Article  implements Serializable {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String title;
	private String description;
	private int quantity;
	private int prix;
	@Lob //un grand nombre de chaine
	private String image;
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private  Categorie  categori;
	
	public Article() {
		super();
	}
	public Article(String title, String description, int quantity, int prix, String image) {
		super();
		this.title = title;
		this.description = description;
		this.quantity = quantity;
		this.prix = prix;
		this.image = image;
	}
	
	public Article(int id ){
		
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Categorie getCategori() {
		return categori;
	}
	public void setCategori(Categorie categori) {
		this.categori = categori;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	 


 
}
