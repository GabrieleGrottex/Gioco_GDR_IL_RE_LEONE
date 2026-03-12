/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto_gdr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grott
 */
public class StatoGioco implements Serializable {
    private static final long serialVersionUID = 1L; // Identificatore per la serializzazione
    
    public String nomeGiocatore;
    public int hp;
    public int karma;
    public int idScenaCorrente;
    public List<String> decisioniPrese;

    public StatoGioco(Giocatore g, int idScena) {
        this.nomeGiocatore = g.nome;
        this.hp = g.hp;
        this.karma = g.getKarma();
        this.idScenaCorrente = idScena;
        this.decisioniPrese = new ArrayList<>();
    }
}