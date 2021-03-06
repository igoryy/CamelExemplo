package br.com.igor.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.http4.HttpMethods;
import org.apache.camel.impl.DefaultCamelContext;

public class RotaPedidos {

	public static void main(String[] args) throws Exception {
		
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from("file:pedidos?delay=5s&noop=true")
				
				.multicast()
					.to("direct:http")
					.to("direct:soap");
					
					from("direct:http")
					.routeId("rota-http")
					.setProperty("pedidoId", xpath("/pedido/id/text()"))
					.setProperty("clienteId", xpath("/pedido/pagamento/email-titular/text()")).split()
						
					.xpath("/pedido/itens/item").log("${id}")
					.setProperty("ebookId", xpath("/item/livro/codigo/text()")).filter()
						.xpath("/item/formato[text()='EBOOK']").log("${id}").marshal().xmljson()
						.setHeader(Exchange.HTTP_METHOD, HttpMethods.GET)
						.setHeader(Exchange.HTTP_QUERY, simple(
								"ebookId=${property.ebookId}&pedidoId=${property.pedidoId}&clienteId=${property.clienteId}"))
						.to("http4://localhost:8080/webservices/ebook/item");
			
			
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
