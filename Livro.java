package com.mycompany.exercicio1;
public class Livro {
    String titulo;
    String autor;
    int paginas;
    
    public static void exibirLivro(String titulo,String autor,int paginas){
        System.out.printf("Titulo: %s Autor: %s Paginas: %d%n/",titulo,autor,paginas);
    }
}
