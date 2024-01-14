import java.util.*;

//aprendendo a programar em java 13/01/2024


public class JogoAdvinha {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int advinhar = random.nextInt(10)+1;
        int chance = 5;

        System.out.println("          _ _       _       _                  \n" + //
                "  __ _  __| (_)_   _(_)_ __ | |__   ___    ___  \n" + //
                " / _` |/ _` | \\ \\ / / | '_ \\| '_ \\ / _ \\  / _ \\ \n" + //
                "| (_| | (_| | |\\ V /| | | | | | | |  __/ | (_) |\n" + //
                " \\__,_|\\__,_|_| \\_/ |_|_| |_|_| |_|\\___|  \\___/ \n" + //
                "                                                \n" + //
                "                                      \n" + //
                " _ __  _   _ _ __ ___   ___ _ __ ___  \n" + //
                "| '_ \\| | | | '_ ` _ \\ / _ \\ '__/ _ \\ \n" + //
                "| | | | |_| | | | | | |  __/ | | (_) |\n" + //
                "|_| |_|\\__,_|_| |_| |_|\\___|_|  \\___/ \n" + //
                "");

        while (chance !=0) {
            
        System.out.print("Escolha um numero de 1 a 10: ");
        int escolha = scanner.nextInt();
        chance --;

        if (advinhar == escolha) {
            System.out.println("voce acertou com " +chance+ " tentativas restante");
            break;
        }else if(chance != 0){
            System.out.println("voce errou mas ainda tem " +chance+ " tentativas");
        }else{
            System.out.println("voce perdeu o numero escolhido é " +advinhar);
        }

        }
    
    }
}