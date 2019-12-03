package nosi.webapps.gestao_veiculo.pages.dashboard;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/

import nosi.webapps.gestao_veiculo.dao.Condutor;
import nosi.webapps.gestao_veiculo.dao.Movimento;

/*----#end-code----*/
		
public class DashboardController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dashboard model = new Dashboard();
		model.load();
		model.setTotal_carro_rua_title("Total de carro na rua");
		model.setTotal_carro_rua_lbl("percent");
		model.setTotal_carro_rua_val("98.4");
		model.setTotal_carro_rua_desc("Detalhes");
		model.setTotal_carro_rua_url("");
		model.setTotal_carro_rua_bg("cp-cyan");
		model.setTotal_condutor_title("Total condutor");
		model.setTotal_condutor_val("211");
		model.setTotal_condutor_url("http://www.example.com");
		model.setTotal_condutor_lbl("View Details");
		model.setTotal_condutor_bg("cp-cyan");
		model.setTotal_condutor_icn("fa-check");
		model.setVeiculos_km_50_title("Veiculos com KM > 50.000");
		model.setVeiculos_km_50_val("926");
		model.setVeiculos_km_50_txt("Read More...");
		model.setVeiculos_km_50_url("http://www.example.com");
		model.setVeiculos_km_50_bg("cp-cyan");
		model.setVeiculos_km_50_icn("fa-check");
		model.setTotal_condutor_rua_title("Total condutor na rua");
		model.setTotal_condutor_rua_val("337");
		model.setTotal_condutor_rua_url(Core.getIGRPLink("your app","your page","your action"));
		model.setTotal_condutor_rua_bg("cp-cyan");
		model.setTotal_condutor_rua_icn("fa-check");
		DashboardView view = new DashboardView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.chart_evolucao.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.chart_saida_veiculo.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.char_saida_condutor.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		model.setTotal_carro_rua_url(Core.getIGRPLink("your app","your page","your action"));
		model.setTotal_carro_rua_val("98.4");
		model.setTotal_condutor_rua_url(Core.getIGRPLink("your app","your page","your action"));
		model.setTotal_condutor_rua_val("337");
		model.setTotal_condutor_url(Core.getIGRPLink("your app","your page","your action"));
		model.setTotal_condutor_val("211");
		model.setVeiculos_km_50_url(Core.getIGRPLink("your app","your page","your action"));
		model.setVeiculos_km_50_val("926");
		  ----#gen-example */
		/*----#start-code(index)----*/
		Movimento m = new Movimento();

		int total_c = Core.query("select count(*) as total from tbl_condutor").getSingleRecord().getInt("total");
		long total_carro_rua = m.find()
				.where("data_entrada is null and data_saida is not null")
//				.andWhereIsNull("data_entrada")
//				.andWhereNotNull("data_saida")
				.getCount();
		long total_condutor = new Condutor().getCount();
		long total_veiculo_km = m.find()
				.where("km_saida > 50000")
				//.where("km_saida",">", new Double(50000))
				.getCount();
		
		model.setTotal_carro_rua_val(""+total_carro_rua);
		model.setTotal_condutor_rua_val(""+total_carro_rua);
		model.setTotal_condutor_val(""+total_c);
		model.setVeiculos_km_50_val(""+total_veiculo_km);
		
		view.chart_evolucao.loadQuery(Core.query("select v.matricula as EixoX, to_char(m.data_saida,'yyyy-mm-dd') as EixoY, count(*) as EixoZ\r\n" + 
				"from tbl_veiculo v, tbl_movimento m\r\n" + 
				"where v.id=m.veiculo_id\r\n" + 
				"group by v.matricula, to_char(m.data_saida,'yyyy-mm-dd')"));
		
		view.chart_saida_veiculo.loadQuery(Core.query("select to_char(m.data_saida,'yyyy-mm-dd') as EixoX, count(*) as EixoY\r\n" + 
				"from tbl_veiculo v, tbl_movimento m\r\n" + 
				"where v.id=m.veiculo_id\r\n" + 
				"group by to_char(m.data_saida,'yyyy-mm-dd')"));
		
		view.char_saida_condutor.loadQuery(Core.query("select c.nome as EixoX,to_char(m.data_saida,'yyyy-mm-dd') as EixoY, count(*) as EixoZ\r\n" + 
				"from tbl_condutor c, tbl_movimento m\r\n" + 
				"where c.id=m.condutor_id\r\n" + 
				"group by c.nome,to_char(m.data_saida,'yyyy-mm-dd')"));
      model.setTotal_carro_rua_url(Core.getLinkReport("veiculo_na_rua").getLink());
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionReport() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dashboard model = new Dashboard();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("gestao_veiculo","Registar_movimento","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(report)----*/
		 return this.forward("gestao_veiculo","Dashboard","index",this.queryString()); 
		
		/*----#end-code----*/
			
	}
	
	public Response actionButton_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dashboard model = new Dashboard();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("gestao_veiculo","Registar_movimento","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(button_1)----*/
		
		return Core.getLinkReport("veiculo_na_rua",null);
		/*----#end-code----*/
			
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
