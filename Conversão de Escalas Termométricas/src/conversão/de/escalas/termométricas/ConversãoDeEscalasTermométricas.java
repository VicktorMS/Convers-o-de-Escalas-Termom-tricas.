/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversão.de.escalas.termométricas;

import java.util.Scanner;


public class ConversãoDeEscalasTermométricas {

    public static void main(String[] args) {
      
        int boot_celcius, boot_kelvin, boot_fahrenheit, boot;
        double celcius, kelvin, fharenheint;
        
        Scanner abc = new Scanner (System.in);
        System.out.println("Bem vindo ao Conversor de Escalas Termométricas." + "\n" + 
                "" + "\n" +
                "Digite 1 para Conversão de Celcius para Fharenheint e Kelvin:" + "\n" +
                "Digite 2 para Conversão de Kelvin para Fharenheint e Celcius:" + "\n" +
                "Digite 3 para Conversão de Fahrenheit para Celcius e Kelvin: "  + "\n" +
                "Digite 4 para para encerrar o programa."  + "\n" +
                "-->") ;
       
        boot = abc.nextInt();
                
        switch (boot) {
            case 1:
                System.out.println("Digite a temperatura que deseja converter.");
                celcius = abc.nextInt();
                fharenheint = ( celcius * 9 / 5) + 32 ;
                kelvin = celcius + 273.15;
                System.out.println(celcius + "°C são " + kelvin + "K e " + fharenheint + "°F.");
                break;
            case 2:
                System.out.println("Digite a temperatura que deseja converter.");
                kelvin = abc.nextInt();
                fharenheint = ( kelvin - 273.15) * 9/5 + 32;
                celcius = kelvin - 273.15;
                System.out.println(kelvin + " K são " + celcius + "°C e " + fharenheint + "°F.");
                break;
            case 3:
                System.out.println("Digite a temperatura que deseja converter.");
                fharenheint = abc.nextInt();
                kelvin = (fharenheint - 32) * 5/9 +273.15;
                celcius = (fharenheint - 32) * 5/9;
                System.out.println(fharenheint + "°F são " + celcius + "°C e " + kelvin + "K.");
                break;
            case 4:
                System.out.println("Programa Encerrado");
                System.exit(0);
                break;
            default:
                break;
        }
        
    }
    
}
