package nosi.webapps.gestao_compra.helpers;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import nosi.base.ActiveRecord.BaseActiveRecord;

/**
 * cvt00957
 * Nov 14, 2019
 */

@Entity
@Table(name="tbl_compra")
public class Compra extends BaseActiveRecord<Compra>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private double quantity;
	
	private double price;
	
	private Date data_compra;
	
	private Date data_criacao;
	
	@ManyToOne
	@JoinColumn(name = "produto_id", insertable = false, updatable = false)
	private Produto produto;
	private Integer produto_id;
	
	@ManyToOne
	@JoinColumn(name = "loja_id", insertable = false, updatable = false)
	private Loja loja;
	private Integer loja_id;

	public Compra() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getData_compra() {
		return data_compra;
	}

	public void setData_compra(Date data_compra) {
		this.data_compra = data_compra;
	}

	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public Integer getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(Integer produto_id) {
		this.produto_id = produto_id;
	}

	public Integer getLoja_id() {
		return loja_id;
	}

	public void setLoja_id(Integer loja_id) {
		this.loja_id = loja_id;
	}
	
}
