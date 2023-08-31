/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaalunoarray;

import java.util.Scanner;

/**
 *
 * @author Vitor Manuel
 */
public class MediaAlunoArray {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Alunos alunos = new Alunos();
        int opcao;
        
        do{
            System.out.printf("Escolha umas das seguintes opções:\n1)Cadastrar aluno\n2)Listar Alunos\nDigite aqui: ");
            opcao = ler.nextInt();
            
            switch(opcao){
                case 1:
                    alunos.adicionarAluno();
        
                    break;
                case 2: 
                        alunos.mostrarAlunos(aluno);                 
                    break;
                default:   
                        System.out.println("==================");
                        System.out.println("PROGRAMA ENCERRADO");
                        System.out.println("==================");
                        System.exit(0);
                        break;                    
            }
        }while(true);
                        
    }
}
