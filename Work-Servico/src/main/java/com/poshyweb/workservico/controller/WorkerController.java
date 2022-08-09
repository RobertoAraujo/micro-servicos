package com.poshyweb.workservico.controller;

import com.poshyweb.workservico.dominio.entity.Worker;
import com.poshyweb.workservico.service.WorkerServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(value = "/listar/{id}")
    public ResponseEntity<Optional<Worker>> buscarTodos(@PathVariable ("id") Long id){
        Optional<Worker> bucarId = server.getPorId(id);
        return ResponseEntity.status(HttpStatus.OK).body(bucarId);
    }

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<Worker> salvar(@RequestBody Worker worker){
        Worker salvo = server.salvar(worker);
        return ResponseEntity.status(HttpStatus.OK).body(salvo);
    }
}
