package nosi.webapps.gestao_compra.helpers;

import java.util.Set;

import javax.persistence.*;

import nosi.base.ActiveRecord.BaseActiveRecord;

/**
 * cvt00957
 * Nov 14, 2019
 */
@Entity
@Table(name="tbl_loja")
public class Loja extends BaseActiveRecord<Loja>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String description;
	
	private String location;
	
	private int id_user;
	
	@OneToMany(mappedBy = "loja")
	private Set<Compra> compras;
	
	
//	@ManyToMany
//	@JoinTable(
//	        name = "tbl_compra", 
//	        joinColumns = { @JoinColumn(name = "loja_id") }, 
//	        inverseJoinColumns = { @JoinColumn(name = "produto_id") }
//	    )
//	private Set<Produto> produtos;
	
	public Loja() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

//	public Set<Produto> getProdutos() {
//		return produtos;
//	}
//
//	public void setProdutos(Set<Produto> produtos) {
//		this.produtos = produtos;
//	}

	public Set<Compra> getCompras() {
		return compras;
	}

	public void setCompras(Set<Compra> compras) {
		this.compras = compras;
	}

	
	
}
