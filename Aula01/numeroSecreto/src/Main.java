import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int secretNumber = gerador.nextInt(10 )+1;
        boolean acertou = false;

        while(!acertou){
            System.out.println("Bem vindo ao jogo de adivinhação. Escolha um numero de 1 a 10: ");
            int palpite = scan.nextInt();

            if(palpite == secretNumber){
                System.out.println("Boa você acertou, o numero era: " + secretNumber);
                secretNumber = gerador.nextInt(10 )+1;
                acertou = true;
            }else if (palpite < secretNumber){
                System.out.println("Um pouco maior");
            }else if (palpite > 10){
                System.out.println("Apenas números de 1 a 10 por favor");
            }else{
                System.out.println("Um pouco menor");
            }

        }
    }
}