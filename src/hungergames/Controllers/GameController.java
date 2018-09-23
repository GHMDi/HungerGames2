package hungergames.Controllers;
import hungergames.models.Contestant.CareerContestant;
import hungergames.models.Contestant.Contestant;
import hungergames.models.Contestant.DistrictContestant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameController{

    List<Contestant> contestantList = new ArrayList<Contestant>();

    public void assignDistrictPlayers() {

        // ADD 75% (18 District contestants and 6 Career Contestants
        for (int i = 0; i < 18; i++) {
            Contestant player = new DistrictContestant();
            contestantList.add(player);
            player.setHealthLevel(100);
            player.setNumber(i + 1);
            player.setAttackLevel(ThreadLocalRandom.current().nextInt(1, 30));
            player.setDefenseLevel(ThreadLocalRandom.current().nextInt(1, 10));
            if (i <= 9) {
                player.setFemale(true);
                System.out.println("District Contestant: " + player.getNumber() + " " + player.getHealthLevel() + " "
                        + player.isFemale() + " " + player.getAttackLevel() + " " + player.getDefenseLevel()+ " "
                        + player.isHasWeapon());
            }
            else {
                player.setFemale(false);
                System.out.println("District Contestant: " + player.getNumber() + " " + player.getHealthLevel() + " "
                        + player.isFemale() + " " + player.getAttackLevel() + " " + player.getDefenseLevel()+ " "
                        + player.isHasWeapon());
            }
        }
    }

        public void assignCareerPlayers(){

            // ADD 25% (6 Career Contestants)
            for (int i = contestantList.size(); i < 24; i++){
                Contestant player = new CareerContestant();
                contestantList.add(player);
                player.setHealthLevel(100);
                player.setNumber(i+1);
                player.setAttackLevel(ThreadLocalRandom.current().nextInt(10,40));
                player.setDefenseLevel(ThreadLocalRandom.current().nextInt(5,15));
                player.setHasWeapon(true);
                if (i <= 20){
                    player.setFemale(true);
                    System.out.println ("Career Contestant: " + player.getNumber() + " " + player.getHealthLevel()+  " "
                            + player.isFemale() + " "+ player.getAttackLevel()+ " " + player.getDefenseLevel() + " "
                            + player.isHasWeapon());
                }
                else if(i >= 21) {
                    player.setFemale(false);
                    System.out.println("Career Contestant: " + player.getNumber() + " " + player.getHealthLevel() + " "
                            + player.isFemale() + " " + player.getAttackLevel() + " " + player.getDefenseLevel() + " "
                    + player.isHasWeapon());
                }
            }


        // in deze for loop creer je een void method waarbij je in een loop door het team gaat waarbij het
        // player number i +1 is. Dus player nummer begint bij 1 (omdat index 0 + 1 = nummer 1)
    }

    public void controlGame(Contestant contestant) {
        // check with Eva & Rick how to access the contestants in controlGame method.
        int size = contestantList.size();
        Random randA = new Random();
        Random randO = new Random();

        for (int i = 0; i > size; i++) {
            int indexA = randA.nextInt(size);
            System.out.println("Day: " + i);
            System.out.println("Selected Attacker: " + contestantList.remove(indexA));
            contestant.getNumber();
            contestant.getHealthLevel();
            contestant.getAttackLevel();
            contestant.getDefenseLevel();
            contestant.setAttacker(true);
            System.out.println(contestant.getAttackLevel());
            System.out.println(contestant.isOpponent());

            int indexO = randO.nextInt(size);
            System.out.println("Selected Opponent: " + contestantList.remove(indexO));
            System.out.println(contestant.getAttackLevel());
            System.out.println("Selected Opponent");
            contestant.getNumber();
            contestant.getHealthLevel();
            contestant.getAttackLevel();
            contestant.getDefenseLevel();
            contestant.setOpponent(true);
            System.out.println(contestant.getAttackLevel());
            System.out.println(contestant.isOpponent());


//
//        }
//        while(size > 0) {
//            int index = rand.nextInt(size);
//            System.out.println("Selected: "+ contestantList.remove(index));
//        }
        }
    }

    public List<Contestant> getContestantList() {
        return contestantList;
    }

    public void setContestantList(List<Contestant> contestantList) {
        this.contestantList = contestantList;
    }
}
