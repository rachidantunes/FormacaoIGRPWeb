package nosi.webapps.imac_soluction.pages.dashboad;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.config.Config;

public class DashboadView extends View {

	public Field circlestatbox_1_title;
	public Field circlestatbox_1_lbl;
	public Field circlestatbox_1_val;
	public Field circlestatbox_1_desc;
	public Field circlestatbox_1_url;
	public Field circlestatbox_1_bg;
	public Field quickbuttonbox_1_title;
	public Field quickbuttonbox_1_val;
	public Field quickbuttonbox_1_url;
	public Field quickbuttonbox_1_bg;
	public Field quickbuttonbox_1_icn;
	public Field smallbox_1_title;
	public Field smallbox_1_val;
	public Field smallbox_1_url;
	public Field smallbox_1_lbl;
	public Field smallbox_1_bg;
	public Field smallbox_1_icn;
	public Field statbox_1_title;
	public Field statbox_1_val;
	public Field statbox_1_txt;
	public Field statbox_1_url;
	public Field statbox_1_bg;
	public Field statbox_1_icn;
	public Field data_saida;
	public IGRPChart line;
	public IGRPChart pie;
	public IGRPChart column;
	public IGRPCircleStatBox circlestatbox_1;
	public IGRPQuickButtonBox quickbuttonbox_1;
	public IGRPSmallBox smallbox_1;
	public IGRPStatBox statbox_1;
	public IGRPForm form_1;

	public IGRPButton btn_pesquisar;

