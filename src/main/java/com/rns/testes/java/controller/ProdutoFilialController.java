package com.rns.testes.java.controller;

import com.rns.testes.java.model.ProdutoFilial;
import com.rns.testes.java.service.IProdutoFilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping
public class ProdutoFilialController {

    private static final String BASE_URL = "produto_filial/";

    @Autowired
    private IProdutoFilialService service;


    @GetMapping(value = BASE_URL + "find-all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<List<ProdutoFilial>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }


    @PostMapping(value = BASE_URL + "transfer-product/{produtoFilialDestinatarioId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> transferirProdutoFilial(@PathVariable Long produtoFilialDestinatarioId, @RequestBody @Valid ProdutoFilial produtoFilial) {
        service.transferirProdutoFilial(produtoFilialDestinatarioId, produtoFilial);
        return ResponseEntity.ok().build();
    }



}
