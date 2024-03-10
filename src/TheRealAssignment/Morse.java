package TheRealAssignment;

import java.util.Scanner;


public class Morse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Converter converter = new Converter();


        while (true) {
            System.out.println("Skriv in en stor bokstav (A-Z) eller en siffra (0-9) eller en symbol(. , ?) eller skriv i Morse");
            System.out.println("För att avsluta, skriv Stop");
            String text = scan.nextLine();
            String resultat = converter.getMorseorText(text);
            if (!text.equalsIgnoreCase("Stop")){
            } else {
                converter.getMorseorText(text);
                System.out.println("Stoppar programmet!");
                System.out.println("Ha en bra dag! :)");
                break;
            }
            if (resultat != null) {
            } else {
                System.out.println("Du skrev inte en korrekt stor bokstav, siffra, symbol eller Morse");
                System.out.println("Starta programmet igen och försök en gång till :)");
                break;
            }
            System.out.println("Den konverterade texten är: " + resultat);

        }
    }
}
