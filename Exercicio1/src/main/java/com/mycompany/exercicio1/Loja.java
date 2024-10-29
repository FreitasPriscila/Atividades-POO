package com.mycompany.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    String nome;
    String endereco;
    List<Produto> produtos;
    public Loja(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.produtos = new ArrayList<>();
    }

    public void adicionar_produto(Produto produto){
        this.produtos.add(produto);
    }
    
   public void listar_produtos(){
       for(int i = 0; i <= this.produtos.size() -1; i++){
           Produto produto = this.produtos.get(i);
           System.out.printf("| " + produto.nome+ "\t" + produto.preco+ " |");
        }
   }
    public void vender_produto(String nomep){
        for (int i = 0; i <= this.produtos.size() -1; i++) {
        Produto produto = this.produtos.get(i);
        if (produto.nome.equals(nomep)) { //equals método p conferir conteúdo de string
            produtos.remove(i);
            break; //para de percorrer a lista 
        }
    }
   
}
}
