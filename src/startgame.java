import java.util.Random;
import java.util.Scanner;

public class startgame {
    public static void startGame() {
        String [] rps = {"r", "p", "s"};

        Scanner input = new Scanner(System.in);
        String userChoice;


        do {
            System.out.println("Välj r, p eller s: ");
            userChoice = input.next();

            if (!userChoice.equals("r") && !userChoice.equals("p") && !userChoice.equals("s")) {
                System.out.println("Felaktigt val, försök igen.");
            }
        } while (!userChoice.equals("r") && !userChoice.equals("p") && !userChoice.equals("s"));

        Random random = new Random();
        int randomIndex = random.nextInt(rps.length);
        String cpuChoice = rps[randomIndex];

        System.out.println("Datorns val: " + cpuChoice);

        if (userChoice.equals(cpuChoice)) {
            System.out.println("Oavgjort");
        } else if ((userChoice.equals("r") && cpuChoice.equals("s"))
                || (userChoice.equals("p") && cpuChoice.equals("r"))
                || (userChoice.equals("s") && cpuChoice.equals("p"))) {
            System.out.println("Grattis du vann!!");
        } else {
            System.out.println("Du förlorade!");
        }
        System.out.println("Vill du ha returmatch? (j/n)");

        Scanner decision = new Scanner(System.in);
        String returmatch = decision.next();

        if (returmatch.equals("j")) {
            startGame();
        } else {
            System.out.println("Bra spelat");
        }

    }
}
