package nosi.webapps.imac_solution.pages.file;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class FileView extends View {

	public Field file1;
	public Field descricao;
	public Field file2;
	public IGRPForm form_1;
	public IGRPFormList formlist_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_save;

	public FileView(){

		this.setPageTitle("File");
			
		form_1 = new IGRPForm("form_1","");

		formlist_1 = new IGRPFormList("formlist_1","");

		file1 = new FileField(model,"file1");
		file1.setLabel(gt("File"));
		file1.propertie().add("name","p_file1").add("type","file").add("accept","").add("targetrend","").add("multiple","true").add("rendvalue","false").add("maxlength","250").add("required","false").add("disabled","false");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descricao"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		file2 = new FileField(model,"file2");
		file2.setLabel(gt("File"));
		file2.propertie().add("name","p_file2").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","false").add("disabled","false").add("desc","true");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_save = new IGRPButton("Save","imac_solution","File","save","submit","primary|fa-save","","");
		btn_save.propertie.add("type","specific").add("rel","save");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(file1);

		formlist_1.addField(descricao);
		formlist_1.addField(file2);


		toolsbar_1.addButton(btn_save);
		this.addToPage(form_1);
		this.addToPage(formlist_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		file1.setValue(model);
		descricao.setValue(model);
		file2.setValue(model);	

		formlist_1.loadModel(((File) model).getFormlist_1());
		}
}
