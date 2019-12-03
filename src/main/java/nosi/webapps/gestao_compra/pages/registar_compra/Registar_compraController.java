package nosi.webapps.gestao_compra.pages.registar_compra;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
import nosi.webapps.gestao_compra.helpers.Compra;
import nosi.webapps.gestao_compra.helpers.Loja;
import nosi.webapps.gestao_compra.helpers.Produto;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.gestao_compra.pages.registar_compra.Registar_compra.Produtos;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


/*----#end-code----*/
		
public class Registar_compraController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Registar_compra model = new Registar_compra();
		model.load();
		Registar_compraView view = new Registar_compraView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadProdutos(Core.query(null,"SELECT '2' as produto,'108' as preco,'63' as quantidade,'Deserunt aperiam sed mollit omnis' as total "));
		view.produto.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.loja.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		view.produto.setQuery(Core.query("SELECT id,description as NAME from tbl_produto"));
		view.loja.setQuery(Core.query("SELECT id,description as NAME from tbl_loja "));
		
		
//		Produto banana = new Produto();
//		banana.setDescription("Banana");
//		banana.setId_user(Core.getCurrentUser().getId());
//		banana.insert();
//		
//		Loja calu = new Loja();
//		calu.setDescription("Calu & Angela");
//		calu.setLocation("Palmarejo");
//		calu.setId_user(Core.getCurrentUser().getId());
//		calu.insert();
//		
//	
		
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Registar_compra model = new Registar_compra();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("gestao_compra","Registar_compra","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar)----*/
		long startTime = System.currentTimeMillis();
		
		for(Produtos p:model.getProdutos()) {
			Compra compra = new Compra();
			compra.setLoja_id(model.getLoja());
			compra.setProduto_id(Core.toInt(p.getProduto().getKey()));
			compra.setQuantity(Core.toDouble(p.getQuantidade().getKey()));
			compra.setPrice(Core.toDouble(p.getPreco().getKey()));
			compra.setData_compra(Core.ToDate(model.getData_compra()));
			compra.setData_criacao(Core.getCurrentDateSql());
			compra = compra.insert();
			Core.setMessageInfo("Id="+compra.getId());
		}
		
		long endTime = System.currentTimeMillis();
		Core.setMessageInfo("Time: "+(endTime-startTime));
//		model.getProdutos().forEach(p->{
//			Compra compra = new Compra();			
//			compra.setLoja_id(model.getLoja());
//			compra.setProduto_id(Core.toInt(p.getProduto().getKey()));
//			compra.setData_compra(Core.ToDate(model.getData_compra()));
//			compra.setData_criacao(Core.getCurrentDateSql());
//			compra.setQuantity(Core.toDouble(p.getQuantidade().getKey()));
//			compra.setPrice(Core.toDouble(p.getPreco().getKey()));
//			compra.insert();
//		});
//		
		/*QueryInterface transaction = Core.transaction();
		
		
		try {
			transaction.begin();
			for(int i=0;i<model.getProdutos().size();i++) {
				
			}
			
			for(Produtos p:model.getProdutos()) {
				transaction.insert("tbl_product")
					.addString("description", p.getDescricao().getValue())
					.addString("reference", p.getReferencia().getValue())
					.addInt("id_user", Core.getCurrentUser().getId())
					.execute();
			}
			transaction.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				transaction.roolback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			try {
				transaction.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		/*----#end-code----*/
		return this.redirect("gestao_compra","Registar_compra","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/

  public Response actionCalculaTotal(){
    double preco = Core.getParamDouble("p_preco");
    double quantidade = Core.getParamDouble("p_quantidade");
    double total = preco * quantidade;
    String content = "<content><total>"+String.format("%.2f",total)+"</total></content>";
    return this.renderView(content);
  }

/*----#end-code----*/
}
