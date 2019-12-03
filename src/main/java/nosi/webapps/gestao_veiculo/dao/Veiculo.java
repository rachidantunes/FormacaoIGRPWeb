package nosi.webapps.gestao_veiculo.dao;

import java.util.Set;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import nosi.base.ActiveRecord.BaseActiveRecord;

/**
 * cvt00957
 * Nov 18, 2019
 */

@Entity
@Table(name="tbl_veiculo")
@XmlRootElement
public class Veiculo extends BaseActiveRecord<Veiculo>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false,length = 8)
	private String matricula;
	
	@Column(nullable = false,length = 30)
	private String cor;
	
	@Column(nullable = false, length = 100)
	private String marca;

	@OneToMany(mappedBy = "veiculo")
	@JsonIgnore
	private Set<Movimento> movimentos;
	
	public Veiculo() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@XmlTransient
	public Set<Movimento> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(Set<Movimento> movimentos) {
		this.movimentos = movimentos;
	}
	
}
