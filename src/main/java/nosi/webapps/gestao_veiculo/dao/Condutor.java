package nosi.webapps.gestao_veiculo.dao;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import nosi.base.ActiveRecord.BaseActiveRecord;

/**
 * cvt00957
 * Nov 18, 2019
 */

@Entity
@Table(name = "tbl_condutor")
public class Condutor extends BaseActiveRecord<Condutor>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(nullable = false, unique = true, length = 6)
	private String bi;
	
	@Column(nullable = false, unique = true, length = 10)
	private String carta_conducao;
	
	@OneToMany(mappedBy = "condutor",fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Movimento> movimentos;
	
	public Condutor() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBi() {
		return bi;
	}

	public void setBi(String bi) {
		this.bi = bi;
	}

	public String getCarta_conducao() {
		return carta_conducao;
	}

	public void setCarta_conducao(String carta_conducao) {
		this.carta_conducao = carta_conducao;
	}

	public Set<Movimento> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(Set<Movimento> movimentos) {
		this.movimentos = movimentos;
	}
	
	
}
