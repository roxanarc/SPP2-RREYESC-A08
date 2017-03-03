/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesc.a08;
import java.util.Scanner;
/**
 *
 * @author roxana
 */
public class SPP2RREYESCA08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Estre programa promedia el contenido de las posiciones pares
        //y suma el contenido de las posiciones nones de un arreglo
        int promedio,sumaPar=0,sumaNon=0,cont=0;
       //Por los dos corchetes [][], es de doble dimension
       int[][] matrix={{10,30,89,48,56}, //Los grupos de elementos se separan en comas
                       {32,23,84,20,10},//La matriz va entre llaves y los grupo tambien
                        {72,108,71,402,8}};
       //i incia en 0, el ciclo se ejecuta mientras i<tamaño del arreglo.
       //i se incrementa de dos en dos(por que son pares)
       for (int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j=j+2){
            sumaPar=sumaPar+matrix[i][j];
            cont++;
        }
    }
       promedio=sumaPar/cont;
        System.out.println(promedio);
     
        
         for(int i=0; i<matrix.length; i++){
          for(int j=1;j<matrix[i].length;j=j+2){
              sumaNon=sumaNon+matrix[i][j];
                    
    }
        }
        
        System.out.println(sumaNon);
    }
    
}
        
    
       
    
    
