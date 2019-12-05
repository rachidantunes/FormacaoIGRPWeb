package nosi.webapps.controlo_veiculos.pages.teste_comit;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Teste_comitView extends View {

	public Field form_1_text_1;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar;

	public Teste_comitView(){

		this.setPageTitle("teste Comit");
			
		form_1 = new IGRPForm("form_1","");

		form_1_text_1 = new TextField(model,"form_1_text_1");
		form_1_text_1.setLabel(gt("Text"));
		form_1_text_1.propertie().add("name","p_form_1_text_1").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar = new IGRPButton("Gravar","controlo_veiculos","Teste_comit","gravar","_blank","primary|fa-angle-right","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(form_1_text_1);


		toolsbar_1.addButton(btn_gravar);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		form_1_text_1.setValue(model);	

		}
}
