package com.company.view;

import com.company.controller.PessoaFisicaController;
import com.company.controller.PessoaJuridicaController;
import com.company.controller.ProdutoController;
import com.company.controller.VendedorController;

import java.util.Scanner;

public class FrontView2 extends FrontView{

    int escolha, escolha2;

    Scanner in = new Scanner(System.in);

    public int run(int escolha){
        PessoaFisicaController pfv = new PessoaFisicaController();
        PessoaJuridicaController pjv = new PessoaJuridicaController();
        VendedorController vv = new VendedorController();
        ProdutoController pc = new ProdutoController();

        if(escolha == 1){
            System.out.println("1 PARA CADASTRAR PESSOA FÍSICA");
            System.out.println("2 PARA CADASTRAR PESSOA JURÍDICA");
            System.out.println("3 PARA LISTAR PESSOA FÍSICA");
            System.out.println("4 PARA LISTAR PESSOA JURÍDICA");
            escolha2 = in.nextInt();

            if(escolha2 == 1){
                pfv.CadastrarPessoaFisica();
            }
            if(escolha2 == 2){
                pjv.CadastrarPessoaJuridica();
            }
            if(escolha2 == 3){
                pfv.ListarPessoaFisica();
            }
            if(escolha2 == 4){
                pjv.ListarPessoaJuridica();
            }
        }
        if(escolha == 2){
            vv.CadastrarVendedores();
        }

        if(escolha == 3){
            vv.ListarVendedores();
        }
        if(escolha == 4){
            pc.CadastrarProduto();
        }
        if(escolha == 5){
            pc.ListarProdutos();
        }
        if(escolha == 6){
            pc.RegistrarVenda();
        }
        if(escolha == 7){
            pc.RelatoridoDeVendas();
        }
        return 0;
    }
}