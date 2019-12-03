package nosi.webapps.imac_solution.pages.file;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.uploadfile.UploadFile;
import nosi.webapps.imac_soluction.dao.Product;
import nosi.webapps.imac_solution.pages.file.RegistarProduct.TableProduct;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;

import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;


/*----#end-code----*/
		
public class FileController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		File model = new File();
		model.load();
		FileView view = new FileView();
		
		
		/*----#start-code(index)----*/
		
		List<TableProduct> tableProducts = new ArrayList<>();
		
		new Product().findAll().forEach(p->{			
			TableProduct tp = new TableProduct();
			tp.setDescription(p.getDescription());
			tp.setReference(p.getReference());
			tp.setMostrar(Core.getLinkFileByUuid(p.getFileId()));
			tableProducts.add(tp );
		});
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSave() throws  IllegalAccessException, IOException{
		RegistarProduct model = new RegistarProduct();
		model.load();
		/*----#start-code(save)----*/
	   if(!model.validate()) {
			model.saveTempFile();
			return this.forward("purchase_manager","Product","index",this.queryString());
		}else {
			try {
				Product p = new Product();
				p.setDescription(model.getDescription());
				p.setReference(model.getReference());
				p.setFileId(Core.saveFileNGetUuid(model.getFile()));
				p = p.insert();
				model.deleteTempFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		/*----#end-code----*/
		return this.redirect("purchase_manager","Product","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
