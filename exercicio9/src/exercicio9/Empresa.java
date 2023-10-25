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
public class Empresa {
    
    String nome;
    ArrayList<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(String nome, char sexo, double salario) {
        funcionarios.add(new Funcionario(nome, sexo, salario));
    }

    public int totalFuncionariosFemininos() {
        int count = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.sexo == 'F') {
                count++;
            }
        }
        return count;
    }

    public int totalDependentesDoFuncionario(String nomeFuncionario) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.nome.equals(nomeFuncionario)) {
                return funcionario.totalDependentes();
            }
        }
        return 0;
        
    }

    public double salarioMedio() {

        double totalSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.salario;
        }

        return totalSalarios / funcionarios.size();
    }

    @Override
    public String toString() {
        return "Empresa [nome=" + nome + ", funcionarios=" + funcionarios + "]";
    }
    
}
