package nosi.webapps.controlo_veiculos.pages.teste_comit;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Teste_comit extends Model{		

	@RParam(rParamName = "p_form_1_text_1")
	private String form_1_text_1;
	
	public void setForm_1_text_1(String form_1_text_1){
		this.form_1_text_1 = form_1_text_1;
	}
	public String getForm_1_text_1(){
		return this.form_1_text_1;
	}



}
