/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto_gdr;

import java.io.Serializable;
/**
 *
 * @author grott
 */
abstract class Personaggio implements Serializable {
    protected String nome;
    protected int hp;
    protected int forza;

    public Personaggio(String nome, int hp, int forza) {
        this.nome = nome;
        this.hp = hp;
        this.forza = forza;
    }

    public abstract void eseguiAzione();
}
