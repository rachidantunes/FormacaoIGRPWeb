package nosi.webapps.imac_solution.pages.contato;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class ContatoView extends View {

	public Field email;
	public Field telefone;
	public Field movel;
	public Field fax;
	public IGRPForm contato;


	public ContatoView(){

		this.setPageTitle("Contato");
			
		contato = new IGRPForm("contato","Contato");

		email = new TextField(model,"email");
		email.setLabel(gt("Email"));
		email.propertie().add("name","p_email").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		telefone = new TextField(model,"telefone");
		telefone.setLabel(gt("Telefone"));
		telefone.propertie().add("name","p_telefone").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		movel = new TextField(model,"movel");
		movel.setLabel(gt("Movel"));
		movel.propertie().add("name","p_movel").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		fax = new TextField(model,"fax");
		fax.setLabel(gt("Fax"));
		fax.propertie().add("name","p_fax").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		


		
	}
		
	@Override
	public void render(){
		
		contato.addField(email);
		contato.addField(telefone);
		contato.addField(movel);
		contato.addField(fax);

		this.addToPage(contato);
	}
		
	@Override
	public void setModel(Model model) {
		
		email.setValue(model);
		telefone.setValue(model);
		movel.setValue(model);
		fax.setValue(model);	

		}
}
