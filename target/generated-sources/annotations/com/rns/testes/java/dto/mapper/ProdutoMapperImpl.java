package com.rns.testes.java.dto.mapper;

import com.rns.testes.java.dto.ProdutoDto;
import com.rns.testes.java.model.Produto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-24T15:07:34-0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
public class ProdutoMapperImpl implements ProdutoMapper {

    @Override
    public ProdutoDto entityToDto(Produto entity) {
        if ( entity == null ) {
            return null;
        }

        ProdutoDto produtoDto = new ProdutoDto();

        produtoDto.setId( entity.getId() );
        produtoDto.setNome( entity.getNome() );

        return produtoDto;
    }

    @Override
    public Produto dtoToEntity(ProdutoDto dto) {
        if ( dto == null ) {
            return null;
        }

        Produto produto = new Produto();

        produto.setId( dto.getId() );
        produto.setNome( dto.getNome() );

        return produto;
    }
}
