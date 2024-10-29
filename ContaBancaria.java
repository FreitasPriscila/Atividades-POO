package com.mycompany.exercicio1;
public class ContaBancaria {
String titular;
double saldo;
    public ContaBancaria(String titular, double saldo ){
        this.titular = titular;
        this.saldo = saldo;
    }
    
        public  String sacar(double valor){
            if (saldo > valor){
                saldo=saldo-valor;
            }
            else{
                return "Você não possui saldo suficiente!";
            }
            return "Ola"+titular +"o seu saldo é"+saldo;
    }
        public String depositar(double valor){
            System.out.printf("Digite o valor a sacar: ");
            saldo=saldo+valor;
            return "Ola"+titular +"o seu saldo é"+saldo;
    }
}

