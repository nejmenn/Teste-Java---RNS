package com.rns.testes.java.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUTO")
@Data
public class Produto extends GenericEntity<String>{

    @Id
    private String id;

    @Column
    private String nome;



}
