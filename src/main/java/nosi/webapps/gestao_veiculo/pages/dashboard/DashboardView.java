package nosi.webapps.gestao_veiculo.pages.dashboard;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.config.Config;

public class DashboardView extends View {

	public Field data_saida;
	public Field total_carro_rua_title;
	public Field total_carro_rua_lbl;
	public Field total_carro_rua_val;
	public Field total_carro_rua_desc;
	public Field total_carro_rua_url;
	public Field total_carro_rua_bg;
	public Field total_condutor_rua_title;
	public Field total_condutor_rua_val;
	public Field total_condutor_rua_url;
	public Field total_condutor_rua_bg;
	public Field total_condutor_rua_icn;
	public Field total_condutor_title;
	public Field total_condutor_val;
	public Field total_condutor_url;
	public Field total_condutor_lbl;
	public Field total_condutor_bg;
	public Field total_condutor_icn;
	public Field veiculos_km_50_title;
	public Field veiculos_km_50_val;
	public Field veiculos_km_50_txt;
	public Field veiculos_km_50_url;
	public Field veiculos_km_50_bg;
	public Field veiculos_km_50_icn;
	public IGRPForm form_1;
	public IGRPChart chart_evolucao;
	public IGRPChart chart_saida_veiculo;
	public IGRPChart char_saida_condutor;
	public IGRPCircleStatBox total_carro_rua;
	public IGRPQuickButtonBox total_condutor_rua;
	public IGRPSmallBox total_condutor;
	public IGRPStatBox veiculos_km_50;

	public IGRPButton btn_report;
	public IGRPButton btn_button_1;

