/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author me
 */
public class Evento {
    
    ArrayList<Participante> participantes;
    ArrayList<Palestrante> palestrantes;

    public Evento() {
        this.participantes = new ArrayList<>();
        this.palestrantes = new ArrayList<>();
    }
    
    public void adicionarParticipante(String nome, Calendar dataNascimento, char sexo) {
        participantes.add(new Participante(nome, dataNascimento, sexo));
    }

     public void adicionarPalestrante(String nome, Calendar dataNascimento, char sexo) {
        palestrantes.add(new Palestrante(nome, dataNascimento, sexo));
    }
    
     public int totalParticipantes() {
        return participantes.size();
    }
     
     public int totalPalestrantes() {
        return palestrantes.size();
    }
     
    public ArrayList<Participante> participantesAntesDe(Calendar dataLimite) {
        ArrayList<Participante> antesDe = new ArrayList<>();
        for (Participante participante : participantes) {
            if (participante.pessoa.dataNascimento.before(dataLimite)) {
                antesDe.add(participante);
            }
        }
        return antesDe;
    }
    
    public ArrayList<Palestrante> palestrantesMasculinos() {
        ArrayList<Palestrante> masculinos = new ArrayList<>();
        for (Palestrante palestrante : palestrantes) {
            if (palestrante.pessoa.sexo == 'M') {
                masculinos.add(palestrante);
            }
        }
        return masculinos;
    }
}
