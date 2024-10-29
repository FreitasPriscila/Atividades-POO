package com.mycompany.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    float media = 0;
    List <Estudantes> notaEstudantes;
    public Turma(){
        this.notaEstudantes = new ArrayList<>(); 
    }
    public void add_estudantes(Estudantes aluno){
        this.notaEstudantes.add(aluno);
    }
    public float media_turma(){
        for (int i =0; i< this.notaEstudantes.size();i++){
            media = media + this.notaEstudantes.get(i).getNota(); 

        }
        return media / notaEstudantes.size();
    }
}
