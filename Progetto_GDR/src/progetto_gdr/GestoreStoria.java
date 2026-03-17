/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto_gdr;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author grott
 */
public class GestoreStoria {
    private Map<Integer, NodoScena> scene;
    private int idScenaCorrente;

    public GestoreStoria() {
        scene = new HashMap<>();
        idScenaCorrente = 0;
        creaStoria();
    }
    private void creaStoria() {
    
        NodoScena s0 = new NodoScena("Ti svegli tra gli animali nella prateria. Il sole sorge sul tuo regno.", "animali nella prateria.png");
        s0.aggiungiScelta("Sali sulla Roccia Panoramica", 1, 2);
        s0.aggiungiScelta("Vai verso le terre aride", 3, -1);
        scene.put(0, s0);

        NodoScena s1 = new NodoScena("Dalla Roccia Panoramica vedi tutto l'orizzonte.", "roccia paoramica.png");
        s1.aggiungiScelta("Entra nel Regno del Re", 2, 5);
        s1.aggiungiScelta("Scendi verso la pianura desolata", 4, 0);
        scene.put(1, s1);

        NodoScena s2 = new NodoScena("Il Regno del Re brilla d'oro.", "regno del re.png");
        s2.aggiungiScelta("Vai all'albero della savana", 12, 10);
        scene.put(2, s2);

        NodoScena s3 = new NodoScena("Il caldo è insopportabile nelle terre aride.", "terre aride della savana.png");
        s3.aggiungiScelta("Cerca acqua alla pozza", 10, 0);
        s3.aggiungiScelta("Prosegui verso la zona di Scar", 5, -5);
        scene.put(3, s3);

        NodoScena s4 = new NodoScena("Vento e polvere nella pianura desolata.", "pianura desolata.png");
        s4.aggiungiScelta("Torna alla prateria", 0, 0);
        scene.put(4, s4);

        NodoScena s5 = new NodoScena("Sei nella cupa zona di Scar. Senti delle risate...", "zona di scar.png");
        s5.aggiungiScelta("Scappa verso la valle nebbiosa", 13, 0);
        s5.aggiungiScelta("Entra nel luogo dove è morto il padre", 6, -10);
        scene.put(5, s5);

        NodoScena s6 = new NodoScena("Un luogo silenzioso e triste. Qui è dove è morto il padre.", "dove è morto il padre.png");
        s6.aggiungiScelta("Vai alla pianura dei resti", 14, 0);
        scene.put(6, s6);

        NodoScena s7 = new NodoScena("Senti un odore strano... è la zona del maiale.", "zona del maiale.png");
        s7.aggiungiScelta("Entra nella giungla tropicale", 8, 2);
        scene.put(7, s7);

        NodoScena s8 = new NodoScena("Hakuna Matata! La giungla tropicale è rigogliosa.", "giungla tropicale.png");
        s8.aggiungiScelta("Vai alla platea cremis", 9, 0);
        scene.put(8, s8);

        NodoScena s9 = new NodoScena("Sei sulla platea cremis. Un posto magico.", "platea cremis.png");
        s9.aggiungiScelta("Torna alla pozza d'acqua", 10, 0);
        scene.put(9, s9);
    
        NodoScena s10 = new NodoScena("Ti rinfreschi alla pozza d'acqua della savana.", "pozza d'acqua della savana.png");
        s10.aggiungiScelta("Segui il fiume di fango", 11, 0);
        scene.put(10, s10);

        NodoScena s11 = new NodoScena("Un fiume di fango ti sbarra la strada.", "fiume di fango.png");
        s11.aggiungiScelta("Vai al grande albero", 12, 0);
        scene.put(11, s11);

        NodoScena s12 = new NodoScena("Il grande albero della savana domina la pianura.", "grande albero della savana.png");
        s12.aggiungiScelta("Guarda verso la valle nebbiosa", 13, 0);
        scene.put(12, s12);

        NodoScena s13 = new NodoScena("La nebbia è fitta nella valle nebbiosa.", "valle nebbiosa.png");
        s13.aggiungiScelta("Vai alla pianura dei resti", 14, 0);
        scene.put(13, s13);

        NodoScena s14 = new NodoScena("Ossa ovunque. La pianura dei resti segna la fine del viaggio.", "la pianura dei resti.png");
        s14.aggiungiScelta("Ricomincia il ciclo della vita", 0, 10);
        scene.put(14, s14);
}

    public NodoScena getScenaAttuale() {
        return scene.get(idScenaCorrente);
    }

    public void vaiAllaScena(int id) {
        if (scene.containsKey(id)) {
            this.idScenaCorrente = id;
        }
    }
}
