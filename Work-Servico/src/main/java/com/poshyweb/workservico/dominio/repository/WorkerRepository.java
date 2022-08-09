package com.poshyweb.workservico.dominio.repository;

import com.poshyweb.workservico.dominio.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
