package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        Cliente cliente = new Cliente();

        int e;
        System.out.println("Olá bem-vindo(a) ao Banco DIO");
        System.out.println("Para criar uma conta, digite 1, caso queira sair digite 2");
        e = scan.nextInt();
        if (e == 1) {

            System.out.println("Primeiramente digite seu nome: ");
            cliente.setNome(scan.next());
            System.out.println("Agora digite a sua idade: ");
            cliente.setIdade(scan.nextInt());
            System.out.println("Digite o seu sexo: ");
            cliente.setSexo(scan.next());
            System.out.println("Agora digite o seu cpf(qualquer número)");
            cliente.setCpf(scan.nextLong());
            System.out.println("Digite a sua profissão: ");
            cliente.setEmprego(scan.next());
            System.out.println("Digite seu estado cívil: ");
            cliente.setEstadoCivil(scan.next());
            System.out.println("Muito bem! Sua conta corrente foi criada!");
            Conta contaC = new ContaCorrente(cliente);
            int escolha;
            System.out.println("Exibindo dados da conta");
            contaC.imprimirExtrato();
            System.out.println("Caso deseje continuar operando na sua conta digite 1");
            System.out.println("caso deseje verificar seus dados, digite 2, caso deseje sair, digite 3");
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    int escolha2;
                    System.out.println("Caso deseje criar uma conta poupança, digite 1, caso deseje depositar digite 2");
                    System.out.println("caso deseje sacar digite 3");
                    escolha2 = scan.nextInt();
                    if(escolha2 == 1){
                        Conta contaP = new ContaPoupanca(cliente);
                        int escolha3;
                        System.out.println("Conta poupança criada com sucesso!");
                        System.out.println("Caso você queira depositar, digite 1, caso queira sacar, digite 2");
                        System.out.println("caso queira transferir para sua conta corrente, digite 3");
                        System.out.println("Caso queira fechar a aplicação, digite 4");
                        escolha3 = scan.nextInt();
                        switch (escolha3){
                            case 1:
                                System.out.println("Digite o valor que deseja depositar: ");
                                contaP.depositar(scan.nextDouble());
                                contaP.imprimirExtrato();
                                System.out.println("Valor depositado com sucesso!");
                                break;
                            case 2:
                                System.out.println("Digite o valor que deseja sacar: ");
                                contaC.sacar(scan.nextDouble());
                                contaC.imprimirExtrato();
                                System.out.println("Valor sacado com sucesso!");
                                break;
                            case 3:
                                System.out.println("Digite o valor a ser transferido: ");
                                contaP.transferir(scan.nextDouble(),contaC);
                                contaP.imprimirExtrato();
                                contaC.imprimirExtrato();
                                System.out.println("Valor depositado com sucesso!");
                                break;
                            default:
                                System.out.println("Fechando a aplicação");
                                break;
                        }

                    }else if(escolha2 == 2){
                        System.out.println("Digite o valor que deseja depositar: ");
                        contaC.depositar(scan.nextDouble());
                        contaC.imprimirExtrato();
                        System.out.println("Valor depositado com sucesso!");

                    }else if(escolha2 == 3){
                        System.out.println("Digite o valor que deseja sacar: ");
                        contaC.sacar(scan.nextDouble());
                        contaC.imprimirExtrato();
                        System.out.println("Valor sacado com sucesso!");
                    }else{
                        System.out.println("A opção que você selecionou não existe!");
                        System.out.println("Fechando a aplicação");

                    }
                    break;
                case 2:
                    cliente.dadosCliente();
                    break;
                default:
                    System.out.println("Fechando aplicação");
                    break;
            }

        } else
            System.out.println("Fechando aplicação");
    }
}




