/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio8;

/**
 *
 * @author me
 */
public class Aluno {
    
    Pessoa pessoa;

    public Aluno(String nome, String cidade) {
        this.pessoa = new Pessoa(nome, cidade);
    }
}
