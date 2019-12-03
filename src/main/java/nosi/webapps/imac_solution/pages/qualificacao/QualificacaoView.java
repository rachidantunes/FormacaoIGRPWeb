package nosi.webapps.imac_solution.pages.qualificacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class QualificacaoView extends View {

	public Field aprovar;
	public Field observacao;
	public IGRPForm form_1;


	public QualificacaoView(){

		this.setPageTitle("Qualificacao");
			
		form_1 = new IGRPForm("form_1","");

		aprovar = new ListField(model,"aprovar");
		aprovar.setLabel(gt("Aprovar"));
		aprovar.propertie().add("name","p_aprovar").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		observacao = new TextAreaField(model,"observacao");
		observacao.setLabel(gt("Observacao"));
		observacao.propertie().add("name","p_observacao").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(aprovar);
		form_1.addField(observacao);

		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		aprovar.setValue(model);
		observacao.setValue(model);	

		}
}
