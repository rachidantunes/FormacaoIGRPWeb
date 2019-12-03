package nosi.webapps.gestao_compra.dao;

import java.sql.Date;
import java.util.List;
import javax.persistence.*;
import nosi.base.ActiveRecord.BaseActiveRecord;

/**
* demo@nosi.cv
* 27-11-2019
*/

@Entity
@Table(name="tbl_requisicao")
public class Requisicao extends BaseActiveRecord<Requisicao>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String justificacao;
	private Date data_requisicao;
	private String estado;
	
	@OneToMany(mappedBy = "requisicao",fetch = FetchType.EAGER)
	private List<ItemRequisicao> itemRequisicoes;
	
	public Requisicao() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJustificacao() {
		return justificacao;
	}

	public void setJustificacao(String justificacao) {
		this.justificacao = justificacao;
	}

	public Date getData_requisicao() {
		return data_requisicao;
	}

	public void setData_requisicao(Date data_requisicao) {
		this.data_requisicao = data_requisicao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<ItemRequisicao> getItemRequisicoes() {
		return itemRequisicoes;
	}

	public void setItemRequisicoes(List<ItemRequisicao> itemRequisicoes) {
		this.itemRequisicoes = itemRequisicoes;
	}
	
}
