/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto_gdr;

/**
 *
 * @author grott
 */
public class GestioneFinali {
    public String controllaFinale(Giocatore g) {
        if (g.getKarma() > 80) {
            return "FINALE EROICO: Sei diventato una leggenda di luce.";
        } else if (g.getKarma() < 20) {
            return "FINALE OSCURO: Il mondo trema al tuo passaggio.";
        } else {
            return "FINALE NEUTRO: Te ne vai dimenticato da tutti.";
        }
    }
}
