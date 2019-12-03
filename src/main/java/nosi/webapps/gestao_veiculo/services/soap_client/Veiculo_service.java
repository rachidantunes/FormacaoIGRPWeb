/**
 * Veiculo_service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nosi.webapps.gestao_veiculo.services.soap_client;

public interface Veiculo_service extends java.rmi.Remote {
    public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo update_veiculo(nosi.webapps.gestao_veiculo.services.soap_client.Veiculo arg0) throws java.rmi.RemoteException;
    public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo veiculo_by_id(int id) throws java.rmi.RemoteException;
    public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo[] list_veiculos() throws java.rmi.RemoteException;
    public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo create_veiculo(nosi.webapps.gestao_veiculo.services.soap_client.Veiculo arg0) throws java.rmi.RemoteException;
    public boolean delete_veiculo(int id) throws java.rmi.RemoteException;
}
