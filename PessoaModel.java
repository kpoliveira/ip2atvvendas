package com.company.model;

import com.company.controller.PessoaFisicaController;
import com.company.controller.PessoaJuridicaController;

import java.io.IOException;
import java.util.Scanner;

public class PessoaModel {

    PessoaFisicaController pfc = new PessoaFisicaController();
    PessoaJuridicaController pjc = new PessoaJuridicaController();

    Scanner entrada = new Scanner(System.in);
    int escolha = 0;

    public void Cliente() throws IOException {
        System.out.println("DIGITE 1 PARA PESSOA FÍSICA");
        System.out.println("DIGITE 2 PARA PESSOA JURÍDICA");
        escolha = entrada.nextInt();

        if(escolha == 1){
            pfc.CadastrarPessoaFisica();
        }
        if (escolha == 2){

        }

    }

}
