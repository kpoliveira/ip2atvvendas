package com.company.view;

import java.util.Scanner;


public class FrontView {

    public void exbiriMenu(){

        Scanner entrada = new Scanner(System.in);
        FrontView2 fvv = new FrontView2();

        int escolha = 0;

        while(escolha != 8){
            System.out.println("1 - CADASTRAR E LISTAR CLIENTES \n" +
                    "2 - CADASTRAR VENDEDORES \n" +
                    "3 - LISTAR VENDEDORES \n" +
                    "4 - CADASTRAR PRODUTOS \n" +
                    "5 - LISTAR PRODUTOS \n" +
                    "6 - REGISTRAR VENDA \n" +
                    "7 - RELATÓRIO DE VENDAS \n" +
                    "8 - SAIR DO PROGRAMA E SALVAR");
            escolha = entrada.nextInt();

                fvv.run(escolha);
        }
    }
}