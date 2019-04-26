public class Referee {

    public void Judge(String move, String cpuMove){

        if (move.equals("Rock") && cpuMove.equals("Rock")){
            System.out.println("Tie!");
        }
        else if (move.equals("Rock") && cpuMove.equals("Paper")){
            System.out.println("You lost!");
        }
        else if (move.equals("Rock") && cpuMove.equals("Scissors")){
            System.out.println("You won!");
        }
        else if (move.equals("Paper") && cpuMove.equals("Rock")){
            System.out.println("You won!");
        }
        else if (move.equals("Paper") && cpuMove.equals("Paper")){
            System.out.println("Tie!");
        }
        else if (move.equals("Paper") && cpuMove.equals("Scissors")){
            System.out.println("You Lost!");
        }
        else if (move.equals("Scissors") && cpuMove.equals("Rock")){
            System.out.println("You lost!");
        }
        else if (move.equals("Scissors") && cpuMove.equals("Paper")){
            System.out.println("You won!");
        }
        else if (move.equals("Scissors") && cpuMove.equals("Scissors")){
            System.out.println("Tie!");
        }
        else {
            System.out.println("ERROR!");
        }

    }

}
