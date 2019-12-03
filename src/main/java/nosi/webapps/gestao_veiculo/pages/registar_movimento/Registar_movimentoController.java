package nosi.webapps.gestao_veiculo.pages.registar_movimento;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import java.sql.Timestamp;

import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.gestao_veiculo.dao.Movimento;
import nosi.webapps.gestao_veiculo.dao.Veiculo;
import nosi.webapps.gestao_veiculo.services.soap_client.SoapVeiculoClient;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/*----#end-code----*/
		
public class Registar_movimentoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Registar_movimento model = new Registar_movimento();
		model.load();
		Registar_movimentoView view = new Registar_movimentoView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.veiculo.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
//		new Veiculo().findAll().stream().collect(Collectors.toMap(v->v.getId(), v->v.getMatricula()))
//		Map<Integer, String> veiculos = new HasMap<>();
//		List<Veiculo> list = new Veiculo().findAll();
//		for(Veiculo v:list) {
//			veiculos.put(v.getId(),v.getMatricula() + v.getMarca());
//		}
		SoapVeiculoClient soap = new SoapVeiculoClient();
		nosi.webapps.gestao_veiculo.services.soap_client.Veiculo veiculo = new nosi.webapps.gestao_veiculo.services.soap_client.Veiculo();
		veiculo.setCor("preto");
		veiculo.setMarca("BMW");
		veiculo.setMatricula("ST-20-TY");
		System.out.println(soap.createVeiculo(veiculo ));
		view.veiculo.setValue(new Veiculo().findAll().stream().collect(Collectors.toMap(v->v.getId(), v->Core.gt(v.getMatricula()+" "+v.getMarca()))));
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSave() throws IOException, IllegalArgumentException, IllegalAccessException{
		Registar_movimento model = new Registar_movimento();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("gestao_veiculo","Registar_movimento","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(save)----*/
		if(model.validate()) {
			Movimento m = new Movimento();
			m.setKm_saida(model.getKm_saida());
			m.setData_saida(Core.StringToTimestamp(model.getData_saida(), model.getHora_saida()));
			m.setCondutor_id(model.getId_condutor());
			m.setVeiculo_id(model.getVeiculo());
			m = m.insert();
			System.out.println(m);
		}
		/*----#end-code----*/
		return this.redirect("gestao_veiculo","Registar_movimento","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
