package com.rns.testes.java.dto.mapper;

import com.rns.testes.java.dto.FilialDto;
import com.rns.testes.java.model.Filial;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-24T15:07:34-0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
public class FilialMapperImpl implements FilialMapper {

    @Override
    public FilialDto entityToDto(Filial entity) {
        if ( entity == null ) {
            return null;
        }

        FilialDto filialDto = new FilialDto();

        filialDto.setVersao( entity.getVersao() );
        filialDto.setDataUltAlteracao( entity.getDataUltAlteracao() );
        filialDto.setId( entity.getId() );
        filialDto.setRazaoSocial( entity.getRazaoSocial() );
        filialDto.setCnpj( entity.getCnpj() );
        filialDto.setEndereco( entity.getEndereco() );
        filialDto.setTipoFilial( entity.getTipoFilial() );

        return filialDto;
    }

    @Override
    public Filial dtoToEntity(FilialDto dto) {
        if ( dto == null ) {
            return null;
        }

        Filial filial = new Filial();

        filial.setVersao( dto.getVersao() );
        filial.setDataUltAlteracao( dto.getDataUltAlteracao() );
        filial.setId( dto.getId() );
        filial.setRazaoSocial( dto.getRazaoSocial() );
        filial.setCnpj( dto.getCnpj() );
        filial.setEndereco( dto.getEndereco() );
        filial.setTipoFilial( dto.getTipoFilial() );

        return filial;
    }
}
