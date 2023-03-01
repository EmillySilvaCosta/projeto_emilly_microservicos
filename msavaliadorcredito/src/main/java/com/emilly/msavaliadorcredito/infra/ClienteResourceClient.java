package com.emilly.msavaliadorcredito.infra;

import com.emilly.msavaliadorcredito.domain.model.DadosCliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "msclientes", path = "/clientes") //comunicação sincrona entre microservicos
public interface ClienteResourceClient {
    @GetMapping(params = "cpf")
     ResponseEntity<DadosCliente> dadosCliente(@RequestParam("cpf") String cpf);
}
