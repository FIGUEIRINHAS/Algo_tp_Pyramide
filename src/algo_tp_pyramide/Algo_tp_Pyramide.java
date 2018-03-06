/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_tp_pyramide;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author florian
 */
public class Algo_tp_Pyramide {
    public static char etoile = '*';
    //On créer un attribut

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creation d'un objet sur l'entrée standard
        Scanner sc = new Scanner(System.in);
            //verirication du type entier
            if(sc.hasNextInt()){
                int h = sc.nextInt();
                //traitement pour fabriquer la pyramide
                    for (int i= 0; i<= h; i++) {
                    //boucle hauteur
                        for (int j= 0; j< h- i; j++) {
                        //boucle espace
                            System.out.print(" ");
                        }    
                        for (int k= 0; k<= 2*i; k++) {
                        //boucle etoile    
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                        
            }
    }
    
}
