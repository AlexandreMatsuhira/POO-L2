/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio7;
/**
 *
 * @author me
 */
public class Main {
    
    Evento evento = new Evento();
    
    evento.adicionarParticipantes(new Participante("João", new Date(2000, 9, 1), 'M'));
    evento.adicionarParticipantes(new Participante("Maria", new Date(1995, 5, 15), 'F'));
    evento.adicionarPalestrantes(new Palestrante("Carlos", new Date(1980, 2, 10), 'M'));
    evento.adicionarPalestrantes(new Palestrante("Ana", new Date(1992, 11, 25), 'F'));

    
}
