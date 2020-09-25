package com.rns.testes.java.seeder;

import com.rns.testes.java.enums.EnumTipoFilial;
import com.rns.testes.java.model.Filial;
import com.rns.testes.java.service.IFilialService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FilialSeeder {

    @Autowired
    IFilialService service;

    @EventListener
    public void seedFilial(ContextRefreshedEvent event) {
        try {
            log.info("Criando filiais....");
            criandoFiliais();
        } catch (Exception e) {
            log.error(e.getMessage());
        }

    }

    private void criandoFiliais() {
        Filial galpao = new Filial();
        galpao.setRazaoSocial("Galpão de estocagem de produtos LTDA");
        galpao.setCnpj("83.230.227/0001-50");
        galpao.setTipoFilial(EnumTipoFilial.DEPOSITO);
        galpao.setEndereco("Rua Teste Galpao 187, São Paulo - SP");

        service.save(galpao);

        Filial lojaBtoC1 = new Filial();
        lojaBtoC1.setRazaoSocial("Loja São Paulo LTDA");
        lojaBtoC1.setCnpj("72.286.494/0001-23");
        lojaBtoC1.setTipoFilial(EnumTipoFilial.LOJA_PF);
        lojaBtoC1.setEndereco("Av. Paulista, 111, São Paulo - SP");

        service.save(lojaBtoC1);

        Filial lojaBtoC2 = new Filial();
        lojaBtoC2.setRazaoSocial("Loja Rio de Janeiro LTDA");
        lojaBtoC2.setCnpj("50.935.855/0001-82");
        lojaBtoC2.setTipoFilial(EnumTipoFilial.LOJA_PF);
        lojaBtoC2.setEndereco("Av. Barata Ribeiro, 199, Rio de Janeiro - RJ");

        service.save(lojaBtoC2);

        Filial lojaBtoB = new Filial();
        lojaBtoB.setRazaoSocial("Loja To Loja LTDA");
        lojaBtoB.setCnpj("82.602.541/0001-54");
        lojaBtoB.setTipoFilial(EnumTipoFilial.LOJA_PJ);
        lojaBtoB.setEndereco("Av. Barata Ribeiro, 124, Rio de Janeiro - RJ");

        service.save(lojaBtoB);
    }
}
