package com.datastructureexercice;

import java.util.Arrays;

public class TheArraysClass {

    public static void main(String[] args) {

        // tableau simple  instanciation + remplissage manuel
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "yellow";
        // affichage apres remplissage
        System.out.print("affichage apres remplissage : ");
        System.out.println(Arrays.toString(colors)  );
        // si on veut faire un affichage par case on fait
        System.out.print("affichage  d'une seule case : ");
        System.out.println(colors[0]);
        // on prends l'index 0 comme etant la premiere case du tableau
        // type de boucles
        // classic
        System.out.print("affichage d'un tableau avec la boucle for classic : \n");
        for (int i=0;i<colors.length;i++){
            System.out.println(colors[i]);
        }
        System.out.print("affichage avec boule for inhanced : \n");
        for( String c : colors){
            System.out.println(c);
        }
        // affichage avec les streams
        System.out.print("affichage avec les streams : \n");
        Arrays.stream(colors).forEach(System.out::println);


    }

}
