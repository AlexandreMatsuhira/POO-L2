/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio8;

import java.util.ArrayList;

/**
 *
 * @author me
 */
public class Curso {
    
    ArrayList<Aluno> alunos;
    ArrayList<Professor> professores;
    
    public Curso() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }
    
    public void adicionarAluno(String nome, String cidade) {
        alunos.add(new Aluno(nome, cidade));
    }
    
    public void adicionarProfessor(String nome, String cidade, String titulacao) {
        professores.add(new Professor(nome, cidade, titulacao));
    }
    
    public int totalAlunos() {
        return alunos.size();
    }
    
    public int totalProfessores() {
        return professores.size();
    }
    
    public ArrayList<Aluno> alunosForaDeLages() {
        ArrayList<Aluno> foraDeLages = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (!aluno.pessoa.cidade.equalsIgnoreCase("Lages")) {
                foraDeLages.add(aluno);
            }
        }
        return foraDeLages;
    }
    
    public int totalProfessoresDoutorado() {
        int count = 0;
        for (Professor professor : professores) {
            if (professor.titulacao.equalsIgnoreCase("Doutorado")) {
                count++;
            }
        }
        return count;
    }
    
}


