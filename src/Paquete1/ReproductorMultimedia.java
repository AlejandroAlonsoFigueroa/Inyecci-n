/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author alexa
 */
public class ReproductorMultimedia {
    public void play(IMedio medio) {
        medio.beginPlay();
    }
    public void stopPlay(IMedio medio) {
        medio.stopPlay();
    }
    
}
