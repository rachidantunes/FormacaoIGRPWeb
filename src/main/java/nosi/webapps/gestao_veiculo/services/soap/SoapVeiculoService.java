package nosi.webapps.gestao_veiculo.services.soap;

import java.util.List;
import javax.jws.*;
import javax.xml.bind.annotation.XmlElement;
import nosi.webapps.gestao_veiculo.dao.Veiculo;

@WebService(name = "veiculo_service", targetNamespace = "http://formacao.igrpweb.cv")
public class SoapVeiculoService {

	@WebMethod(operationName = "list_veiculos")
	@WebResult(name = "veiculos")
	public List<Veiculo> getVeiculos(){
		Veiculo v = new Veiculo();
		v.setApplicationName("gestao_veiculo");
		v.setConnectionName("gestao_veiculo_postgresql_1");
		return v.findAll();
	}
	
	@WebMethod(operationName = "veiculo_by_id")
	@WebResult(name = "veiculo")
	public Veiculo getVeiculoById(@WebParam(name = "id") @XmlElement(required=true) Integer id){
		Veiculo v = new Veiculo();
		v.setApplicationName("gestao_veiculo");
		v.setConnectionName("gestao_veiculo_postgresql_1");
		return v.findOne(id);
	}
	
	@WebMethod(operationName = "create_veiculo")
	@WebResult(name = "veiculo")
	public Veiculo createVeiculo(Veiculo veiculo){
		veiculo.setApplicationName("gestao_veiculo");
		veiculo.setConnectionName("gestao_veiculo_postgresql_1");
		return veiculo.insert();
	}
	

	@WebMethod(operationName = "update_veiculo")
	@WebResult(name = "veiculo")
	public Veiculo updateVeiculo(Veiculo veiculo){
		veiculo.setApplicationName("gestao_veiculo");
		veiculo.setConnectionName("gestao_veiculo_postgresql_1");
		return veiculo.update();
	}
	
	@WebMethod(operationName = "delete_veiculo")
	@WebResult(name = "veiculo")
	public boolean deleteVeiculoById(@WebParam(name = "id") @XmlElement(required=true) Integer id){
		Veiculo v = new Veiculo();
		v.setApplicationName("gestao_veiculo");
		v.setConnectionName("gestao_veiculo_postgresql_1");
		return v.delete(id);
	}
}


