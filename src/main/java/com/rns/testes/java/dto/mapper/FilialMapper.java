package com.rns.testes.java.dto.mapper;

import com.rns.testes.java.dto.FilialDto;
import com.rns.testes.java.model.Filial;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Interface respons?vel por implementar MapperStruct no mapeamento entre Filial e FilialDto.
 */
@Mapper
public interface FilialMapper extends GenericMapper<Filial, FilialDto> {

    FilialMapper INSTANCE = Mappers.getMapper(FilialMapper.class);

}
