/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author me
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresa = new Empresa("IFSC");
        
        empresa.adicionarFuncionario("Alexandre", 'M', 5000.0);
        empresa.adicionarFuncionario("Maria", 'F', 6000.0);

        empresa.funcionarios.get(0).adicionarDependente("Filho1", 'M');
        empresa.funcionarios.get(0).adicionarDependente("Filho2", 'F');
        empresa.funcionarios.get(1).adicionarDependente("Filha1", 'F');
        
        JOptionPane.showMessageDialog(null, "Total de funcionários femininos: " + empresa.totalFuncionariosFemininos());
        
        String nomeFuncionario = "Alexandre";
        int totalDependentes = empresa.totalDependentesDoFuncionario(nomeFuncionario);
        if (totalDependentes != 0) {
            JOptionPane.showMessageDialog(null, "Total de dependentes de " + nomeFuncionario + ": " + totalDependentes);
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
        }

        JOptionPane.showMessageDialog(null, "Salário médio da empresa: " + empresa.salarioMedio());
    }


    }
    

