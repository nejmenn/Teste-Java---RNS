package com.rns.testes.java.service.impl;

import com.rns.testes.java.dao.IFilialDao;
import com.rns.testes.java.model.Filial;
import com.rns.testes.java.service.AbstractGenericServicePersistence;
import com.rns.testes.java.service.IFilialService;
import org.springframework.stereotype.Service;

@Service
public class FilialService extends AbstractGenericServicePersistence<IFilialDao, Filial, Long> implements IFilialService {
}
