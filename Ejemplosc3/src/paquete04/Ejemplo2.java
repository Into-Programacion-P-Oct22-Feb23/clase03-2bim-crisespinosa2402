/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        double[][] dato1 = {{1, 2, 3},{6, 8, 9}};
        double [][] arregloResultante = new double[2][3];
        double valor;
        String serie = "";
        
        for(int fila = 0; fila < dato1.length; fila++){
           for(int colum = 0; colum < dato1[fila].length; colum++){
              valor = dato1[fila][colum];
               if (valor%2 == 0){
                   arregloResultante[fila][colum] = Math.pow(valor, 2);   
               }else{
                   arregloResultante[fila][colum] = valor;
               }
           }
        }
        for(int fila = 0; fila < dato1.length; fila++){
            serie = serie + "\n";
            for(int colum = 0; colum < dato1[fila].length; colum++){
                serie = String.format("%s%.0f\t", serie, arregloResultante[fila][colum]);
            }
        }
           //CRISTIAN ESPINOSA
        System.out.println(serie);
        /*
            1   4   3
            36  64  9
        */
        
    }
    
}
