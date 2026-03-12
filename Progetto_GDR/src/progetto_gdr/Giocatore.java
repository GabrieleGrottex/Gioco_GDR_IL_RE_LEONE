/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto_gdr;

/**
 *
 * @author grott
 */
public class Giocatore extends Personaggio {
    private int karma;

    public Giocatore(String nome) {
        super(nome, 100, 20);
        this.karma = 50; // Neutro
    }

    @Override
    public void eseguiAzione() {
        System.out.println(nome + " usa Ruggito Regale!");
    }

    public void modificaKarma(int valore) { this.karma += valore; }
    public int getKarma() { return karma; }
    public void setKarma(int k) { this.karma = k; }
}
