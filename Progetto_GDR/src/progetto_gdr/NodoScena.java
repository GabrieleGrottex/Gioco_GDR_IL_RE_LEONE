/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto_gdr;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grott
 */
public class NodoScena {
    private String testoNarrativo;
    private String pathImmagine;
    private List<Scelta> opzioni;

    public NodoScena(String testo, String img) {
        this.testoNarrativo = testo;
        this.pathImmagine = img;
        this.opzioni = new ArrayList<>();
    }

    public void aggiungiScelta(String testo, int destinazione, int karma) {
        opzioni.add(new Scelta(testo, destinazione, karma));
    }

    public String getTestoNarrativo() { 
        return testoNarrativo; 
    }
    public String getPathImmagine() { 
        return pathImmagine; 
    }
    public List<Scelta> getOpzioni() { 
        return opzioni; 
    }
}
