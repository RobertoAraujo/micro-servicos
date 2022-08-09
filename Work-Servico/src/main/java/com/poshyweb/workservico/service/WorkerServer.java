package com.poshyweb.workservico.service;

import com.poshyweb.workservico.dominio.entity.Worker;
import com.poshyweb.workservico.dominio.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerServer {

    @Autowired
    private WorkerRepository repository;

    public List<Worker> getAll(){
        return repository.findAll();
    }
    public Optional<Worker> getPorId(Long id){
        return repository.findById(id);
    }
    public Worker salvar(Worker worker){
        return repository.save(worker);
    }
}
