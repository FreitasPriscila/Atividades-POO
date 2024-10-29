package com.mycompany.exercicio2;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    String nome;
    String cpf;
    String email;
    String telefone;
    LocalDate dataNascimento;
    public Pessoa(String nome,String cpf,String email, String telefone,LocalDate dataNascimento){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setDataNascimento(dataNascimento);
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEmail(){
        return email;
    }
    public String getTelefone(){
        return telefone;
    }
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
         String cpfOriginal = cpf;
        if(cpf.length() == 14){
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");
            
        }
        if(cpf.length() == 11){
            int auxErro = 0;
            for(int i = 0; i < cpf.length(); i++){
                if (Character.isDigit(cpf.charAt(i)) == false){
                    auxErro++;
                }
            }
            if (auxErro == 0){  // Primeira válidação
                int somaTotal = 0;
                int aux1 = 10;
                for(int i = 0; i < cpf.length() - 2; i++ ){
                    somaTotal = somaTotal + (aux1 * (cpf.charAt(i) - '0'));
                    aux1--;
                }
                
                int digitoUm = somaTotal % 11;
                
                if (digitoUm >= 10){
                    digitoUm = 0;
                } else{
                    digitoUm = 11 - digitoUm;
                }
                if (digitoUm == cpf.charAt(9) - '0'){
                     int somaTotal2 = 0;
                    int aux2 = 11;
                    for(int i = 0; i < cpf.length() - 1; i++ ){
                        somaTotal2 = somaTotal2 + (aux2 * (cpf.charAt(i) - '0'));
                        aux2--;
                    }
                    int digitoDois = somaTotal2 % 11;
                
                    if (digitoDois >= 10 || digitoDois == 0){
                        digitoDois = 0;
                    } else{
                        digitoDois = 11 - digitoDois;
                    }
                    if(digitoDois == cpf.charAt(10) - '0'){
                        this.cpf = cpfOriginal;
                    }
                }
            }
        }
    }

    public void setEmail(String email){
        int aux = 0; //conta os erros
        int contArrob = 0; // verifica o @
        int contPontArrob = 0;// verifica a posição do @
        int contPont = 0; //conta os pontos após @
        
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == ' '){ //emails n teem espaços
                aux++;
            } else if(email.charAt(0) == '.' || email.charAt(email.length()-1) == '.'){
                aux++; //emails n podem ter . como 1 ou ultimo elemento
            } else if(email.charAt(i) == '@'){
                if(i != 0 && i != email.length()-1){
                    contArrob++; // @ n pd ser ultimo ou primeiro elemento
                    contPontArrob = i;
                }else if (contArrob > 1){
                    aux++;  //um email só pd ter um @
                } else{
                    aux++;
                }
            } else{
                for (int j = 0; j <= contPontArrob; j++){
                    if(email.charAt(j) == '.'){
                        aux++; //email nm pd ter ponto antes do @
                    }
                }
                for (int k = contPontArrob + 1; k < email.length(); k++){
                    if (email.charAt(k) == '.'){
                        contPont++; //verifica quantos pontos tem 
                    }
                }
            }
        }
        if(aux == 0 && contPont >= 1){
            this.email = email; //precisa ter pelo menos um ponto apos @ e aux ser 0
        }
    }
    public void setTelefone(String telefone){
        if (this.telefone.length() == 11){
            int aux=0;
            for(int i=0;  i < telefone.length(); i++){
                if(Character.isDigit(telefone.charAt(i)) == true){ //verifica se o caracter é um dígito
                    aux++;
                }
            }
            if(aux == 11){ //se forem todos os 11 == dígitos
                this.telefone = telefone;
            }
        } 
    }
        
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public int getIdade(){
//    public class Pessoa {
//    private int anoNascimento;
//    private int mesNascimento;
//    private int diaNascimento;
//
//    public Pessoa(int anoNascimento, int mesNascimento, int diaNascimento) {
//        this.anoNascimento = anoNascimento;
//        this.mesNascimento = mesNascimento;
//        this.diaNascimento = diaNascimento;
//    }
//
//    public int getIdade() {
//        // Obtém a data atual
//        int anoAtual = 2024; // Use o ano atual
//        int mesAtual = 10;   // Use o mês atual
//        int diaAtual = 28;   // Use o dia atual
//
//        // Calcula a idade inicial
//        int idade = anoAtual - anoNascimento;
//
//        // Verifica se a pessoa ainda não fez aniversário neste ano
//        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
//            idade--; // Reduz a idade em 1 se o aniversário ainda não foi alcançado
//        }
//
//        return idade;
//    }

    Period periodo = Period.between(this.dataNascimento, LocalDate.now());//between da classe Period retorna a diferença dessas duas datas
    return periodo.getYears(); //getYears transforma a diferença e retorna em anos de idade
    }
    public void exibirDados(){
        System.out.println(
                "Ola, seja muito bem-vindo(a) Sr(a) "
                + this.getNome() + "! Essas sao suas informacoes: \n"
                 + "Nome: " + this.getNome()
                + "\nCPF: " + this.getCpf() 
                + "\nEmail: " + this.getEmail() 
                + "\nTelefone: " + this.getTelefone() 
                + "\nData de Nascimento: " + this.getDataNascimento()
                + "\nSua idade atual: " + this.getIdade() + " Anos"
        );
    }
    }

