package com.poshyweb.folhadepagamento.controller;

import com.poshyweb.folhadepagamento.dominio.entity.Pagamento;
import com.poshyweb.folhadepagamento.service.PagamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoController {

    @Autowired
    private PagamentosService service;

    @GetMapping(value = "/{workerId}/dias/{dias}")
    public ResponseEntity<Pagamento> getPagamento(@PathVariable Long workerId,
                                                  @PathVariable Integer dias){
        Pagamento pagamento= service.getPagamento(workerId, dias);
        return ResponseEntity.status(HttpStatus.OK).body(pagamento);
    }
}
