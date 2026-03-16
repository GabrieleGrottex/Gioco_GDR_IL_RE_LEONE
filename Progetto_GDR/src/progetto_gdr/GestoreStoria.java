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
        NodoScena inizio = new NodoScena("Ti svegli nella prateria del tuo futuro regno. Cosa fai?", "immagine da mettere");
        inizio.aggiungiScelta("Esplora il sentiero", 1, 0);
        inizio.aggiungiScelta("Urla aiuto", 2, -5);
        
        scene.put(0, inizio);
        scene.put(1, inizio);
        scene.put(2, inizio);
        scene.put(3, inizio);
        scene.put(4, inizio);
        scene.put(5, inizio);
        scene.put(6, inizio);
        scene.put(7, inizio);
        scene.put(8, inizio);
        scene.put(9, inizio);
        scene.put(10, inizio);
        scene.put(11, inizio);
        scene.put(12, inizio);
        scene.put(13, inizio);
        scene.put(14, inizio);
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
