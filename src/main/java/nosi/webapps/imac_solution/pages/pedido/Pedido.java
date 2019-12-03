package nosi.webapps.imac_solution.pages.pedido;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Pedido extends Model{		

	@RParam(rParamName = "p_email")
	private String email;

	@RParam(rParamName = "p_telefone")
	private String telefone;

	@RParam(rParamName = "p_movel")
	private String movel;

	@RParam(rParamName = "p_fax")
	private String fax;

	@RParam(rParamName = "p_forma_pagamento")
	private String forma_pagamento;

	@RParam(rParamName = "p_valor")
	private String valor;
	
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
	
	public void setForma_pagamento(String forma_pagamento){
		this.forma_pagamento = forma_pagamento;
	}
	public String getForma_pagamento(){
		return this.forma_pagamento;
	}
	
	public void setValor(String valor){
		this.valor = valor;
	}
	public String getValor(){
		return this.valor;
	}



}
