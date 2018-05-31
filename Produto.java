package com.company.model;

public class Produto {

    private String nome;
    private String corDaTarja;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDaTarja() {
        return corDaTarja;
    }

    public void setCorDaTarja(String corDaTarja) {
        this.corDaTarja = corDaTarja;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", corDaTarja='" + corDaTarja + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
