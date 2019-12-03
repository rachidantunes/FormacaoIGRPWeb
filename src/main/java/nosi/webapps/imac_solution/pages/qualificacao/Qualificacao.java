package nosi.webapps.imac_solution.pages.qualificacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Qualificacao extends Model{		

	@RParam(rParamName = "p_aprovar")
	private String aprovar;

	@RParam(rParamName = "p_observacao")
	private String observacao;
	
	public void setAprovar(String aprovar){
		this.aprovar = aprovar;
	}
	public String getAprovar(){
		return this.aprovar;
	}
	
	public void setObservacao(String observacao){
		this.observacao = observacao;
	}
	public String getObservacao(){
		return this.observacao;
	}



}
