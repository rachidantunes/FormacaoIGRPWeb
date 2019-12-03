package nosi.webapps.gestao_veiculo.pages.pedido;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class PedidoView extends View {

	public Field justificacao;
	public Field sectionheader_1_text;
	public Field descricao;
	public Field quantidade;
	public IGRPForm form_1;
	public IGRPSectionHeader sectionheader_1;
	public IGRPFormList formlist_1;


	public PedidoView(){

		this.setPageTitle("Pedido");
			
		form_1 = new IGRPForm("form_1","");

		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		formlist_1 = new IGRPFormList("formlist_1","");

		justificacao = new TextAreaField(model,"justificacao");
		justificacao.setLabel(gt("Justificação"));
		justificacao.propertie().add("name","p_justificacao").add("type","textarea").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Pedido Compra</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		quantidade = new NumberField(model,"quantidade");
		quantidade.setLabel(gt("Quantidade"));
		quantidade.propertie().add("name","p_quantidade").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("total_col","false").add("total_row","false").add("totalrow","false").add("desc","true");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(justificacao);

		sectionheader_1.addField(sectionheader_1_text);

		formlist_1.addField(descricao);
		formlist_1.addField(quantidade);

		this.addToPage(form_1);
		this.addToPage(sectionheader_1);
		this.addToPage(formlist_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		justificacao.setValue(model);
		descricao.setValue(model);
		quantidade.setValue(model);	

		formlist_1.loadModel(((Pedido) model).getFormlist_1());
		}
}
