import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Players players;
        Computer computer = new Computer();
        Hand hand;
        Referee ref = new Referee();

        String choice = null;

        System.out.println("ROCK, PAPER, SCISSORS!");

        while (choice != "4"){
            System.out.println("\nWHAT'S YOUR WEAPON OF CHOICE?\n");
            System.out.println("" +
                    "[1] ROCK\n" +
                    "[2] PAPER\n" +
                    "[3] SCISSORS\n\n" +
                    "[4] GIVE UP & EXIT THE GAME (a.k.a \"LOSER'S WAY OUT\")");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.next();

            switch (choice){
                case "1":
                    players = new Player1();
                    hand = players.Move(choice);
                    ref.Judge(hand.Move(),computer.Move());
                    break;
                case "2":
                    players = new Player1();
                    hand = players.Move(choice);
                    ref.Judge(hand.Move(),computer.Move());
                    break;
                case "3":
                    players = new Player1();
                    hand = players.Move(choice);
                    ref.Judge(hand.Move(),computer.Move());
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("ENTER A VALUE BETWEEN [1] AND [4]\n");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
