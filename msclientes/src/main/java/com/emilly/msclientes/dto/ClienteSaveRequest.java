package com.emilly.msclientes.dto;

import com.emilly.msclientes.domain.Cliente;
import lombok.Data;

@Data
public class ClienteSaveRequest {
//vai salvar nosso cliente na base do banco de dados e vai converter para dto no clienteresource
    private String cpf;
    private String nome;
    private  Integer idade;
    public Cliente toModel(){
        return new Cliente(cpf, nome, idade);
    }
}
