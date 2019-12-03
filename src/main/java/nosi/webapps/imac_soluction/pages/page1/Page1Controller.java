package nosi.webapps.imac_soluction.pages.page1;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


import java.util.Arrays;
import java.util.List;


import nosi.core.xml.XMLWritter;
import nosi.webapps.imac_soluction.dao.Product;
import nosi.webapps.imac_soluction.dao.Store;
/*----#end-code----*/
		
public class Page1Controller extends Controller {
	
	
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Page1 model = new Page1();
		model.load();
		Page1View view = new Page1View();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadFormlist_1(Core.query(null,"SELECT '2' as produtos,'88' as preco,'216' as quantidade,'Doloremque deserunt consectetur unde omnis' as total "));
		view.produtos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
	
		
		Product product = new Product();
		product.setDescription("Arroz");
		product.setReference("ar");
		product = product.insert();
		Core.setMessageInfo("Id Produto="+product.getId());
		
		Store store = new Store();
		store.setDescription("Calu");
		store = store.insert();
		Core.setMessageInfo("Id Loja="+store.getId());
 		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSave() throws IOException, IllegalArgumentException, IllegalAccessException{
		Page1 model = new Page1();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("imac_soluction","Page1","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(save)----*/
		
		
		/*----#end-code----*/
		return this.redirect("imac_soluction","Page1","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/
	public Response actionGetPreco(){
		List<Double> precos = Arrays.asList(new Double[]{15.0,355.0,300.0});
		int prod = Core.getParamInt("p_produtos").intValue();
		XMLWritter xml = new XMLWritter();
		xml.startElement("content");
		xml.setElement("preco", ""+precos.get(prod));
		xml.endElement();
      String content = xml.toString();
      return this.renderView(content);
    }

	public Response actionGetTotal(){
		double preco = Core.getParamDouble("p_preco").doubleValue();
		double quantidade = Core.getParamDouble("p_quantidade").doubleValue();
		XMLWritter xml = new XMLWritter();
		xml.startElement("content");
		xml.setElement("total", ""+(quantidade*preco));
		xml.endElement();
      String content = xml.toString();
      return this.renderView(content);
    }
/*----#end-code----*/
}
