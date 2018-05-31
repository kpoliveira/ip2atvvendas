package com.company.controller;

import com.company.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ProdutoController extends Produto {

    Produto pr = new Produto();
    List<Produto> listaProdutos = new ArrayList<Produto>();

    Scanner entrada = new Scanner(System.in);

    int escolhaP, contador;
    String nome;
    int qtdClone = getQuantidade();
    int qtdParaClonar = 0;
    int qtdClonada = 0;

    public void CadastrarProduto(){

        do {
            System.out.print("Nome: ");
            pr.setNome(entrada.next());
            System.out.print("Cor da Tarja: ");
            pr.setCorDaTarja(entrada.next());
            System.out.print("Quantidade: ");
            pr.setQuantidade(entrada.nextInt());

            listaProdutos.add(pr);
            System.out.println("ADICIONAR MAIS ALGUM?");
            escolhaP = entrada.nextInt();
        }while (escolhaP == 1);
    }

    public void ListarProdutos(){
        for(int j = 0; j <= listaProdutos.size(); j++){
            System.out.println(listaProdutos.toString());
        }
    }

    public void RegistrarVenda(){

        System.out.println("Digite o nome do produto");
        System.out.print("Nome: ");
        nome = entrada.next();

        System.out.println("Digite a quantidade que será vendida");
        System.out.print("Quantidade: ");
        qtdParaClonar = entrada.nextInt();

            if(nome.equals(getNome())) {
                System.out.println("oi");
                qtdClonada = qtdClone - qtdParaClonar;
                System.out.println("Ainda há "
                        + qtdClonada +
                        " produtos no estoque");
            }
    }

    public void RelatoridoDeVendas(){
        for(int i = 0; i <= listaProdutos.size(); i++){
            System.out.println("O Produto " + getNome() + " possuia " + qtdClone + " agora possui " + qtdClonada);
        }
    }
}