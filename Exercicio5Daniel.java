/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5.daniel;

/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;

public class Exercicio5Daniel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalTemperaturas = 12;
        int somaTemperaturas = 0;

        for (int i = 1; i <= totalTemperaturas; i++) {
            int temperatura;
            do {
                System.out.print("Digite a temperatura " + i + " (entre 4°C e 10°C): ");
                temperatura = entrada.nextInt();
            } while (temperatura < 4 || temperatura > 10);

            somaTemperaturas += temperatura;
        }

        double mediaTemperaturas = (double) somaTemperaturas / totalTemperaturas;
        System.out.println("A média de hoje das temperaturas é: " + Math.round(mediaTemperaturas * 10.0) / 10.0 + "°C");
        
        entrada.close();
    }

}
