package br.com.igor.camel;

import br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP;

public class GetCep {

	public ConsultaCEP getCep(String cep) {
		
		ConsultaCEP request = new ConsultaCEP();
		
		request.setCep(cep);
		
		return request;
	}
}