	public DashboadView(){

		this.setPageTitle("Dashboad");
			
		line = new IGRPChart("line","Chart Line");

		pie = new IGRPChart("pie","Chart Pie");

		column = new IGRPChart("column","Chart Column");

		circlestatbox_1 = new IGRPCircleStatBox("circlestatbox_1","");

		quickbuttonbox_1 = new IGRPQuickButtonBox("quickbuttonbox_1","");

		smallbox_1 = new IGRPSmallBox("smallbox_1","");

		statbox_1 = new IGRPStatBox("statbox_1","");

		form_1 = new IGRPForm("form_1","");

		circlestatbox_1_title = new TextField(model,"circlestatbox_1_title");
		circlestatbox_1_title.setLabel(gt("Circle Box Title"));
		circlestatbox_1_title.propertie().add("name","p_circlestatbox_1_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_lbl = new TextField(model,"circlestatbox_1_lbl");
		circlestatbox_1_lbl.setLabel(gt("Percent Text"));
		circlestatbox_1_lbl.propertie().add("name","p_circlestatbox_1_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_val = new TextField(model,"circlestatbox_1_val");
		circlestatbox_1_val.setLabel(gt("Percent Value"));
		circlestatbox_1_val.propertie().add("name","p_circlestatbox_1_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_desc = new TextField(model,"circlestatbox_1_desc");
		circlestatbox_1_desc.setLabel(gt("Description"));
		circlestatbox_1_desc.propertie().add("name","p_circlestatbox_1_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_url = new TextField(model,"circlestatbox_1_url");
		circlestatbox_1_url.setLabel(gt("Link"));
		circlestatbox_1_url.propertie().add("name","p_circlestatbox_1_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_bg = new TextField(model,"circlestatbox_1_bg");
		circlestatbox_1_bg.setLabel(gt("Background"));
		circlestatbox_1_bg.propertie().add("name","p_circlestatbox_1_bg").add("type","text").add("maxlength","4000");
		
		quickbuttonbox_1_title = new TextField(model,"quickbuttonbox_1_title");
		quickbuttonbox_1_title.setLabel(gt("Title"));
		quickbuttonbox_1_title.setValue(gt("Box Title"));
		quickbuttonbox_1_title.propertie().add("name","p_quickbuttonbox_1_title").add("type","text").add("maxlength","4000");
		
		quickbuttonbox_1_val = new TextField(model,"quickbuttonbox_1_val");
		quickbuttonbox_1_val.setLabel(gt("Value"));
		quickbuttonbox_1_val.propertie().add("name","p_quickbuttonbox_1_val").add("type","text").add("maxlength","4000");
		
		quickbuttonbox_1_url = new LinkField(model,"quickbuttonbox_1_url");
		quickbuttonbox_1_url.setLabel(gt(""));
		quickbuttonbox_1_url.setValue(new Config().getResolveUrl("imac_soluction","Dashboad","index"));
		quickbuttonbox_1_url.propertie().add("name","p_quickbuttonbox_1_url").add("type","link").add("maxlength","4000");
		
		quickbuttonbox_1_bg = new TextField(model,"quickbuttonbox_1_bg");
		quickbuttonbox_1_bg.setLabel(gt("Background"));
		quickbuttonbox_1_bg.setValue(gt("cp-cyan"));
		quickbuttonbox_1_bg.propertie().add("name","p_quickbuttonbox_1_bg").add("type","text").add("maxlength","4000");
		
		quickbuttonbox_1_icn = new TextField(model,"quickbuttonbox_1_icn");
		quickbuttonbox_1_icn.setLabel(gt("Icon"));
		quickbuttonbox_1_icn.setValue(gt("fa-check"));
		quickbuttonbox_1_icn.propertie().add("name","p_quickbuttonbox_1_icn").add("type","text").add("maxlength","4000");
		
		smallbox_1_title = new TextField(model,"smallbox_1_title");
		smallbox_1_title.setLabel(gt("Small Box Title"));
		smallbox_1_title.propertie().add("name","p_smallbox_1_title").add("type","text").add("maxlength","4000");
		
		smallbox_1_val = new TextField(model,"smallbox_1_val");
		smallbox_1_val.setLabel(gt("Value"));
		smallbox_1_val.propertie().add("name","p_smallbox_1_val").add("type","text").add("maxlength","4000");
		
		smallbox_1_url = new TextField(model,"smallbox_1_url");
		smallbox_1_url.setLabel(gt("Url"));
		smallbox_1_url.propertie().add("name","p_smallbox_1_url").add("type","text").add("maxlength","4000");
		
		smallbox_1_lbl = new TextField(model,"smallbox_1_lbl");
		smallbox_1_lbl.setLabel(gt("Url label"));
		smallbox_1_lbl.propertie().add("name","p_smallbox_1_lbl").add("type","text").add("maxlength","4000");
		
		smallbox_1_bg = new TextField(model,"smallbox_1_bg");
		smallbox_1_bg.setLabel(gt("Background"));
		smallbox_1_bg.propertie().add("name","p_smallbox_1_bg").add("type","text").add("maxlength","4000");
		
		smallbox_1_icn = new TextField(model,"smallbox_1_icn");
		smallbox_1_icn.setLabel(gt("Icon"));
		smallbox_1_icn.propertie().add("name","p_smallbox_1_icn").add("type","text").add("maxlength","4000");
		
		statbox_1_title = new TextField(model,"statbox_1_title");
		statbox_1_title.setLabel(gt("Box Title"));
		statbox_1_title.propertie().add("name","p_statbox_1_title").add("type","text").add("maxlength","4000");
		
		statbox_1_val = new TextField(model,"statbox_1_val");
		statbox_1_val.setLabel(gt("Value"));
		statbox_1_val.propertie().add("name","p_statbox_1_val").add("type","text").add("maxlength","4000");
		
		statbox_1_txt = new TextField(model,"statbox_1_txt");
		statbox_1_txt.setLabel(gt("Url Text"));
		statbox_1_txt.propertie().add("name","p_statbox_1_txt").add("type","text").add("maxlength","4000");
		
		statbox_1_url = new TextField(model,"statbox_1_url");
		statbox_1_url.setLabel(gt("Url"));
		statbox_1_url.propertie().add("name","p_statbox_1_url").add("type","text").add("maxlength","4000");
		
		statbox_1_bg = new TextField(model,"statbox_1_bg");
		statbox_1_bg.setLabel(gt("Background"));
		statbox_1_bg.propertie().add("name","p_statbox_1_bg").add("type","text").add("maxlength","4000");
		
		statbox_1_icn = new TextField(model,"statbox_1_icn");
		statbox_1_icn.setLabel(gt("Icon"));
		statbox_1_icn.setValue(gt("fa-check"));
		statbox_1_icn.propertie().add("name","p_statbox_1_icn").add("type","text").add("maxlength","4000");
		
		data_saida = new DateField(model,"data_saida");
		data_saida.setLabel(gt("Data saida"));
		data_saida.propertie().add("name","p_data_saida").add("type","date").add("range","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		


		btn_pesquisar = new IGRPButton("Pesquisar","imac_soluction","Dashboad","pesquisar","submit","primary|fa-search","","");
		btn_pesquisar.propertie.add("type","form").add("rel","pesquisar");

		
		line.setCaption("");
		line.setChart_type("line");
		line.setXaxys("Eixo de X");
		line.setYaxys("Eixo de Y");
		line.setUrl("#");
		line.addColor("#0b545d").addColor("#4dd0cf").addColor("#dd08c1").addColor("#feae4f");

		pie.setCaption("");
		pie.setChart_type("pie");
		pie.setXaxys("Eixo de X");
		pie.setYaxys("Eixo de Y");
		pie.setUrl("#");
		pie.addColor("#e7e2a0").addColor("#ef96ba").addColor("#7f952d").addColor("#b0dc27");

		column.setCaption("");
		column.setChart_type("column");
		column.setXaxys("Eixo de X");
		column.setYaxys("Eixo de Y");
		column.setUrl("#");
		column.addColor("#e35419").addColor("#94bf6a").addColor("#cbb308").addColor("#450d0f");

	}
		
	@Override
	public void render(){
		



		circlestatbox_1.addField(circlestatbox_1_title);
		circlestatbox_1.addField(circlestatbox_1_lbl);
		circlestatbox_1.addField(circlestatbox_1_val);
		circlestatbox_1.addField(circlestatbox_1_desc);
		circlestatbox_1.addField(circlestatbox_1_url);
		circlestatbox_1.addField(circlestatbox_1_bg);

		quickbuttonbox_1.addField(quickbuttonbox_1_title);
		quickbuttonbox_1.addField(quickbuttonbox_1_val);
		quickbuttonbox_1.addField(quickbuttonbox_1_url);
		quickbuttonbox_1.addField(quickbuttonbox_1_bg);
		quickbuttonbox_1.addField(quickbuttonbox_1_icn);

		smallbox_1.addField(smallbox_1_title);
		smallbox_1.addField(smallbox_1_val);
		smallbox_1.addField(smallbox_1_url);
		smallbox_1.addField(smallbox_1_lbl);
		smallbox_1.addField(smallbox_1_bg);
		smallbox_1.addField(smallbox_1_icn);

		statbox_1.addField(statbox_1_title);
		statbox_1.addField(statbox_1_val);
		statbox_1.addField(statbox_1_txt);
		statbox_1.addField(statbox_1_url);
		statbox_1.addField(statbox_1_bg);
		statbox_1.addField(statbox_1_icn);

		form_1.addField(data_saida);

		form_1.addButton(btn_pesquisar);
		this.addToPage(line);
		this.addToPage(pie);
		this.addToPage(column);
		this.addToPage(circlestatbox_1);
		this.addToPage(quickbuttonbox_1);
		this.addToPage(smallbox_1);
		this.addToPage(statbox_1);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		circlestatbox_1_title.setValue(model);
		circlestatbox_1_lbl.setValue(model);
		circlestatbox_1_val.setValue(model);
		circlestatbox_1_desc.setValue(model);
		circlestatbox_1_url.setValue(model);
		circlestatbox_1_bg.setValue(model);
		quickbuttonbox_1_val.setValue(model);
		smallbox_1_title.setValue(model);
		smallbox_1_val.setValue(model);
		smallbox_1_url.setValue(model);
		smallbox_1_lbl.setValue(model);
		smallbox_1_bg.setValue(model);
		smallbox_1_icn.setValue(model);
		statbox_1_title.setValue(model);
		statbox_1_val.setValue(model);
		statbox_1_txt.setValue(model);
		statbox_1_url.setValue(model);
		statbox_1_bg.setValue(model);
		data_saida.setValue(model);	

		line.loadModel(((Dashboad) model).getLine());
		pie.loadModel(((Dashboad) model).getPie());
		column.loadModel(((Dashboad) model).getColumn());
		}
}
