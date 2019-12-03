package nosi.webapps.gestao_compra.pages.pedido;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class PedidoView extends View {

	public Field justificacao;
	public Field descricao;
	public Field quantidade;
	public IGRPForm form_1;
	public IGRPFormList formlist_1;


	public PedidoView(){

		this.setPageTitle("Pedido");
			
		form_1 = new IGRPForm("form_1","Pedido Material");

		formlist_1 = new IGRPFormList("formlist_1","Materiais");

		justificacao = new TextAreaField(model,"justificacao");
		justificacao.setLabel(gt("Justificação"));
		justificacao.propertie().add("name","p_justificacao").add("type","textarea").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
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

		formlist_1.addField(descricao);
		formlist_1.addField(quantidade);

		this.addToPage(form_1);
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
