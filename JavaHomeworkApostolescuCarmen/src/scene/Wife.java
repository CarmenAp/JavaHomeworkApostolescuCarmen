/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scene;

import java.util.Random;

/**
 *
 * @author qqq
 */
public class Wife extends Thread {

     private final Thread womanCigar;

    private final TvShows herFavouriteShow;
 
    public Wife(Thread cigar) {

         super("Wife");

       this.womanCigar = cigar;

         this.herFavouriteShow = TvShows.values()[(new Random()).nextInt(TvShows.values().length)];

    }

 
 
     @Override
 
     public void run() {
 
         System.out.println("Wife enters the scene. ");
 
       womanCigar.start();
       System.out.println("Vogue is lighted up ");
         while (true) {
 
            synchronized (this) {

                try {

                    System.out.println("Wife is sleeping.");

                     wait();
 
               } catch (InterruptedException e) {

                     System.out.println("Wife is awake!");

                   womanCigar.interrupt();
 
                    System.out.println(" and will enjoy her favourite show: "

                            + herFavouriteShow);
 
                    break;

               }
 
             }

        }
 
     }
     public TvShows getHerFavouriteShow() {
        return herFavouriteShow;
   } }