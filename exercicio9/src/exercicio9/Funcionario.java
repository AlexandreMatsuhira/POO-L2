/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio9;

import java.util.ArrayList;

/**
 *
 * @author me
 */
public class Funcionario {
    
    String nome;
    char sexo;
    double salario;
    ArrayList<Dependente> dependentes;
    
    public Funcionario(String nome, char sexo, double salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
        this.dependentes = new ArrayList<>();
    }
    
    public void adicionarDependente(String nome, char sexo) {
        dependentes.add(new Dependente(nome, sexo));
    }
    
      public int totalDependentes() {
        return dependentes.size();
    }
      
          @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", sexo=" + sexo + ", salario=" + salario + ", dependentes=" + dependentes + "]";
    }

    
}
