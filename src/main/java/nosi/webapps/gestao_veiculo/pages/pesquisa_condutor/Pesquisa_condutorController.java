package nosi.webapps.gestao_veiculo.pages.pesquisa_condutor;

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
import java.util.ArrayList;
import java.util.List;
/*----#end-code----*/
		
public class Pesquisa_condutorController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Pesquisa_condutor model = new Pesquisa_condutor();
		model.load();
		Pesquisa_condutorView view = new Pesquisa_condutorView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadCondutor(Core.query(null,"SELECT nome as nome,'Dolor accusantium sit anim ape' as bi,'Amet aliqua totam accusantium' as n_carta_conducao,'hidden-615f_dc0b' as id_condutor "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		List<Condutor> list = new Condutor().find()
				.where("nome","like",Core.isNotNull(model.getNome_search())?"%"+model.getNome_search()+"%":"")
				.orWhere("bi","=",Core.isNotNull(model.getBi_search())?model.getBi_search():"")
				.all();
		List<nosi.webapps.gestao_veiculo.pages.pesquisa_condutor.Pesquisa_condutor.Condutor> condutores = new ArrayList<>();
		for(Condutor c:list) {
			nosi.webapps.gestao_veiculo.pages.pesquisa_condutor.Pesquisa_condutor.Condutor condutor = new nosi.webapps.gestao_veiculo.pages.pesquisa_condutor.Pesquisa_condutor.Condutor();
			condutor.setBi(c.getBi());
			condutor.setNome(c.getNome());
			condutor.setId_condutor(c.getId());
			condutor.setN_carta_conducao(c.getCarta_conducao());
			condutores.add(condutor);
		}
		model.setCondutor(condutores);
//		model.loadCondutor(Core.query("SELECT nome,bi,carta_conducao as n_carta_conducao ,id as id_condutor from tbl_condutor"));
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionPesquisar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Pesquisa_condutor model = new Pesquisa_condutor();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("gestao_veiculo","Registar_movimento","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(pesquisar)----*/
		return this.forward("gestao_veiculo","Pesquisa_condutor","index",this.queryString());
		
		/*----#end-code----*/
			
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
