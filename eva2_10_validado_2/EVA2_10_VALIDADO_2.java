/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_validado_2;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_10_VALIDADO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner(System.in);
        while(true){
            System.out.println("Numero corresponda al dia (1-7)");
        dia = captu.nextInt(); 
        if(dia >= 1 && dia <= 7)
            break;
        }
        switch (dia){
             case 1:
             System.out.println("Lunes");
             break;// ultima isntruccion - FIN DEL CASO
             case 2:
             System.out.println("Martes");
             break;
             case 3:
             System.out.println("MIercoles");
             break;
             case 4:
             System.out.println("Jueves");
             break;
             case 5:
             System.out.println("Viernes");
             break;
             case 6:
             System.out.println("Sabado");
             break;
             case 7:
             System.out.println("Domingo");
             break;
             default: 
    }
    }  
}
