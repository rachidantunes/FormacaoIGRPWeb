package nosi.webapps.imac_solution.pages.page_task1;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Page_task1 extends Model{		

	@RParam(rParamName = "p_nome")
	private String nome;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}



}
