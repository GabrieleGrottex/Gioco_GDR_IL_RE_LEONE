/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto_gdr;

/**
 *
 * @author grott
 */
public class Nemico extends Personaggio {
    public Nemico(String nome, int hp, int forza) {
        super(nome, hp, forza);
    }

    @Override
    public void eseguiAzione() {
        System.out.println(nome + " attacca ferocemente!");
    }
}
