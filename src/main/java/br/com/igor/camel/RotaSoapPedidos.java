package br.com.igor.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class RotaSoapPedidos {
	
	public static void main(String[] args) throws Exception {
		
		CamelContext context = new DefaultCamelContext();
		
		context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				
				from("file:pedidos?noop=true")
					.to("direct:soap");
				
				
				from("direct:soap")
					.routeId("rota-soap")
					.to("xslt:pedido-para-soap.xslt")
					.log("${body}")
					.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
					.to("http4://localhost:8080/webservices/financeiro");
			}
		});
		
		context.start();
		Thread.sleep(2000);
		context.stop();

	}
}
