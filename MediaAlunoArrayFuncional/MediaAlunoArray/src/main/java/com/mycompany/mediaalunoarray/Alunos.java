/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediaalunoarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vitor Manuel
 */
public class Alunos {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    Scanner ler = new Scanner(System.in);

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    public int getTotalAlunos(){
        return alunos.size();
    }
    
    public void adicionarAluno(){
        Aluno aluno = new Aluno();
        System.out.printf("Digite o nome do aluno: ");
        aluno.setNome(ler.next());
        
        System.out.printf("Digite a matricula do aluno: ");
        aluno.setMatricula(ler.nextInt());
        
        System.out.printf("Digite a primeira nota: ");
        aluno.setNota1(ler.nextFloat());

        System.out.printf("Digite a segunda nota: ");
        aluno.setNota2(ler.nextFloat());

        System.out.printf("Digite a terceira nota: ");
        aluno.setNota3(ler.nextFloat()); 
                           
        alunos.add(aluno);
        
        System.out.println("\n\nESTUDANTE ADICIONADO COM SUCESSO!\n\n");
      
    }
  
    public void mostrarAlunos(Aluno aluno){
        for(Aluno a : alunos){
            System.out.printf("Nome: %s\n", a.getNome());
            System.out.printf("Matricula: %d\n", a.getMatricula());
            System.out.printf("1° Nota: %.2f\n", a.getNota1());
            System.out.printf("2° Nota: %.2f\n", a.getNota2());
            System.out.printf("3° Nota: %.2f\n", a.getNota3());
            System.out.printf("Média: %.2f", a.getMedia());
            if(a.getMedia() >= 7){
                System.out.println("\n==============\nAPROVADO!!\n==============\n\n");        
            }
            else{
                System.out.println("\n==============\nREPROVADO!!\n==============\n\n");
            }
            
        }
    }
    
}
