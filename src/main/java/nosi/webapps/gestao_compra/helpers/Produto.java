package nosi.webapps.gestao_compra.helpers;

import java.util.Set;

import javax.persistence.*;

import nosi.base.ActiveRecord.BaseActiveRecord;

/**
 * cvt00957
 * Nov 14, 2019
 */

@Entity
@Table(name="tbl_produto")
public class Produto extends BaseActiveRecord<Produto> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String description;
	
	private String reference;
	
	private int id_user;

	@OneToMany(mappedBy = "produto")
	private Set<Compra> compras;
	
//	@ManyToMany(mappedBy = "produtos")
//	private Set<Loja> lojas;
	public Produto() {
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

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

//	public Set<Loja> getLojas() {
//		return lojas;
//	}
//
//	public void setLojas(Set<Loja> lojas) {
//		this.lojas = lojas;
//	}

	public Set<Compra> getCompras() {
		return compras;
	}

	public void setCompras(Set<Compra> compras) {
		this.compras = compras;
	}

	
	
	
}
