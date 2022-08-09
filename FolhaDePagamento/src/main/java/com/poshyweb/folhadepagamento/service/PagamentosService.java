package com.poshyweb.folhadepagamento.service;

import com.poshyweb.folhadepagamento.dominio.entity.Pagamento;
import org.springframework.stereotype.Service;

@Service
public class PagamentosService {

    public Pagamento getPagamento(Long workeId, int dia) {
        return  new Pagamento("Roberto", 200.00, dia);
    }
}
