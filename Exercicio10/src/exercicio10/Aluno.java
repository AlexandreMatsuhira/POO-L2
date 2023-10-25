/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio10;

/**
 *
 * @author me
 */
public class Aluno {
    
    String nome;
    int matricula;
    char sexo;

    public Aluno(String nome, int matricula, char sexo) {
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", sexo=" + sexo + "]";
    }
    
}
