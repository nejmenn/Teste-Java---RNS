package com.rns.testes.java.service;

import com.rns.testes.java.model.ProdutoFilial;

public interface IProdutoFilialService extends IGenericService<ProdutoFilial, Long> {
    void transferirProdutoFilial(Long produtoFilialDestinatarioId, ProdutoFilial produtoFilial);
}
