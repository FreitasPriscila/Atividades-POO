package com.mycompany.exercicio1;
//3° forma de criar uma nova instancia
public class Carro3 {
    //criando um método exibirInfomracoes()
    String marca;
    String modelo;
    int ano;
    String cor;
    
   
    
    //outra forma de não precisar criar uma variável 
    //verCarro na hr de instanciar é criar um método 
    //p fazer essas atribuições e imprimir direto
    public static void exibirCarros(String marca,String modelo,int ano,String cor){
    System.out.printf("Marca: %s Modelo: %s Ano: %d Cor: %s%n/",marca,modelo,ano,cor);
    }
    
}
