package com.company.model;

public class PessoaJuridica extends Pessoa {

    private String CNPJ;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cnpj='" + CNPJ + '\'';
    }
}
