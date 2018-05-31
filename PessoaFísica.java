package com.company.model;

public class PessoaFísica extends Pessoa {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", cpf='" + getCpf() + '\'';
    }
}
