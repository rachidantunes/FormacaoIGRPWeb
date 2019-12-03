/*-------------------------*/

/*Create View*/
package nosi.webapps.gestao_compra.pages.tbl_productlist;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Tbl_productListView extends View {

	public Field id;
	public Field description;
	public Field reference;
	public Field id_user;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_new;
	public IGRPButton btn_update;
	public IGRPButton btn_delete;

	public Tbl_productListView(){

		this.setPageTitle("");
			
		table_1 = new IGRPTable("table_1","Listar product");

		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("tag","id").add("name","p_id").add("type","hidden").add("isAutoincrement","true").add("java-type","int").add("required","true");
		
		description = new TextField(model,"description");
		description.setLabel(gt("description"));
		description.propertie().add("name","p_description").add("maxlength","255").add("disabled","false").add("readonly","false").add("required","true").add("type","text").add("placeholder",gt("")).add("java-type","String").add("tag","description");
		
		reference = new TextField(model,"reference");
		reference.setLabel(gt("reference"));
		reference.propertie().add("name","p_reference").add("maxlength","100").add("disabled","false").add("readonly","false").add("required","false").add("type","text").add("placeholder",gt("")).add("java-type","String");
		
		id_user = new NumberField(model,"id_user");
		id_user.setLabel(gt("id user"));
		id_user.propertie().add("name","p_id_user").add("maxlength","11").add("disabled","false").add("readonly","false").add("required","false").add("type","number").add("placeholder",gt("")).add("java-type","int");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_new = new IGRPButton("New","gestao_compra","Tbl_productList","new","modal|refresh","success|fa-plus","","");
		btn_new.propertie.add("rel","new").add("action-id","147").add("crud_op","addNew").add("type","specific");

		btn_update = new IGRPButton("Update","gestao_compra","Tbl_productList","update","mpsubmit|refresh","warning|fa-pencil","","");
		btn_update.propertie.add("rel","update").add("action-id","147").add("crud_op","edit").add("type","form");

		btn_delete = new IGRPButton("Delete","gestao_compra","Tbl_productList","delete","confirm","danger|fa-trash","","");
		btn_delete.propertie.add("rel","delete").add("action-id","148").add("crud_op","delete").add("type","form");

		
	}
		
	@Override
	public void render(){
		

		table_1.addField(id);
		table_1.addField(description);
		table_1.addField(reference);
		table_1.addField(id_user);

		toolsbar_1.addButton(btn_new);
		table_1.addButton(btn_update);
		table_1.addButton(btn_delete);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		id.setValue(model);
		description.setValue(model);
		reference.setValue(model);
		id_user.setValue(model);	

		table_1.loadModel(((Tbl_productList) model).getTable_1());
		}
}
/*-------------------------*/