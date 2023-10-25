/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author me
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso = new Curso();
        
        curso.adicionarAluno("Alexandre", "Lages");
        curso.adicionarAluno("Maria", "Florianopolis");
        
        curso.adicionarProfessor("Jair", "Lages", "Mestre");
        curso.adicionarProfessor("Poliana", "Florianopolis", "Doutorado");
        
        //Mostrar
        JOptionPane.showMessageDialog(null, "Total de alunos: " + curso.totalAlunos());
        JOptionPane.showMessageDialog(null, "Total de professores: " + curso.totalProfessores());
        
        String alunosForaDeLagesMSG = "Alunos que não moram em Lages:\n";
        ArrayList<Aluno> alunosForaDeLages = curso.alunosForaDeLages();
        for (Aluno aluno : alunosForaDeLages) {
            alunosForaDeLagesMSG += aluno.pessoa.nome;
        }
        JOptionPane.showMessageDialog(null, alunosForaDeLagesMSG);

         JOptionPane.showMessageDialog(null, "Total de professores com titulação igual a doutorado: " + curso.totalProfessoresDoutorado());

    }

    }
    

