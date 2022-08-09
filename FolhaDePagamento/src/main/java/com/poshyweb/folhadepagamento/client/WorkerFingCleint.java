package com.poshyweb.folhadepagamento.client;

import com.poshyweb.folhadepagamento.dominio.entity.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "worke", url = "http://localhost:8081/worker/listar/")
public interface WorkerFingCleint {
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Worker> buscarPorId(@PathVariable Long id);

}
