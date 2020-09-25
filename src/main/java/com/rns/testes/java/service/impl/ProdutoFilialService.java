package com.rns.testes.java.service.impl;

import com.rns.testes.java.dao.IProdutoFilialDao;
import com.rns.testes.java.model.ProdutoFilial;
import com.rns.testes.java.service.AbstractGenericServicePersistence;
import com.rns.testes.java.service.IProdutoFilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoFilialService extends AbstractGenericServicePersistence<IProdutoFilialDao, ProdutoFilial, Long> implements IProdutoFilialService {

    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private FilialService filialService;

    @Override
    public ProdutoFilial save(ProdutoFilial produtoFilial) {

        return super.save(produtoFilial);
    }

    @Override
    public void transferirProdutoFilial(Long produtoFilialDestinatarioId, ProdutoFilial produtoFilial) {

    }
}
