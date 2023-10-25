/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6;

import java.util.ArrayList;


public class Estado {
    String nome;
    String sigla;
    ArrayList<Cidade> cidades;

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.cidades = new ArrayList<>();
    }

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }

    public Cidade cidadeComMaiorPopulacao() {
        Cidade maiorPopulacao = null;
        for (Cidade cidade : cidades) {
            if (maiorPopulacao == null || cidade.getPopulacao() > maiorPopulacao.getPopulacao()) {
                maiorPopulacao = cidade;
            }
        }
        return maiorPopulacao;
    }

    public int quantidadeCidadesComClima(String clima) {
        int count = 0;
        for (Cidade cidade : cidades) {
            if (cidade.getClima().equalsIgnoreCase(clima)) {
                count++;
            }
        }
        return count;
    }

    public double mediaAreasCidades() {

        double totalAreas = 0;
        System.out.println(cidades.size());
        for (Cidade cidade : cidades) {
            totalAreas += cidade.getArea();
        }
        return totalAreas / cidades.size();
    }
}
