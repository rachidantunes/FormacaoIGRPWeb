package nosi.webapps.imac_solution.pages.contato;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Contato extends Model{		

	@RParam(rParamName = "p_email")
	private String email;

	@RParam(rParamName = "p_telefone")
	private String telefone;

	@RParam(rParamName = "p_movel")
	private String movel;

	@RParam(rParamName = "p_fax")
	private String fax;
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	public String getTelefone(){
		return this.telefone;
	}
	
	public void setMovel(String movel){
		this.movel = movel;
	}
	public String getMovel(){
		return this.movel;
	}
	
	public void setFax(String fax){
		this.fax = fax;
	}
	public String getFax(){
		return this.fax;
	}



}
