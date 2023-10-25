/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

import java.util.Calendar;


/**
 *
 * @author me
 */
public class Palestrante {
    
     Pessoa pessoa;

    public Palestrante(String nome, Calendar dataNascimento, char sexo) {
        this.pessoa = new Pessoa(nome, dataNascimento, sexo);
    }
    
}
