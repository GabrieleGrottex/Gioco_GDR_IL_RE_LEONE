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
    public String nome;

    public Personaggio(String nome) {
        this.nome = nome;
    }
}
