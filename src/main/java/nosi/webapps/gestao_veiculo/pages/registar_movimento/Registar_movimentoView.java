package nosi.webapps.gestao_veiculo.pages.registar_movimento;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Registar_movimentoView extends View {

	public Field sectionheader_1_text;
	public Field condutor;
	public Field veiculo;
	public Field data_saida;
	public Field hora_saida;
	public Field km_saida;
	public Field id_condutor;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_save;

	public Registar_movimentoView(){

		this.setPageTitle("Registar Movimento");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p><strong>Registar Saida de Veiculos</strong></p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		condutor = new LookupField(model,"condutor");
		condutor.setLabel(gt("Condutor"));
		condutor.setLookup("gestao_veiculo","Pesquisa_condutor","index");
		condutor.addParam("target","_blank");
		condutor.addLookupParam("p_id_condutor","id_condutor");
		condutor.addLookupParam("p_condutor","nome");
		condutor.propertie().add("name","p_condutor").add("type","lookup").add("lookup_eraser","false").add("lookup_type","LOOKUP").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		veiculo = new ListField(model,"veiculo");
		veiculo.setLabel(gt("Veiculo"));
		veiculo.propertie().add("name","p_veiculo").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","Integer");
		
		data_saida = new DateField(model,"data_saida");
		data_saida.setLabel(gt("Data saida"));
		data_saida.propertie().add("name","p_data_saida").add("type","date").add("range","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		hora_saida = new TextField(model,"hora_saida");
		hora_saida.setLabel(gt("Hora saida"));
		hora_saida.propertie().add("name","p_hora_saida").add("type","time").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		km_saida = new NumberField(model,"km_saida");
		km_saida.setLabel(gt("KM Saida"));
		km_saida.propertie().add("name","p_km_saida").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","double");
		
		id_condutor = new HiddenField(model,"id_condutor");
		id_condutor.setLabel(gt(""));
		id_condutor.propertie().add("name","p_id_condutor").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id_condutor");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_save = new IGRPButton("Save","gestao_veiculo","Registar_movimento","save","submit","primary|fa-save","","");
		btn_save.propertie.add("type","specific").add("rel","save");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		form_1.addField(condutor);
		form_1.addField(veiculo);
		form_1.addField(data_saida);
		form_1.addField(hora_saida);
		form_1.addField(km_saida);
		form_1.addField(id_condutor);

		toolsbar_1.addButton(btn_save);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		condutor.setValue(model);
		veiculo.setValue(model);
		data_saida.setValue(model);
		hora_saida.setValue(model);
		km_saida.setValue(model);
		id_condutor.setValue(model);	

		}
}
