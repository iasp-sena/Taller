/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.csf.miprimeravezconmaven;

/**
 *
 * @author Ismael
 *
 * - private + public ~ (package /default) # protected
 */
public class MiPrimeraClase {

    public static void main(String[] args) {
        System.out.println("");
        /*
        boolean -> 1/0 -> true/false
        
        Enteros
        byte    -> 8 bits -> 11110000; 127 - -128
        short   -> 2 bytes; -> 16bits
        int     -> 4 bytes -> 32 bits
        long    -> 8 bytes -> 64 bits
        
        Decimales
        float   -> 32 bits;
        double  -> 64 bits
        
        Caracteres
        char    -> 8bits;
        String  -> Dinámicamente
        
        
        
        UperCamellCase  -> Clases.
        lowerCamellCase -> atributos, parámetros, variables o métodos.
        UPER_CONST      -> CONSTANTES
        
        
        tipoDeDato nombreVariable;
        tipoDeDato nombreVariable = valor;
        
         */
        int numeroEntero;
        int otroNumero = 123;

        boolean respuesta = true;//false;

        byte numeroByte = 123;
        short numeroShort = 12312;
        int numeroInt = 1232312312;
        long numeroLong = 23123123123L;

        float numeroFloat = 123123123.0F;
        double numeroDouble = 123123.0;

        char miChar = '@';
        String variosCaracteres1 = "Hola";
        String variosCaracteres2 = "mundo";
        String variosCaracteres3 = variosCaracteres1 + variosCaracteres2;
        String cariosCaracteres4 = variosCaracteres1.concat(variosCaracteres2);

        //Comentario de linea
        /*
        Comentario en bloque
         */
        int variable = 3;

        System.out.println(++variable);//4
        System.out.println(variable++);//3
        /*
        Operadores
        + sumar         -> 3+5 = 8
        - restar        -> 5-3 = 2
        * multiplicar   -> 2*3 = 6
        / dividir       -> 8/4 = 2
        % residuo       -> 5/3 = 2
        
        Incrementos
        ++  Incremento 
                Pre     ++variable
                Pos     variable++
        --  Decremento
                Pre     --variable
                Pos     variable--
        
        Operadores de agrupación
        ()
        {}
        
        &   AND          true & false = false 
        |   OR           false | false = false
        ^   XOR (OR Exclusivo)  true ^ true = false
        ! negacion  !valor         !true = false;
        
        &&  AND
        ||  OR
        
        <       3 < 3   = false
        <=      3 <= 3  = true
        >       3 > 3   = false
        >=      3 >= 3  = true
        ==      3 == 4  = false
        !=      3 !=4   = true
        
        =   Asignación
        
        Concatenar
        +   "Hola" + "mundo" = "Holamundo"
         */

 /*
        //Estructuras de control
        if(condicion){...}
        if(condicion){...condicion verdadera ...} else {... condicion falsa ...}
        
        if(condicion1){...condicion verdadera ...} 
        else if(condicion2){...condicion verdadera ...} 
        else {... condicion falsa ...}
         */
        if (4 < 4) {
            System.out.println("Tres es menor que 4");
        }

        if (4 < 4) {
            System.out.println("Cuatro es menor que 4");
        } else {
            System.out.println("Cuatro no es menor que 4");
        }

        if (3 <= 4) {
            System.out.println("Tres es menor o igual que 4");
        } else if (4 <= 4) {
            System.out.println("Cuatro es menor o igual que 4");
        } else {
            System.out.println("Cuatro no es menor que 4");
        }

    /*
        switch(){}
        */
        int numSW = 3;
        switch (numSW) {
            case 3: System.out.println("Ejecuto caso 3"); break;
            case 1: System.out.println("Ejecuto caso 1"); break;
            case 2: System.out.println("Ejecuto caso 2"); break;
            case 4: System.out.println("Ejecuto caso 4"); break;
            default: System.out.println("Ejecuto default");
        }
        /*
        while(){}
        do{} while();
        for(){}
        
        
     */
    }
}
