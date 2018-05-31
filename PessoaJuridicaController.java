package com.company.controller;

import com.company.model.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaJuridicaController extends PessoaJuridica {

    PessoaJuridica empresa = new PessoaJuridica();
    List<PessoaJuridica> listaEmpresas = new ArrayList<PessoaJuridica>();


    Scanner entrada = new Scanner(System.in);

    int escolha = 1;
    int contador= 0;


    public void CadastrarPessoaJuridica(){

        while(escolha == 1){

            contador++;
            System.out.print("Nome: ");
            empresa.setNome(entrada.next());
            System.out.print("Email: ");
            empresa.setEmail(entrada.next());
            System.out.print("Telefone: ");
            empresa.setTelefone(entrada.next());
            System.out.print("Endereço: ");
            empresa.setEndereco(entrada.next());
            System.out.print("CNPJ: ");
            empresa.setCNPJ(entrada.next());

            listaEmpresas.add(empresa);

            System.out.println("ADICIONAR MAIS ALGUEM?");
            escolha = entrada.nextInt();
        }
    }

    public void ListarPessoaJuridica(){

        for(int j = 0; j <= listaEmpresas.size(); j++){
            System.out.println(listaEmpresas.toString());
        }
    }
}