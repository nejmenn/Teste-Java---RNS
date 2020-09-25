package com.rns.testes.java.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Esta entidade representa o escopo m?nimo de uma entidade, portanto toda classe entidade deve herda-la.
 */
@Getter
@Setter
@MappedSuperclass
public abstract class GenericEntity<T extends Serializable> implements Serializable, Persistable<T> {

    /**
     * Atributo auto-gerado em cada opera??o realizada pela DAO. Indica quantas vezes o objeto foi manipulado.
     */
    @Version
    @Column(name = "VERSAO", unique = false, nullable = false, precision = 10)
    protected Long versao;

    /**
     * Atributo auto-gerado em cada opera??o realizada pela DAO.
     */
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_ULT_ALTERACAO", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Date dataUltAlteracao;

    public boolean isNew() {
        return null == getId();
    }

}
