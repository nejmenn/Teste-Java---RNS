package com.rns.testes.java.controller;

import com.rns.testes.java.dto.ProdutoDto;
import com.rns.testes.java.dto.mapper.ProdutoMapper;
import com.rns.testes.java.model.Produto;
import com.rns.testes.java.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping
public class ProdutoController {

    private static final String BASE_URL = "produto/";

    @Autowired
    IProdutoService service;

    @GetMapping(value = BASE_URL + "find-all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<List<Produto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = BASE_URL + "find-by-id", produces = MediaType.APPLICATION_JSON_VALUE, params = {"id"})
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<Produto> findById(@RequestParam(name = "id") String id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping(value = BASE_URL + "update", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<Produto> update(@RequestBody ProdutoDto dto) {
        return ResponseEntity.ok(service.update(ProdutoMapper.INSTANCE.dtoToEntity(dto)));
    }

    @PostMapping(value = BASE_URL + "insert", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<Produto> insert(@RequestBody ProdutoDto dto) {
        return ResponseEntity.ok(service.save(ProdutoMapper.INSTANCE.dtoToEntity(dto)));
    }

    @DeleteMapping(value = BASE_URL + "delete", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void delete(@RequestParam(name = "id") String id) {
        service.delete(id);
    }

}
