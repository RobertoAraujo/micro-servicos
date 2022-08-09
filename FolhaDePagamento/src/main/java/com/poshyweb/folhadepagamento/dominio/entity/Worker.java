package com.poshyweb.folhadepagamento.dominio.entity;

import java.io.Serializable;
import java.util.Objects;


public class Worker implements Serializable {
    static final long serialVersionUID = 1L;

    private  Long id;
    private String nome;
    private Double salario;

    public Worker() {
    }

    public Worker(Long id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(id, worker.id) && Objects.equals(nome, worker.nome) && Objects.equals(salario, worker.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, salario);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}

