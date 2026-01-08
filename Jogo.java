package Dominio;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static int opcao;

    public static void play() {
        Scanner scanner = new Scanner(System.in);
;
        while (opcao != 4) {
            System.out.println("-----------------");
            System.out.println("[1] Pedra");
            System.out.println("[2] Papel");
            System.out.println("[3] Tesoura");
            System.out.println("[4] Sair");
            System.out.println("-------------------");

            System.out.print("Digite sua opcao: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    Result();
                    continue;
                case 2:
                    Result();
                    continue;
                case 3:
                    Result();
                    continue;
                case 4:
                    System.out.println("Saindo...");
                    break;
            }
        }
    }

    public static int BotSelection() {
        Random random = new Random();

        return random.nextInt(3) + 1;
    }

    public static void Result() {
        int Botchose = BotSelection();

       if (opcao == 1 && Botchose == 1) {
           System.out.println("Voces empataram, tente novamente !");
       } else if (opcao == 1 && Botchose == 2) {
           System.out.println("Voce Perdeu, Tente novamente!");
       } else if (opcao == 1 && Botchose == 3) {
           System.out.println("voce ganhou, parabens!");
       } else if (opcao == 2 && Botchose == 1) {
           System.out.println("voce ganhou, parabens!");
       } else if (opcao == 2 && Botchose == 2) {
           System.out.println("Voces empataram, tente novamente !");
       } else if (opcao == 2 && Botchose == 3) {
           System.out.println("voce perdeu, tente novamente !");
       } else if (opcao == 3 && Botchose == 1) {
           System.out.println("voce perdeu, tente novamente !");
       } else if (opcao == 3 && Botchose == 2) {
           System.out.println("voce ganhou, parabens!");
       } else if (opcao == 3 && Botchose == 3) {
           System.out.println("Voces empataram, tente novamente !");
       }
    }

    public static void main (String[] args) {
        play();
    }
}
