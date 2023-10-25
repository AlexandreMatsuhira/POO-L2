/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6;

/**
 *
 * @author ORION-02791
 */
public class Cidade {
    
    String nome;
    int populacao;
    String clima;
    double area;

    public Cidade(String nome, int populacao, String clima, double area) {
        this.nome = nome;
        this.populacao = populacao;
        this.clima = clima;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getClima() {
        return clima;
    }

    public double getArea() {
        return area;
    }
}
