package com.mycompany.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Estudantes {
    String nome;
    String matricula;
    float nota;
    
    public Estudantes(String nome, String matricula, float nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
    
    public float getNota(){
        return nota;
    }
    
}
