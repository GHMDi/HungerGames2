package hungergames.models;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GameController{

    public void assignPlayers() {
        List<Contestants> contestantList = new ArrayList<Contestants>();

        for (int i = 0; i < 24; i++){
            Contestants player = new Contestants();
            contestantList.add(player);
            if (i <= 12){
                player.setFemale(true);
                player.setHealthLevel(100);
                player.setNumber(i+1);
                player.setAttackLevel(ThreadLocalRandom.current().nextInt(1,20));
                player.setDefenseLevel(ThreadLocalRandom.current().nextInt(1,10));

                System.out.println ("Contestant: " + player.number + " " + player.healthLevel+  " "
                        + player.female + " "+ player.attackLevel+ " " + player.defenseLevel);
            }
            else {
                player.setFemale(false);
                player.setHealthLevel(100);
                player.setNumber(i+1);
                player.setAttackLevel(ThreadLocalRandom.current().nextInt(1,20));
                player.setDefenseLevel(ThreadLocalRandom.current().nextInt(1,10));

                System.out.println ("Contestant: " + player.number + " " + player.healthLevel+  " "
                        + player.female + " "+ player.attackLevel+ " " + player.defenseLevel);
            }

        }


            // in deze for loop creer je een void method waarbij je in een loop door het team gaat waarbij het
            // player number i +1 is. Dus player nummer begint bij 1 (omdat index 0 + 1 = nummer 1)
    }

}

