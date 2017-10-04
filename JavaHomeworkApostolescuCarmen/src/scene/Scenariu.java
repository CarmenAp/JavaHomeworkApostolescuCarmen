/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scene;

/**
 *
 * @author qqq
 */
public class Scenariu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Thread tv = new SonyTv(new Husband(new Wife(new Cigar()), new VacumCleaner()));
 
        tv.start();
     }}
