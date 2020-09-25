package com.rns.testes.java.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUTO_FILIAL")
@Data
public class ProdutoFilial extends GenericEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long qtdTotal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "produto_id")
    @NotNull(message = "necessario um produto")
    private Produto produto;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "filial_id")
    @NotNull(message = "necessario uma filial")
    private Filial filial;


}
