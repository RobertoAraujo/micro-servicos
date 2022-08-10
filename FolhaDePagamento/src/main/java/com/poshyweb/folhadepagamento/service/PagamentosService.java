package com.poshyweb.folhadepagamento.service;

import com.poshyweb.folhadepagamento.dominio.entity.Pagamento;
import com.poshyweb.folhadepagamento.dominio.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentosService {

    @Value(value = "${hr-worker.hot}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Pagamento getPagamento(Long workeId, int dia) {
        Map<String, String> uriVariaveis = new HashMap<>();
        uriVariaveis.put("id", ""+workeId);
        Worker worker = restTemplate.getForObject(workerHost + "worke/{id}", Worker.class,uriVariaveis);
        assert worker != null;
        return  new Pagamento(worker.getNome(), worker.getSalario(), dia);
    }

}
