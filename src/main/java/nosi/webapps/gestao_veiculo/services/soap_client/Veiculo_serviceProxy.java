package nosi.webapps.gestao_veiculo.services.soap_client;

public class Veiculo_serviceProxy implements nosi.webapps.gestao_veiculo.services.soap_client.Veiculo_service {
  private String _endpoint = null;
  private nosi.webapps.gestao_veiculo.services.soap_client.Veiculo_service veiculo_service = null;
  
  public Veiculo_serviceProxy() {
    _initVeiculo_serviceProxy();
  }
  
  public Veiculo_serviceProxy(String endpoint) {
    _endpoint = endpoint;
    _initVeiculo_serviceProxy();
  }
  
  private void _initVeiculo_serviceProxy() {
    try {
      veiculo_service = (new nosi.webapps.gestao_veiculo.services.soap_client.SoapVeiculoServiceServiceLocator()).getveiculo_servicePort();
      if (veiculo_service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)veiculo_service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)veiculo_service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (veiculo_service != null)
      ((javax.xml.rpc.Stub)veiculo_service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo_service getVeiculo_service() {
    if (veiculo_service == null)
      _initVeiculo_serviceProxy();
    return veiculo_service;
  }
  
  public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo update_veiculo(nosi.webapps.gestao_veiculo.services.soap_client.Veiculo arg0) throws java.rmi.RemoteException{
    if (veiculo_service == null)
      _initVeiculo_serviceProxy();
    return veiculo_service.update_veiculo(arg0);
  }
  
  public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo veiculo_by_id(int id) throws java.rmi.RemoteException{
    if (veiculo_service == null)
      _initVeiculo_serviceProxy();
    return veiculo_service.veiculo_by_id(id);
  }
  
  public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo[] list_veiculos() throws java.rmi.RemoteException{
    if (veiculo_service == null)
      _initVeiculo_serviceProxy();
    return veiculo_service.list_veiculos();
  }
  
  public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo create_veiculo(nosi.webapps.gestao_veiculo.services.soap_client.Veiculo arg0) throws java.rmi.RemoteException{
    if (veiculo_service == null)
      _initVeiculo_serviceProxy();
    return veiculo_service.create_veiculo(arg0);
  }
  
  public boolean delete_veiculo(int id) throws java.rmi.RemoteException{
    if (veiculo_service == null)
      _initVeiculo_serviceProxy();
    return veiculo_service.delete_veiculo(id);
  }
  
  
}