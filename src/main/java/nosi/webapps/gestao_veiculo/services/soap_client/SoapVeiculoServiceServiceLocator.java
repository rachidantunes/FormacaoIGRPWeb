/**
 * SoapVeiculoServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nosi.webapps.gestao_veiculo.services.soap_client;

public class SoapVeiculoServiceServiceLocator extends org.apache.axis.client.Service implements nosi.webapps.gestao_veiculo.services.soap_client.SoapVeiculoServiceService {

    public SoapVeiculoServiceServiceLocator() {
    }


    public SoapVeiculoServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SoapVeiculoServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for veiculo_servicePort
    private java.lang.String veiculo_servicePort_address = "http://localhost:8080/IGRP-Template/SoapVeiculoServiceService";

    public java.lang.String getveiculo_servicePortAddress() {
        return veiculo_servicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String veiculo_servicePortWSDDServiceName = "veiculo_servicePort";

    public java.lang.String getveiculo_servicePortWSDDServiceName() {
        return veiculo_servicePortWSDDServiceName;
    }

    public void setveiculo_servicePortWSDDServiceName(java.lang.String name) {
        veiculo_servicePortWSDDServiceName = name;
    }

    public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo_service getveiculo_servicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(veiculo_servicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getveiculo_servicePort(endpoint);
    }

    public nosi.webapps.gestao_veiculo.services.soap_client.Veiculo_service getveiculo_servicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            nosi.webapps.gestao_veiculo.services.soap_client.SoapVeiculoServiceServiceSoapBindingStub _stub = new nosi.webapps.gestao_veiculo.services.soap_client.SoapVeiculoServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getveiculo_servicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setveiculo_servicePortEndpointAddress(java.lang.String address) {
        veiculo_servicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (nosi.webapps.gestao_veiculo.services.soap_client.Veiculo_service.class.isAssignableFrom(serviceEndpointInterface)) {
                nosi.webapps.gestao_veiculo.services.soap_client.SoapVeiculoServiceServiceSoapBindingStub _stub = new nosi.webapps.gestao_veiculo.services.soap_client.SoapVeiculoServiceServiceSoapBindingStub(new java.net.URL(veiculo_servicePort_address), this);
                _stub.setPortName(getveiculo_servicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("veiculo_servicePort".equals(inputPortName)) {
            return getveiculo_servicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://formacao.igrpweb.cv", "SoapVeiculoServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://formacao.igrpweb.cv", "veiculo_servicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("veiculo_servicePort".equals(portName)) {
            setveiculo_servicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
