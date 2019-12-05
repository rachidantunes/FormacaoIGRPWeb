package nosi.webapps.gestao_de_veiculos.pages.rachid_teste_git;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Rachid_teste_gitView extends View {

	public Field sectionheader_1_text;
	public Field nome;
	public Field turma;
	public Field numero;
	public Field nome_filtro;
	public Field turma_flt;
	public IGRPSectionHeader sectionheader_1;
	public IGRPFormList formlist_1;
	public IGRPForm form_1;

	public IGRPButton btn_pesquisar;

	public Rachid_teste_gitView(){

		this.setPageTitle("Rachid Teste GIT");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		formlist_1 = new IGRPFormList("formlist_1","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Lista dos Alunos</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		turma = new TextField(model,"turma");
		turma.setLabel(gt("Turma"));
		turma.propertie().add("name","p_turma").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		numero = new TextField(model,"numero");
		numero.setLabel(gt("Número"));
		numero.propertie().add("name","p_numero").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		nome_filtro = new TextField(model,"nome_filtro");
		nome_filtro.setLabel(gt("Nome"));
		nome_filtro.propertie().add("name","p_nome_filtro").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		turma_flt = new ListField(model,"turma_flt");
		turma_flt.setLabel(gt("Turma"));
		turma_flt.propertie().add("name","p_turma_flt").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		


		btn_pesquisar = new IGRPButton("Pesquisar","gestao_de_veiculos","Rachid_teste_git","pesquisar","_blank","default|fa-search","","");
		btn_pesquisar.propertie.add("type","form").add("rel","pesquisar");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		formlist_1.addField(nome);
		formlist_1.addField(turma);
		formlist_1.addField(numero);

		form_1.addField(nome_filtro);
		form_1.addField(turma_flt);

		form_1.addButton(btn_pesquisar);
		this.addToPage(sectionheader_1);
		this.addToPage(formlist_1);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		turma.setValue(model);
		numero.setValue(model);
		nome_filtro.setValue(model);
		turma_flt.setValue(model);	

		formlist_1.loadModel(((Rachid_teste_git) model).getFormlist_1());
		}
}
