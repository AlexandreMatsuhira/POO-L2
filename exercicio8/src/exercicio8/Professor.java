/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio8;

/**
 *
 * @author me
 */
public class Professor {
    
    Pessoa pessoa;
    String titulacao;

    public Professor(String nome, String cidade, String titulacao) {
        this.pessoa = new Pessoa(nome, cidade);
        this.titulacao = titulacao;
    }
    
}
