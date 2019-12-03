/*-------------------------*/

/*Create Controller*/

package nosi.webapps.gestao_compra.pages.tbl_storelist;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;


/*----#start-code(packages_import)----*/


/*----#end-code----*/


public class Tbl_storeListController extends Controller {
		

	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Tbl_storeList model = new Tbl_storeList();
		model.load();
		Tbl_storeListView view = new Tbl_storeListView();
		/*----#start-code(index)----*/
		QueryInterface query = Core.query("gestao_compra_postgresql_1","SELECT id as id,description as description,location as location,id_user as id_user FROM public.tbl_store");
		model.loadTable_1(query);
		
		view.id.setParam(true);
		/*----#end-code----*/
		view.setModel(model);
		
		view.id.setParam(true);
		return this.renderView(view);
	}


	public Response actionNew() throws IOException, IllegalArgumentException, IllegalAccessException{
		/*----#start-code(new)----*/
		
		/*----#end-code----*/
		return this.redirect("gestao_compra","Tbl_storeForm","index");
	}

	public Response actionUpdate() throws IOException, IllegalArgumentException, IllegalAccessException{
		/*----#start-code(update)----*/
		this.addQueryString("target","_blank");
		this.addQueryString("isEdit","true");
		this.addQueryString("p_id",Core.getParam("p_id"));
		/*----#end-code----*/
		return this.redirect("gestao_compra","Tbl_storeForm","index",this.queryString());
	}

	public Response actionDelete() throws IOException, IllegalArgumentException, IllegalAccessException{
		Tbl_storeList.Table_1 model = new Tbl_storeList.Table_1();
		/*----#start-code(delete)----*/
		ResultSet r = Core.delete("gestao_compra_postgresql_1","public","tbl_store").where("id=:id")
				.addInt("id",Core.getParamInt("p_id"))
				.execute();
		if(!r.hasError())
			Core.setMessageSuccess();
		else
			Core.setMessageError();
		/*----#end-code----*/
		return this.redirect("gestao_compra","Tbl_storeList","index");
	}
}
