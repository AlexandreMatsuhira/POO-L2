/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio7;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author me
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Evento evento = new Evento();

        Calendar dataNascimentoAlexandre = new GregorianCalendar(2000, Calendar.AUGUST, 1);
        Calendar dataNascimentoCbum = new GregorianCalendar(1995, Calendar.APRIL, 15);
        Calendar dataNascimentoRodriga = new GregorianCalendar(1980, Calendar.JANUARY, 10);
        Calendar dataNascimentoDina = new GregorianCalendar(1992, Calendar.OCTOBER, 25);
        
        evento.adicionarParticipante("Alexandre", dataNascimentoAlexandre, 'M');
        evento.adicionarParticipante("Cbuma", dataNascimentoCbum, 'F');

        evento.adicionarPalestrante("Rodriga", dataNascimentoRodriga, 'M');
        evento.adicionarPalestrante("Dina", dataNascimentoDina, 'F');
        
         JOptionPane.showMessageDialog(null, "Total de participantes: " + evento.totalParticipantes());
        JOptionPane.showMessageDialog(null, "Total de palestrantes: " + evento.totalPalestrantes());

        Calendar dataLimite = new GregorianCalendar(2020, Calendar.OCTOBER, 3);
     
        
    
        
        String participantesAntesDe2020 = "Participantes nascidos antes de 03/10/2020:\n";
        ArrayList<Participante> antesDe2020 = evento.participantesAntesDe(dataLimite);
        for (Participante participante : antesDe2020) {
            participantesAntesDe2020 += participante.pessoa.nome + "\n";
        }
        JOptionPane.showMessageDialog(null, participantesAntesDe2020);
        
        String palestrantesMasculinos = "Palestrantes do sexo masculino:\n";
        ArrayList<Palestrante> masculinos = evento.palestrantesMasculinos();
        for (Palestrante palestrante : masculinos) {
            palestrantesMasculinos += palestrante.pessoa.nome + "\n";
        }
        JOptionPane.showMessageDialog(null, palestrantesMasculinos);
    }

        

        
        
    }
    

