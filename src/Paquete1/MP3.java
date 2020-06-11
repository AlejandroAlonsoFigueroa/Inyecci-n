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
public class MP3 implements IMedio{

    @Override
    public void beginPlay() {
        System.out.println("El MP3 empieza a sonar");
    }

    @Override
    public void stopPlay() {
        System.out.println("El MP3 deja de sonar");
    }
    
}
