package com.poshyweb.workservico.service;

import com.poshyweb.workservico.dominio.entity.Worker;
import com.poshyweb.workservico.dominio.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServer {

    @Autowired
    private WorkerRepository repository;

    public List<Worker> getAll(){
        return repository.findAll();
    }
}
