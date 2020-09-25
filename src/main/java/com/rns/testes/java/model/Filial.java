package com.rns.testes.java.model;

import com.rns.testes.java.enums.EnumTipoFilial;
import lombok.Data;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "FILIAL")
@SequenceGenerator(name = "FILIAL_SEQ", sequenceName = "FILIAL_SEQ", allocationSize = 1)
@Data
public class Filial extends GenericEntity<Long> {

    @Id
    @GeneratedValue(generator = "FILIAL_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String razaoSocial;

    @CNPJ
    @Column
    private String cnpj;

    @Column
    private String endereco;

    @Column
    private EnumTipoFilial tipoFilial;

}
