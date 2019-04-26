import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    public String Move() {

        List list = new ArrayList();
        list.add("Rock");
        list.add("Paper");
        list.add("Scissors");

        Random random = new Random();
        int randomIndex = (int) (Math.random() * list.size());
        String cpuMove = list.get(randomIndex).toString();

        System.out.println("Computer chose to play " + cpuMove.toUpperCase());
        return cpuMove;
    }
}
