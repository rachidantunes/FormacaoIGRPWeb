package nosi.webapps.gestao_compra.pages.registar_compra;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.config.Config;

public class Registar_compraView extends View {

	public Field sectionheader_1_text;
	public Field produto;
	public Field preco;
	public Field quantidade;
	public Field total;
	public Field loja;
	public Field data_compra;
	public IGRPSectionHeader sectionheader_1;
	public IGRPFormList produtos;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar;

	public Registar_compraView(){

		this.setPageTitle("Registar Compra");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		produtos = new IGRPFormList("produtos","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p><strong>Registar compras</strong></p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		produto = new ListField(model,"produto");
		produto.setLabel(gt("Produto"));
		produto.propertie().add("name","p_produto").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","int").add("delimiter",";").add("desc","true");
		
		preco = new NumberField(model,"preco");
		preco.setLabel(gt("Preço"));
		preco.propertie().add("name","p_preco").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","double").add("total_col","false").add("total_row","false").add("totalrow","false").add("desc","true");
		
		quantidade = new NumberField(model,"quantidade");
		quantidade.setLabel(gt("Quantidade"));
		quantidade.propertie().add("remote",new Config().getResolveUrl("gestao_compra","Registar_compra","calculaTotal")).add("name","p_quantidade").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","double").add("total_col","false").add("total_row","false").add("totalrow","false").add("desc","true");
		
		total = new PlainTextField(model,"total");
		total.setLabel(gt("Total"));
		total.propertie().add("name","p_total").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("desc","true");
		
		loja = new ListField(model,"loja");
		loja.setLabel(gt("Loja"));
		loja.propertie().add("name","p_loja").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","int");
		
		data_compra = new DateField(model,"data_compra");
		data_compra.setLabel(gt("Data compra"));
		data_compra.propertie().add("name","p_data_compra").add("type","date").add("range","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar = new IGRPButton("Gravar","gestao_compra","Registar_compra","gravar","submit","primary|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		produtos.addField(produto);
		produtos.addField(preco);
		produtos.addField(quantidade);
		produtos.addField(total);

		form_1.addField(loja);
		form_1.addField(data_compra);

		toolsbar_1.addButton(btn_gravar);
		this.addToPage(sectionheader_1);
		this.addToPage(produtos);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		produto.setValue(model);
		preco.setValue(model);
		quantidade.setValue(model);
		total.setValue(model);
		loja.setValue(model);
		data_compra.setValue(model);	

		produtos.loadModel(((Registar_compra) model).getProdutos());
		}
}
