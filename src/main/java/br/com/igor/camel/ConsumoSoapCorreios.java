package br.com.igor.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.impl.DefaultCamelContext;

public class ConsumoSoapCorreios {
	
	
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				
				from("direct:start")
					.setBody(constant("03576160"))
					.bean(GetCep.class)
					.setHeader(CxfConstants.OPERATION_NAME, constant("ConsultaCEP"))
					.setHeader(CxfConstants.OPERATION_NAMESPACE, constant("http://cliente.bean.master.sigep.bsb.correios.com.br/"))
					
					
					.to("cxf://https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente"
							+"?serviceClass=br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente"
							  + "&wsdlURL=/wsdl/correios.wsdl")
					.log("${body}");
					
			}
		});
		
		context.start();
		Thread.sleep(20000);
		context.stop();
	}

}
