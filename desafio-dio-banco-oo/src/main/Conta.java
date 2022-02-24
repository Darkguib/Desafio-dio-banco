package main;

import java.util.Random;

public abstract class Conta {//Classe mãe de todas as contas
    private static final int AGENCIA_PADRAO = 1;
    Random rand = new Random();


    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){//Cria a conta
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = rand.nextInt(999999);
        this.cliente = cliente;
    }

    public void sacar(double valor){

        this.saldo -= valor;
    }
    public void depositar(double valor){

        this.saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino){

        this.sacar(valor);
        contaDestino.depositar(valor);

    }
    public void imprimirExtrato(){

    }
    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println("|"+String.format("Agencia: %d",this.agencia)+"|");
        System.out.println("|"+String.format("Numero: %d",this.numeroConta)+"|");
        System.out.println("|"+String.format("Saldo: %.2f",this.saldo)+"|");

    }
    public int getAgencia(){
        return agencia;
    }
    public int getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }

}
