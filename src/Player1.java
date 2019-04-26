public class Player1 extends Players {

    public Hand Move(String choice) {

        if (choice.equals("1")){
            return new Rock();
        }
        else if (choice.equals("2")){
            return new Paper();
        }
        else if (choice.equals("3")){
            return new Scissors();
        }
        else{
            System.out.println("ERROR!");
            return null;
        }

    }
}
