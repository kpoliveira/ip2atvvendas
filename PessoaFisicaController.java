package com.company.controller;

import com.company.model.PessoaFísica;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaFisicaController extends PessoaFísica {

    PessoaFísica p = new PessoaFísica();
    List<PessoaFísica> listaPessoas = new ArrayList<PessoaFísica>();

    Scanner entrada = new Scanner(System.in);

    int choice = 1;
    int contador = 0;

    public void CadastrarPessoaFisica() {

        while(choice == 1){

            contador++;
            System.out.print("Nome: ");
            p.setNome(entrada.next());
            System.out.print("Email: ");
            p.setEmail(entrada.next());
            System.out.print("Telefone: ");
            p.setTelefone(entrada.next());
            System.out.print("Endereço:  ");
            p.setEndereco(entrada.next());
            System.out.print("CPF:  ");
            p.setCpf(entrada.next());


            System.out.println("ADICIONAR MAIS ALGUEM?");
            choice = entrada.nextInt();

            for(int i = 0; i <= listaPessoas.size(); i++){
                listaPessoas.add(p);
                break;
            }
        }
    }

    public void ListarPessoaFisica(){

        for(int i = 0; i <= listaPessoas.size(); i++){
            System.out.println(listaPessoas.toString());
        }
    }
}