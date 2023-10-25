/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio9;

/**
 *
 * @author me
 */
public class Dependente {
    
    String nome;
    char sexo;

    public Dependente(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dependente [nome=" + nome + ", sexo=" + sexo + "]";
    }
    
    
    
}
