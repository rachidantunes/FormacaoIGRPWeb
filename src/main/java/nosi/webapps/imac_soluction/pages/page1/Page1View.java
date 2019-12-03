package nosi.webapps.imac_soluction.pages.page1;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.config.Config;

public class Page1View extends View {

	public Field produtos;
	public Field preco;
	public Field quantidade;
	public Field total;
	public IGRPFormList formlist_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_save;

	public Page1View(){

		this.setPageTitle("Page1");
			
		formlist_1 = new IGRPFormList("formlist_1","");

		produtos = new ListField(model,"produtos");
		produtos.setLabel(gt("Produtos"));
		produtos.propertie().add("remote",new Config().getResolveUrl("imac_soluction","Page1","GetPreco")).add("name","p_produtos").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("delimiter",";").add("desc","true");
		
		preco = new NumberField(model,"preco");
		preco.setLabel(gt("Preco"));
		preco.propertie().add("name","p_preco").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("total_col","false").add("total_row","false").add("totalrow","false").add("desc","true");
		
		quantidade = new NumberField(model,"quantidade");
		quantidade.setLabel(gt("Quantidade"));
		quantidade.propertie().add("remote",new Config().getResolveUrl("imac_soluction","Page1","GetTotal")).add("name","p_quantidade").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("total_col","false").add("total_row","false").add("totalrow","false").add("desc","true");
		
		total = new PlainTextField(model,"total");
		total.setLabel(gt("Total"));
		total.propertie().add("name","p_total").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("desc","true");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_save = new IGRPButton("Save","imac_soluction","Page1","save","submit","primary|fa-angle-right","","");
		btn_save.propertie.add("type","specific").add("rel","save");

		
	}
		
	@Override
	public void render(){
		

		formlist_1.addField(produtos);
		formlist_1.addField(preco);
		formlist_1.addField(quantidade);
		formlist_1.addField(total);

		toolsbar_1.addButton(btn_save);
		this.addToPage(formlist_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		produtos.setValue(model);
		preco.setValue(model);
		quantidade.setValue(model);
		total.setValue(model);	

		formlist_1.loadModel(((Page1) model).getFormlist_1());
		}
}