	public DashboardView(){

		this.setPageTitle("Dashboard");
			
		form_1 = new IGRPForm("form_1","");

		chart_evolucao = new IGRPChart("chart_evolucao","Evolucao de movimento");

		chart_saida_veiculo = new IGRPChart("chart_saida_veiculo","Saida/Veiculo");

		char_saida_condutor = new IGRPChart("char_saida_condutor","Condutor com mais saidas");

		total_carro_rua = new IGRPCircleStatBox("total_carro_rua","");

		total_condutor_rua = new IGRPQuickButtonBox("total_condutor_rua","");

		total_condutor = new IGRPSmallBox("total_condutor","");

		veiculos_km_50 = new IGRPStatBox("veiculos_km_50","");

		data_saida = new DateField(model,"data_saida");
		data_saida.setLabel(gt("Data saida"));
		data_saida.propertie().add("name","p_data_saida").add("type","date").add("range","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		total_carro_rua_title = new TextField(model,"total_carro_rua_title");
		total_carro_rua_title.setLabel(gt("Circle Box Title"));
		total_carro_rua_title.propertie().add("name","p_total_carro_rua_title").add("type","text").add("maxlength","4000");
		
		total_carro_rua_lbl = new TextField(model,"total_carro_rua_lbl");
		total_carro_rua_lbl.setLabel(gt("Percent Text"));
		total_carro_rua_lbl.propertie().add("name","p_total_carro_rua_lbl").add("type","text").add("maxlength","4000");
		
		total_carro_rua_val = new TextField(model,"total_carro_rua_val");
		total_carro_rua_val.setLabel(gt("Percent Value"));
		total_carro_rua_val.propertie().add("name","p_total_carro_rua_val").add("type","text").add("maxlength","4000");
		
		total_carro_rua_desc = new TextField(model,"total_carro_rua_desc");
		total_carro_rua_desc.setLabel(gt("Description"));
		total_carro_rua_desc.propertie().add("name","p_total_carro_rua_desc").add("type","text").add("maxlength","4000");
		
		total_carro_rua_url = new TextField(model,"total_carro_rua_url");
		total_carro_rua_url.setLabel(gt("Link"));
		total_carro_rua_url.propertie().add("name","p_total_carro_rua_url").add("type","text").add("maxlength","4000");
		
		total_carro_rua_bg = new TextField(model,"total_carro_rua_bg");
		total_carro_rua_bg.setLabel(gt("Background"));
		total_carro_rua_bg.propertie().add("name","p_total_carro_rua_bg").add("type","text").add("maxlength","4000");
		
		total_condutor_rua_title = new TextField(model,"total_condutor_rua_title");
		total_condutor_rua_title.setLabel(gt("Title"));
		total_condutor_rua_title.setValue(gt("Total condutor na rua"));
		total_condutor_rua_title.propertie().add("name","p_total_condutor_rua_title").add("type","text").add("maxlength","4000");
		
		total_condutor_rua_val = new TextField(model,"total_condutor_rua_val");
		total_condutor_rua_val.setLabel(gt("Value"));
		total_condutor_rua_val.propertie().add("name","p_total_condutor_rua_val").add("type","text").add("maxlength","4000");
		
		total_condutor_rua_url = new LinkField(model,"total_condutor_rua_url");
		total_condutor_rua_url.setLabel(gt(""));
		total_condutor_rua_url.setValue(new Config().getResolveUrl("gestao_veiculo","Registar_movimento","index"));
		total_condutor_rua_url.propertie().add("name","p_total_condutor_rua_url").add("type","link").add("maxlength","4000");
		
		total_condutor_rua_bg = new TextField(model,"total_condutor_rua_bg");
		total_condutor_rua_bg.setLabel(gt("Background"));
		total_condutor_rua_bg.setValue(gt("cp-cyan"));
		total_condutor_rua_bg.propertie().add("name","p_total_condutor_rua_bg").add("type","text").add("maxlength","4000");
		
		total_condutor_rua_icn = new TextField(model,"total_condutor_rua_icn");
		total_condutor_rua_icn.setLabel(gt("Icon"));
		total_condutor_rua_icn.setValue(gt("fa-check"));
		total_condutor_rua_icn.propertie().add("name","p_total_condutor_rua_icn").add("type","text").add("maxlength","4000");
		
		total_condutor_title = new TextField(model,"total_condutor_title");
		total_condutor_title.setLabel(gt("Small Box Title"));
		total_condutor_title.propertie().add("name","p_total_condutor_title").add("type","text").add("maxlength","4000");
		
		total_condutor_val = new TextField(model,"total_condutor_val");
		total_condutor_val.setLabel(gt("Value"));
		total_condutor_val.propertie().add("name","p_total_condutor_val").add("type","text").add("maxlength","4000");
		
		total_condutor_url = new TextField(model,"total_condutor_url");
		total_condutor_url.setLabel(gt("Url"));
		total_condutor_url.propertie().add("name","p_total_condutor_url").add("type","text").add("maxlength","4000");
		
		total_condutor_lbl = new TextField(model,"total_condutor_lbl");
		total_condutor_lbl.setLabel(gt("Url label"));
		total_condutor_lbl.propertie().add("name","p_total_condutor_lbl").add("type","text").add("maxlength","4000");
		
		total_condutor_bg = new TextField(model,"total_condutor_bg");
		total_condutor_bg.setLabel(gt("Background"));
		total_condutor_bg.propertie().add("name","p_total_condutor_bg").add("type","text").add("maxlength","4000");
		
		total_condutor_icn = new TextField(model,"total_condutor_icn");
		total_condutor_icn.setLabel(gt("Icon"));
		total_condutor_icn.propertie().add("name","p_total_condutor_icn").add("type","text").add("maxlength","4000");
		
		veiculos_km_50_title = new TextField(model,"veiculos_km_50_title");
		veiculos_km_50_title.setLabel(gt("Box Title"));
		veiculos_km_50_title.propertie().add("name","p_veiculos_km_50_title").add("type","text").add("maxlength","4000");
		
		veiculos_km_50_val = new TextField(model,"veiculos_km_50_val");
		veiculos_km_50_val.setLabel(gt("Value"));
		veiculos_km_50_val.propertie().add("name","p_veiculos_km_50_val").add("type","text").add("maxlength","4000");
		
		veiculos_km_50_txt = new TextField(model,"veiculos_km_50_txt");
		veiculos_km_50_txt.setLabel(gt("Url Text"));
		veiculos_km_50_txt.propertie().add("name","p_veiculos_km_50_txt").add("type","text").add("maxlength","4000");
		
		veiculos_km_50_url = new TextField(model,"veiculos_km_50_url");
		veiculos_km_50_url.setLabel(gt("Url"));
		veiculos_km_50_url.propertie().add("name","p_veiculos_km_50_url").add("type","text").add("maxlength","4000");
		
		veiculos_km_50_bg = new TextField(model,"veiculos_km_50_bg");
		veiculos_km_50_bg.setLabel(gt("Background"));
		veiculos_km_50_bg.propertie().add("name","p_veiculos_km_50_bg").add("type","text").add("maxlength","4000");
		
		veiculos_km_50_icn = new TextField(model,"veiculos_km_50_icn");
		veiculos_km_50_icn.setLabel(gt("Icon"));
		veiculos_km_50_icn.setValue(gt("fa-check"));
		veiculos_km_50_icn.propertie().add("name","p_veiculos_km_50_icn").add("type","text").add("maxlength","4000");
		


		btn_report = new IGRPButton("Report","gestao_veiculo","Dashboard","report","modal","primary|fa-file-pdf-o","","");
		btn_report.propertie.add("type","form").add("rel","report");

		btn_button_1 = new IGRPButton("Pesquisar","gestao_veiculo","Dashboard","button_1","submit_form","primary|fa-search","","");
		btn_button_1.propertie.add("type","form").add("rel","button_1");

		
		chart_evolucao.setCaption("");
		chart_evolucao.setChart_type("line");
		chart_evolucao.setXaxys("Eixo de X");
		chart_evolucao.setYaxys("Eixo de Y");
		chart_evolucao.setUrl("#");
		chart_evolucao.addColor("#f4067f").addColor("#bdb97d").addColor("#fb0745").addColor("#baa14d");

		chart_saida_veiculo.setCaption("");
		chart_saida_veiculo.setChart_type("pie");
		chart_saida_veiculo.setXaxys("Eixo de X");
		chart_saida_veiculo.setYaxys("Eixo de Y");
		chart_saida_veiculo.setUrl("#");
		chart_saida_veiculo.addColor("#a6e9ff").addColor("#cca433").addColor("#f40d34").addColor("#b049a8");

		char_saida_condutor.setCaption("");
		char_saida_condutor.setChart_type("column");
		char_saida_condutor.setXaxys("Eixo de X");
		char_saida_condutor.setYaxys("Eixo de Y");
		char_saida_condutor.setUrl("#");
		char_saida_condutor.addColor("#52ef14").addColor("#db0b41").addColor("#b53e69").addColor("#70b0c7");

	}
		
	@Override
	public void render(){
		
		form_1.addField(data_saida);




		total_carro_rua.addField(total_carro_rua_title);
		total_carro_rua.addField(total_carro_rua_lbl);
		total_carro_rua.addField(total_carro_rua_val);
		total_carro_rua.addField(total_carro_rua_desc);
		total_carro_rua.addField(total_carro_rua_url);
		total_carro_rua.addField(total_carro_rua_bg);

		total_condutor_rua.addField(total_condutor_rua_title);
		total_condutor_rua.addField(total_condutor_rua_val);
		total_condutor_rua.addField(total_condutor_rua_url);
		total_condutor_rua.addField(total_condutor_rua_bg);
		total_condutor_rua.addField(total_condutor_rua_icn);

		total_condutor.addField(total_condutor_title);
		total_condutor.addField(total_condutor_val);
		total_condutor.addField(total_condutor_url);
		total_condutor.addField(total_condutor_lbl);
		total_condutor.addField(total_condutor_bg);
		total_condutor.addField(total_condutor_icn);

		veiculos_km_50.addField(veiculos_km_50_title);
		veiculos_km_50.addField(veiculos_km_50_val);
		veiculos_km_50.addField(veiculos_km_50_txt);
		veiculos_km_50.addField(veiculos_km_50_url);
		veiculos_km_50.addField(veiculos_km_50_bg);
		veiculos_km_50.addField(veiculos_km_50_icn);

		form_1.addButton(btn_report);
		form_1.addButton(btn_button_1);
		this.addToPage(form_1);
		this.addToPage(chart_evolucao);
		this.addToPage(chart_saida_veiculo);
		this.addToPage(char_saida_condutor);
		this.addToPage(total_carro_rua);
		this.addToPage(total_condutor_rua);
		this.addToPage(total_condutor);
		this.addToPage(veiculos_km_50);
	}
		
	@Override
	public void setModel(Model model) {
		
		data_saida.setValue(model);
		total_carro_rua_title.setValue(model);
		total_carro_rua_lbl.setValue(model);
		total_carro_rua_val.setValue(model);
		total_carro_rua_desc.setValue(model);
		total_carro_rua_url.setValue(model);
		total_carro_rua_bg.setValue(model);
		total_condutor_rua_val.setValue(model);
		total_condutor_title.setValue(model);
		total_condutor_val.setValue(model);
		total_condutor_url.setValue(model);
		total_condutor_lbl.setValue(model);
		total_condutor_bg.setValue(model);
		total_condutor_icn.setValue(model);
		veiculos_km_50_title.setValue(model);
		veiculos_km_50_val.setValue(model);
		veiculos_km_50_txt.setValue(model);
		veiculos_km_50_url.setValue(model);
		veiculos_km_50_bg.setValue(model);	

		chart_evolucao.loadModel(((Dashboard) model).getChart_evolucao());
		chart_saida_veiculo.loadModel(((Dashboard) model).getChart_saida_veiculo());
		char_saida_condutor.loadModel(((Dashboard) model).getChar_saida_condutor());
		}
}
