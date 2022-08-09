package com.poshyweb.folhadepagamento.service;

import com.poshyweb.folhadepagamento.client.WorkerFingCleint;
import com.poshyweb.folhadepagamento.dominio.entity.Pagamento;
import com.poshyweb.folhadepagamento.dominio.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentosService {

    @Autowired
    private WorkerFingCleint workerFingCleint;

    public Pagamento getPagamento(Long workeId, int dia) {
        Worker worker = workerFingCleint.buscarPorId(workeId).getBody();
        assert worker != null;
        return  new Pagamento(worker.getNome(), worker.getSalario(), dia);
    }
}
