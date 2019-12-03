package nosi.webapps.gestao_veiculo.services.soap_client;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

public class SoapVeiculoClient {

	private Veiculo_service veiculoService;
	
	public SoapVeiculoClient() {
		this.veiculoService = new Veiculo_serviceProxy();
	}
	
	public List<Veiculo> getVeiculos(){
		List<Veiculo> veiculos = null;
		try {
			veiculos = Arrays.asList(this.veiculoService.list_veiculos());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return veiculos;
	}
	
	
	public Veiculo createVeiculo(Veiculo veiculo){
		try {
			return this.veiculoService.create_veiculo(veiculo);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Veiculo updateVeiculo(Veiculo veiculo){
		try {
			return this.veiculoService.update_veiculo(veiculo);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Veiculo veiculoById(Integer id){
		try {
			return this.veiculoService.veiculo_by_id(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean deleteVeiculo(Integer id){
		try {
			return this.veiculoService.delete_veiculo(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
}

