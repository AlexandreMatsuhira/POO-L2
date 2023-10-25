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
public class Curso {
    ArrayList<Turma> turmas;

    public Curso() {
        this.turmas = new ArrayList<>();
    }

    public void adicionarTurma(String nomeTurma) {
        turmas.add(new Turma(nomeTurma));
    }

    public Turma maiorTurma() {
        Turma maiorTurma = null;
        int maxAlunos = 0;

        for (Turma turma : turmas) {
            int totalAlunos = turma.totalAlunos();
            if (totalAlunos > maxAlunos) {
                maxAlunos = totalAlunos;
                maiorTurma = turma;
            }
        }

        return maiorTurma;
    }

    public Aluno pesquisarAluno(String nomeTurma, int matriculaAluno) {
        for (Turma turma : turmas) {
            if (turma.getNome().equals(nomeTurma)) {
                for (Aluno aluno : turma.getAlunos()) {
                    if (aluno.matricula == matriculaAluno) {
                        return aluno;
                    }
                }
            }
        }
        return null;
    }

    public ArrayList<Aluno> alunosFemininosNaTurma(String nomeTurma) {
        ArrayList<Aluno> femininosNaTurma = new ArrayList<>();
        for (Turma turma : turmas) {
            if (turma.getNome().equals(nomeTurma)) {
                for (Aluno aluno : turma.getAlunos()) {
                    if (aluno.sexo == 'F') {
                        femininosNaTurma.add(aluno);
                    }
                }
            }
        }
        return femininosNaTurma;
    }

    @Override
    public String toString() {
        return "Curso [turmas=" + turmas + "]";
    }
    
}
