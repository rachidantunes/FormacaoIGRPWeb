package nosi.webapps.gestao_veiculo.pages.registar_movimento;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registar_movimento extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_condutor")
	private String condutor;

	@NotNull()
	@RParam(rParamName = "p_veiculo")
	private Integer veiculo;

	@NotNull()
	@RParam(rParamName = "p_data_saida")
	private String data_saida;

	@RParam(rParamName = "p_hora_saida")
	private String hora_saida;

	@RParam(rParamName = "p_km_saida")
	private double km_saida;

	@NotNull()
	@RParam(rParamName = "p_id_condutor")
	private Integer id_condutor;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setCondutor(String condutor){
		this.condutor = condutor;
	}
	public String getCondutor(){
		return this.condutor;
	}
	
	public void setVeiculo(Integer veiculo){
		this.veiculo = veiculo;
	}
	public Integer getVeiculo(){
		return this.veiculo;
	}
	
	public void setData_saida(String data_saida){
		this.data_saida = data_saida;
	}
	public String getData_saida(){
		return this.data_saida;
	}
	
	public void setHora_saida(String hora_saida){
		this.hora_saida = hora_saida;
	}
	public String getHora_saida(){
		return this.hora_saida;
	}
	
	public void setKm_saida(double km_saida){
		this.km_saida = km_saida;
	}
	public double getKm_saida(){
		return this.km_saida;
	}
	
	public void setId_condutor(Integer id_condutor){
		this.id_condutor = id_condutor;
	}
	public Integer getId_condutor(){
		return this.id_condutor;
	}



}
