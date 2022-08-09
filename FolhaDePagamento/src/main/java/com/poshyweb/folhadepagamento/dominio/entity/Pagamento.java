package com.poshyweb.folhadepagamento.dominio.entity;

import java.io.Serializable;
import java.util.Objects;

public class Pagamento implements Serializable {
    static final long serialVersionUID = 1L;
    private String nome;
    private Double qtdPorDia;
    private Integer dia;

    public Pagamento() {
    }

    public Pagamento(String nome, Double qtdPorDia, Integer dia) {
        this.nome = nome;
        this.qtdPorDia = qtdPorDia;
        this.dia = dia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getQtdPorDia() {
        return qtdPorDia;
    }

    public void setQtdPorDia(Double qtdPorDia) {
        this.qtdPorDia = qtdPorDia;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return Objects.equals(nome, pagamento.nome) && Objects.equals(qtdPorDia, pagamento.qtdPorDia) && Objects.equals(dia, pagamento.dia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, qtdPorDia, dia);
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "nome='" + nome + '\'' +
                ", qtdPorDia=" + qtdPorDia +
                ", dia=" + dia +
                '}';
    }

    public double getTotal(){
        double valor = dia * qtdPorDia;
        return valor;
    }
}
