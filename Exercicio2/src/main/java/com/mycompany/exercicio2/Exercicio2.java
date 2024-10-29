package com.mycompany.exercicio2;
import java.time.LocalDate;
public class Exercicio2 {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("joao", "104.873.263-84","prisfrei@gmail.com", "90988211234",LocalDate.of(2006, 20, 12)); //n pd ter 0 à esquerda
        pessoa1.exibirDados();
    }
}
