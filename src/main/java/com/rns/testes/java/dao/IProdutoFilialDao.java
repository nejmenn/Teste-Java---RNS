package com.rns.testes.java.dao;

import com.rns.testes.java.model.ProdutoFilial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProdutoFilialDao extends JpaRepository<ProdutoFilial, Long> {
    List<ProdutoFilial> findByProdutoIdAndFilialId(String produtoId, Long filialId);
}
