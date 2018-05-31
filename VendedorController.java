package com.company.controller;

import com.company.model.PessoaFísica;
import com.company.model.Vendedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendedorController extends Vendedor{

    Vendedor v = new Vendedor();
    List<Vendedor> listaVendedores = new ArrayList<>();

    Scanner entrada = new Scanner(System.in);

    int choice = 1;
    int contador = 0;

    public void CadastrarVendedores(){
        while(choice == 1){

            contador++;
            System.out.print("Nome: ");
            v.setNome(entrada.next());
            System.out.print("Telefone: ");
            v.setTelefone(entrada.next());
            System.out.print("CPF:  ");
            v.setMatricula(entrada.next());
            listaVendedores.add(v);

            System.out.println("ADICIONAR MAIS ALGUEM?");
            choice = entrada.nextInt();
        }
    }

    public void ListarVendedores(){

        for(int j = 0; j <= listaVendedores.size(); j++){
            System.out.println(listaVendedores.toString());
        }
    }
}
