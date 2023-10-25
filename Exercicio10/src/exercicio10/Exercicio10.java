/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio10;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author me
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args) {
        Curso meuCurso = new Curso();

        meuCurso.adicionarTurma("Programação");
        meuCurso.adicionarTurma("Banco de Dados");

        adicionarAluno(meuCurso, "Programação");
        adicionarAluno(meuCurso, "Programação");
        //adicionarAluno(meuCurso, "Programação");

        //adicionarAluno(meuCurso, "Banco de Dados");
        //adicionarAluno(meuCurso, "Banco de Dados");

        JOptionPane.showMessageDialog(null, "Cursos e Turmas:\n" + meuCurso);

        Turma maiorTurma = meuCurso.maiorTurma();
        JOptionPane.showMessageDialog(null, "Maior Turma:\n" + maiorTurma);

        String nomeTurmaPesquisa = JOptionPane.showInputDialog("Digite o nome da turma para pesquisa:");
        int matriculaAlunoPesquisa = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do aluno para pesquisa:"));
        Aluno alunoPesquisado = meuCurso.pesquisarAluno(nomeTurmaPesquisa, matriculaAlunoPesquisa);
        if (alunoPesquisado != null) {
            JOptionPane.showMessageDialog(null, "Aluno Pesquisado:\n" + alunoPesquisado);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado.");
        }

        String nomeTurmaFeminina = JOptionPane.showInputDialog("Digite o nome da turma para listar alunos femininos:");
        ArrayList<Aluno> femininosNaTurma = meuCurso.alunosFemininosNaTurma(nomeTurmaFeminina);
        JOptionPane.showMessageDialog(null, "Alunos Femininos na Turma " + nomeTurmaFeminina + ":\n" + femininosNaTurma);
    }
         private static void adicionarAluno(Curso curso, String nomeTurma) {
        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
        int matriculaAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do aluno:"));
        char sexoAluno = JOptionPane.showInputDialog("Digite o sexo do aluno (M/F):").charAt(0);

        for (Turma turma : curso.turmas) {
            if (turma.getNome().equals(nomeTurma)) {
                turma.adicionarAluno(nomeAluno, matriculaAluno, sexoAluno);
                
            }
        }
    }

    }

    

