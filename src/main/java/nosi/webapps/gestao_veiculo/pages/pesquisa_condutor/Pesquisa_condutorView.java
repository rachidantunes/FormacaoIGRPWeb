package nosi.webapps.gestao_veiculo.pages.pesquisa_condutor;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Pesquisa_condutorView extends View {

	public Field bi_search;
	public Field nome_search;
	public Field nome;
	public Field bi;
	public Field n_carta_conducao;
	public Field id_condutor;
	public IGRPForm form_1;
	public IGRPTable condutor;

	public IGRPButton btn_pesquisar;

	public Pesquisa_condutorView(){

		this.setPageTitle("Pesquisa Condutor");
			
		form_1 = new IGRPForm("form_1","");

		condutor = new IGRPTable("condutor","Condutores");

		bi_search = new TextField(model,"bi_search");
		bi_search.setLabel(gt("BI"));
		bi_search.propertie().add("name","p_bi_search").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		nome_search = new TextField(model,"nome_search");
		nome_search.setLabel(gt("Nome"));
		nome_search.propertie().add("name","p_nome_search").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		bi = new TextField(model,"bi");
		bi.setLabel(gt("BI"));
		bi.propertie().add("name","p_bi").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		n_carta_conducao = new TextField(model,"n_carta_conducao");
		n_carta_conducao.setLabel(gt("Nº Carta Conducao"));
		n_carta_conducao.propertie().add("name","p_n_carta_conducao").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_condutor = new HiddenField(model,"id_condutor");
		id_condutor.setLabel(gt(""));
		id_condutor.propertie().add("name","p_id_condutor").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","Integer").add("tag","id_condutor");
		


		btn_pesquisar = new IGRPButton("Pesquisar","gestao_veiculo","Pesquisa_condutor","pesquisar","submit_form","primary|fa-search","","");
		btn_pesquisar.propertie.add("type","form").add("rel","pesquisar");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(bi_search);
		form_1.addField(nome_search);

		condutor.addField(nome);
		condutor.addField(bi);
		condutor.addField(n_carta_conducao);
		condutor.addField(id_condutor);

		form_1.addButton(btn_pesquisar);
		this.addToPage(form_1);
		this.addToPage(condutor);
	}
		
	@Override
	public void setModel(Model model) {
		
		bi_search.setValue(model);
		nome_search.setValue(model);
		nome.setValue(model);
		bi.setValue(model);
		n_carta_conducao.setValue(model);
		id_condutor.setValue(model);	

		condutor.loadModel(((Pesquisa_condutor) model).getCondutor());
		}
}
