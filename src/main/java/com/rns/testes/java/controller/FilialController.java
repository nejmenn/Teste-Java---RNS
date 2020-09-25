package com.rns.testes.java.controller;

import com.rns.testes.java.dto.FilialDto;
import com.rns.testes.java.dto.mapper.FilialMapper;
import com.rns.testes.java.enums.EnumTipoFilial;
import com.rns.testes.java.model.Filial;
import com.rns.testes.java.service.IFilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping
public class FilialController {

    private static final String BASE_URL = "filial/";

    @Autowired
    IFilialService service;

    @GetMapping(value = BASE_URL + "find-all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<List<Filial>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = BASE_URL + "find-by-id", produces = MediaType.APPLICATION_JSON_VALUE, params = {"id"})
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<Filial> findById(@RequestParam(name = "id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping(value = BASE_URL + "update", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<Filial> update(@RequestBody FilialDto dto) {
        return ResponseEntity.ok(service.update(FilialMapper.INSTANCE.dtoToEntity(dto)));
    }

    @PostMapping(value = BASE_URL + "insert", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<Filial> insert(@RequestBody FilialDto dto) {
        return ResponseEntity.ok(service.save(FilialMapper.INSTANCE.dtoToEntity(dto)));
    }

    @DeleteMapping(value = BASE_URL + "delete", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void delete(@RequestParam(name = "id") Long id) {
        service.delete(id);
    }

    @GetMapping(value = BASE_URL + "tipo/find-all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<List<EnumTipoFilial>> findAllEnumTipoFilial() {
        return ResponseEntity.ok(EnumTipoFilial.getAll());
    }
}
