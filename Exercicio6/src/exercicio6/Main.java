/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6;

//import javax.swing.JOptionPane;

import javax.swing.JOptionPane;


/**
 *
 * @author ORION-02791
 */
public class Main {
    
    public static void main(String[] args) {
        Estado estado = new Estado("Santa Catarina", "SC");

        estado.adicionarCidade(new Cidade("Lages", 10009, "Tropical", 1000.12));
        estado.adicionarCidade(new Cidade("Joacaba", 450, "Tropical", 795.98));
        estado.adicionarCidade(new Cidade("Campo Belo", 800, "Equatorial", 280.67));
        
        
         String dadosEstado = "Estado: " + estado.nome + " (" + estado.sigla + ")\n";
        for (Cidade cidade : estado.getCidades()) {
            dadosEstado += "Cidade: " + cidade.getNome() +
                    ", População: " + cidade.getPopulacao() +
                    ", Clima: " + cidade.getClima() +
                    ", Área: " + cidade.getArea() + "\n";
        }
        JOptionPane.showMessageDialog(null, dadosEstado, "Dados do Estado e Cidades",1);
        
        Cidade cidadeMaiorPopulacao = estado.cidadeComMaiorPopulacao();
        
        //cidade com maior populacao mostra
        JOptionPane.showMessageDialog(null, "Cidade com Maior População: " + cidadeMaiorPopulacao.getNome(),
                "Maior População", 1);
        
        String climaDesejado = JOptionPane.showInputDialog("Digite o clima desejado:");
        int quantidadeCidadesComClima = estado.quantidadeCidadesComClima(climaDesejado);
        JOptionPane.showMessageDialog(null, "Quantidade de cidades com clima " + climaDesejado + ": " +
                quantidadeCidadesComClima, "Cidades por Clima", 1);
        
        //mostra media
        double mediaAreasCidades = estado.mediaAreasCidades();
        JOptionPane.showMessageDialog(null, "Média das Áreas das Cidades: " + mediaAreasCidades + " km²",
                "Média de Áreas", 1);

        
        


    }
}
