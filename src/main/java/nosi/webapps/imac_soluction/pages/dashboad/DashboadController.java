package nosi.webapps.imac_soluction.pages.dashboad;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/

import nosi.webapps.gestao_veiculo.dao.Movimento;

/*----#end-code----*/
		
public class DashboadController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dashboad model = new Dashboad();
		model.load();
		model.setCirclestatbox_1_title("Circle Box Title");
		model.setCirclestatbox_1_lbl("percent");
		model.setCirclestatbox_1_val("12.7");
		model.setCirclestatbox_1_desc("Some Text Here");
		model.setCirclestatbox_1_url("http://www.example.com");
		model.setCirclestatbox_1_bg("cp-cyan");
		model.setSmallbox_1_title("Small Box Title");
		model.setSmallbox_1_val("816");
		model.setSmallbox_1_url("http://www.example.com");
		model.setSmallbox_1_lbl("View Details");
		model.setSmallbox_1_bg("cp-cyan");
		model.setSmallbox_1_icn("fa-check");
		model.setStatbox_1_title("Box Title");
		model.setStatbox_1_val("884");
		model.setStatbox_1_txt("Read More...");
		model.setStatbox_1_url("http://www.example.com");
		model.setStatbox_1_bg("cp-cyan");
		model.setStatbox_1_icn("fa-check");
		model.setQuickbuttonbox_1_title("Box Title");
		model.setQuickbuttonbox_1_val("170");
		model.setQuickbuttonbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		model.setQuickbuttonbox_1_bg("cp-cyan");
		model.setQuickbuttonbox_1_icn("fa-check");
		DashboadView view = new DashboadView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.line.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.pie.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.column.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		model.setCirclestatbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		model.setCirclestatbox_1_val("12.7");
		model.setQuickbuttonbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		model.setQuickbuttonbox_1_val("170");
		model.setSmallbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		model.setSmallbox_1_val("816");
		model.setStatbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		model.setStatbox_1_val("884");
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		String total = ""+(new Movimento().find()
				.where("date(data_saida)","data_saida","=", Core.ToDate(model.getData_saida(), "dd-mm-yyyy", "yyyy-mm-dd"))
				.getCount());
		model.setCirclestatbox_1_val(total);
		model.setQuickbuttonbox_1_val(total);
		model.setSmallbox_1_val(total);
		model.setStatbox_1_val(total);
		QueryInterface query1 = Core.query("SELECT to_char(m.data_saida,'DD') as EixoX, v.matricula as EixoY, count(*) as EixoZ")
				.from("tbl_movimento as m")
				.innerJoin("tbl_veiculo as v", "v.id", "m.veiculo_id")
				.where("date(data_saida)","data_saida","=", Core.ToDate(model.getData_saida(), "dd-mm-yyyy", "yyyy-mm-dd"))
				.groupBy(new String[] {"v.matricula","m.data_saida"});
		QueryInterface query2 = Core.query("SELECT v.matricula as EixoX, count(*) as EixoY")
				.from("tbl_movimento as m")
				.innerJoin("tbl_veiculo as v", "v.id", "m.veiculo_id")
				.where("date(data_saida)","data_saida","=", Core.ToDate(model.getData_saida(), "dd-mm-yyyy", "yyyy-mm-dd"))
				.groupBy(new String[] {"v.matricula","m.data_saida"});
		view.line.loadQuery(query1);
		view.column.loadQuery(query1);
		view.pie.loadQuery(query2);
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionPesquisar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dashboad model = new Dashboad();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("imac_soluction","Dashboad","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(pesquisar)----*/
		return this.forward("imac_soluction","Dashboad","index",this.queryString()); 
		
		/*----#end-code----*/
			
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
