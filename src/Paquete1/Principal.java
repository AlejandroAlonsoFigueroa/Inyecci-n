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
public class Principal {
    public static void main(String[]args) {
        IMedio mp4 = new MP4() ;
        ReproductorMultimedia reproductor = new ReproductorMultimedia() ;
        reproductor.play(mp4);
        
    }
}
