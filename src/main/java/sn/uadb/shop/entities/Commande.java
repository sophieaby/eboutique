package sn.uadb.shop.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Commande implements Serializable {
private int id;
private int code;
private Date createdAt; 
private int tel;
private List<LigneCommande> ligneCmd;

}
