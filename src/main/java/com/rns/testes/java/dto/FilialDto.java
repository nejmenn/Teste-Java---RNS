package com.rns.testes.java.dto;

import com.rns.testes.java.enums.EnumTipoFilial;
import com.rns.testes.java.model.GenericEntity;
import lombok.Data;

@Data
public class FilialDto extends GenericEntity<Long> {

    private Long id;
    private String razaoSocial;
    private String cnpj;
    private String endereco;
    private EnumTipoFilial tipoFilial;

}
