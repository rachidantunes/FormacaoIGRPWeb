/*-------------------------*/

/*Create View*/
package nosi.webapps.gestao_compra.pages.tbl_storeform;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Tbl_storeFormView extends View {

	public Field id;
	public Field description;
	public Field location;
	public Field id_user;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_list;
	public IGRPButton btn_save;

	public Tbl_storeFormView(){

		this.setPageTitle("");
			
		form_1 = new IGRPForm("form_1","Registar store");

		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("tag","id").add("name","p_id").add("type","hidden").add("isAutoincrement","true").add("java-type","int").add("required","true");
		
		description = new TextField(model,"description");
		description.setLabel(gt("description"));
		description.propertie().add("name","p_description").add("maxlength","255").add("disabled","false").add("readonly","false").add("required","true").add("type","text").add("placeholder",gt("")).add("java-type","String").add("tag","description");
		
		location = new TextField(model,"location");
		location.setLabel(gt("location"));
		location.propertie().add("name","p_location").add("maxlength","255").add("disabled","false").add("readonly","false").add("required","false").add("type","text").add("placeholder",gt("")).add("java-type","String");
		
		id_user = new NumberField(model,"id_user");
		id_user.setLabel(gt("id user"));
		id_user.propertie().add("name","p_id_user").add("maxlength","11").add("disabled","false").add("readonly","false").add("required","false").add("type","number").add("placeholder",gt("")).add("java-type","int");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_list = new IGRPButton("List","gestao_compra","Tbl_storeForm","list","_self","default|fa-list","","");
		btn_list.propertie.add("rel","list").add("action-id","145").add("crud_op","list").add("type","specific");

		btn_save = new IGRPButton("Save","gestao_compra","Tbl_storeForm","save","submit","primary|fa-save","","");
		btn_save.propertie.add("rel","save").add("action-id","144").add("crud_op","save").add("type","specific");

		
	}
		
	@Override
	public void render(){
		

		form_1.addField(id);
		form_1.addField(description);
		form_1.addField(location);
		form_1.addField(id_user);

		toolsbar_1.addButton(btn_list);
		toolsbar_1.addButton(btn_save);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		id.setValue(model);
		description.setValue(model);
		location.setValue(model);
		id_user.setValue(model);	

		}
}
/*-------------------------*/