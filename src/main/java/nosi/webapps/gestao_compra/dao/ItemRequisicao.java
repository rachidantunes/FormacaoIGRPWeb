package nosi.webapps.gestao_compra.dao;


import javax.persistence.*;
import nosi.base.ActiveRecord.BaseActiveRecord;

/**
* demo@nosi.cv
* 27-11-2019
*/

@Entity
@Table(name="tbl_item_requisicao")
public class ItemRequisicao extends BaseActiveRecord<ItemRequisicao>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private int quantidade;
	@ManyToOne
	@JoinColumn(name = "requisicao_id", insertable = false, updatable = false)
	private Requisicao requisicao;
	private Long requisicao_id;
	
	public ItemRequisicao() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Requisicao getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(Requisicao requisicao) {
		this.requisicao = requisicao;
	}

	public Long getRequisicao_id() {
		return requisicao_id;
	}

	public void setRequisicao_id(Long requisicao_id) {
		this.requisicao_id = requisicao_id;
	}
}