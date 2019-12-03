package nosi.webapps.imac_solution.pages.page1;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Page1View extends View {

	public Field form_1_text_1;
	public IGRPForm form_1;


	public Page1View(){

		this.setPageTitle("Page1");
			
		form_1 = new IGRPForm("form_1","");

		form_1_text_1 = new TextField(model,"form_1_text_1");
		form_1_text_1.setLabel(gt("Text"));
		form_1_text_1.propertie().add("name","p_form_1_text_1").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(form_1_text_1);

		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		form_1_text_1.setValue(model);	

		}
}
