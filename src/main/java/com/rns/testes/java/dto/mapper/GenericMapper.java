package com.rns.testes.java.dto.mapper;

/**
 * A classe abstrata responsável por implementa os m?todos genéricos para o GenericMapper.
 * @param <D> classe DTO
 * @param <E> classe Entidade
 */
public interface GenericMapper<E, D> {

    D entityToDto(E entity);

    E dtoToEntity(D dto);
}
