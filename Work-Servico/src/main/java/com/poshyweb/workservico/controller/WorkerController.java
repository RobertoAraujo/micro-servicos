package com.poshyweb.workservico.controller;

import com.poshyweb.workservico.dominio.entity.Worker;
import com.poshyweb.workservico.service.WorkerServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/worker")
public class WorkerController {
    @Autowired
    public WorkerServer server;

    @GetMapping(value = "/listar")
    public ResponseEntity<List<Worker>> buscarTodos(){
        List<Worker> all = server.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(all);
    }
}
