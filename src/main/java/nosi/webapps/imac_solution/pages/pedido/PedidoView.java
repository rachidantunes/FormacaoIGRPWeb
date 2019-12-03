package nosi.webapps.imac_solution.pages.pedido;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class PedidoView extends View {

	public Field email;
	public Field telefone;
	public Field movel;
	public Field fax;
	public Field forma_pagamento;
	public Field valor;
	public IGRPForm contato;
	public IGRPForm pagamento;


	public PedidoView(){

		this.setPageTitle("Pedido");
			
		contato = new IGRPForm("contato","Contato");

		pagamento = new IGRPForm("pagamento","Pagamento");

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
		
		forma_pagamento = new ListField(model,"forma_pagamento");
		forma_pagamento.setLabel(gt("Forma Pagamento"));
		forma_pagamento.propertie().add("name","p_forma_pagamento").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		valor = new TextField(model,"valor");
		valor.setLabel(gt("Valor"));
		valor.propertie().add("name","p_valor").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		


		
	}
		
	@Override
	public void render(){
		
		contato.addField(email);
		contato.addField(telefone);
		contato.addField(movel);
		contato.addField(fax);

		pagamento.addField(forma_pagamento);
		pagamento.addField(valor);

		this.addToPage(contato);
		this.addToPage(pagamento);
	}
		
	@Override
	public void setModel(Model model) {
		
		email.setValue(model);
		telefone.setValue(model);
		movel.setValue(model);
		fax.setValue(model);
		forma_pagamento.setValue(model);
		valor.setValue(model);	

		}
}
