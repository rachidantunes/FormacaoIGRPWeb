package nosi.webapps.gestao_compra.pages.lista_compra;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Lista_compraView extends View {

	public Field descricao;
	public IGRPTable table_1;


	public Lista_compraView(){

		this.setPageTitle("Lista Compra");
			
		table_1 = new IGRPTable("table_1","");

		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descricao"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		


		
	}
		
	@Override
	public void render(){
		
		table_1.addField(descricao);

		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		descricao.setValue(model);	

		table_1.loadModel(((Lista_compra) model).getTable_1());
		}
}
