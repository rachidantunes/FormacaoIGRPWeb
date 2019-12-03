/*-------------------------*/

/*Create Controller*/

package nosi.webapps.gestao_compra.pages.tbl_storeform;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;


/*----#start-code(packages_import)----*/


/*----#end-code----*/


public class Tbl_storeFormController extends Controller {
		

	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Tbl_storeForm model = new Tbl_storeForm();
		model.load();
		
		Tbl_storeFormView view = new Tbl_storeFormView();
		/*----#start-code(index)----*/
		String isEdit = Core.getParam("isEdit");;
 			
		if(Core.isNotNull(isEdit)) {
		QueryInterface query = Core.query("gestao_compra_postgresql_1","SELECT id as id,description as description,location as location,id_user as id_user FROM public.tbl_store")
				.where("id=:id")
				.addInt("id",model.getId());
		model.load(query);
		view.btn_save.setLink("save&isEdit=true");
		}
		/*----#end-code----*/
		view.setModel(model);
		
		return this.renderView(view);
	}


	public Response actionList() throws IOException, IllegalArgumentException, IllegalAccessException{
		/*----#start-code(list)----*/
		
		/*----#end-code----*/
		return this.redirect("gestao_compra","Tbl_storeList","index");
	}

	public Response actionSave() throws IOException, IllegalArgumentException, IllegalAccessException{
		Tbl_storeForm model = new Tbl_storeForm();
		model.load();
		/*----#start-code(save)----*/
		ResultSet r = null;
		
		String isEdit = Core.getParam("isEdit");;
		 	
		if(Core.isNull(isEdit)){
			r = Core.insert("gestao_compra_postgresql_1","public","tbl_store")		
				.addString("description",model.getDescription())
				.addString("location",model.getLocation())
				.addInt("id_user",model.getId_user())
				.execute();
		}else{
			r = Core.update("gestao_compra_postgresql_1","public","tbl_store")		
				.addString("description",model.getDescription())
				.addString("location",model.getLocation())
				.addInt("id_user",model.getId_user())
				.where("id=:id")
				.addInt("id",model.getId())
				.execute();
		}
		if(!r.hasError()){
			Core.setMessageSuccess();
		 }else{
			Core.setMessageError();
			 return this.forward("gestao_compra","Tbl_storeForm","index");
		}
		/*----#end-code----*/
		return this.redirect("gestao_compra","Tbl_storeForm","index");
	}
}
