/**
 * SoapVeiculoServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nosi.webapps.gestao_veiculo.services.soap_client;

public interface SoapVeiculoServiceService extends javax.xml.rpc.Service {
    public java.lang.String getveiculo_servicePortAddress();

    public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo_service getveiculo_servicePort() throws javax.xml.rpc.ServiceException;

    public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo_service getveiculo_servicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
