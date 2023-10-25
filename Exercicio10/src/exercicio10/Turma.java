/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio10;

import java.util.ArrayList;

/**
 *
 * @author me
 */
public class Turma {
    String nome;
    ArrayList<Aluno> alunos;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(String nome, int matricula, char sexo) {
        alunos.add(new Aluno(nome, matricula, sexo));
    }

    public int totalAlunos() {
        return alunos.size();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Turma [nome=" + nome + ", alunos=" + alunos + "]";
    }
}
