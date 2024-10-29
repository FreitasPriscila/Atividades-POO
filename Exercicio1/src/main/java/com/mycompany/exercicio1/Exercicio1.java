package com.mycompany.exercicio1;
public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("1° questão: ");
        
        Carro verCarro = new Carro();
        
        verCarro.marca="Fiat";
        verCarro.modelo="uno";
        verCarro.ano=2019;
        verCarro.cor="branco";
        
    System.out.println("Marca: " 
            + verCarro.marca 
            + " Modelo: " 
            + verCarro.modelo 
            + " Ano: " 
            + verCarro.ano 
            + " Cor: " 
            + verCarro.cor);

    
        System.out.println("Segunda forma da 1° questão: ");
        Carro2 verCarro2 = new Carro2("Fiat","uno",2012,"preto");
        System.out.printf("Marca: %s Modelo: %s Ano: %d Cor: %s%n/", verCarro2.marca, verCarro2.modelo, verCarro2.ano, verCarro2.cor);
    
    System.out.println("3 forma da 1° questão: ");
    new CarroNovo("BMW","TETO SOLAR", 2022, "VERMELHA").exibirInformacoes();

        System.out.println("Outra forma");
            Carro3.exibirCarros("fiat","TETO SOLAR", 2020, "VERMELHA");

    System.out.println("*****************************************");
    System.out.println("2° questao: ");
        Livro.exibirLivro("amorEterno","joaoCampus",120);

        
    System.out.println("*****************************************");
    System.out.println("3° questão: ");
    ContaBancaria conta = new ContaBancaria("Joao",2000.00);
        System.out.println(conta.sacar(200));
    
    System.out.println("*****************************************");
    System.out.println("4° questão: ");
    Produto verProduto[]={new Produto("mouse",20),new Produto("Funko POP", 180), new Produto("Mouse", 30), new Produto("Notebook", 4000)};
    System.out.println("|---------------------|");
        System.out.println("| Nome     \tPreco |");
        System.out.println("|---------------------|");
        
        for(int i = 0; i < verProduto.length; i++){
            System.out.println("| " + verProduto[i].getNome() + "\t" + verProduto[i].getPreco() + " |");
        }
    
    System.out.println("*****************************************");
    System.out.println("5° questão: ");
    Loja minhaLoja = new Loja("feiradoparaguai.com.br", "Ponte Internacional da Amizade");
    Produto produto1 = new Produto("Caixa JBL", 80);
    minhaLoja.adicionar_produto(produto1);
    minhaLoja.adicionar_produto(new Produto("mouse",20));
    minhaLoja.adicionar_produto(new Produto("teclado",20));
    minhaLoja.listar_produtos();
    minhaLoja.vender_produto("teclado");
    minhaLoja.listar_produtos();
    
    
       
    System.out.println("*****************************************");
    System.out.println("6° questão: ");
    Turma verTurma = new Turma();
    verTurma.add_estudantes(new Estudantes("joao","ksdfhmv",9));
    verTurma.add_estudantes(new Estudantes("priscila","fefehfb",8));
    verTurma.add_estudantes(new Estudantes("pedro","efbevvvb",7));
    
        System.out.printf("A média é: "+ verTurma.media_turma());
    }
}
