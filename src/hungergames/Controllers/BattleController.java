package hungergames.Controllers;

import hungergames.models.Contestant.Contestant;

import java.util.ArrayList;
import java.util.Random;

public class BattleController {

    private int attackIndex;
    private int defenseIndex;

    public static class Test {
        public static void main(String[] args) {
            int size = 24;

            ArrayList<Integer> list = new ArrayList<Integer>(size);
            for(int i = 1; i <= size; i++) {
                list.add(i);
            }

            Random rand = new Random();

            while(list.size() > 0) {
                int index = rand.nextInt(list.size());
                System.out.println("Selected: "+list.remove(index));
            }
        }
    }


    public void contestantAttackRandom(GameController controller){
        int size = controller.contestantList.size();
        Random rand = new Random();

            while(size > 0) {
                int index = rand.nextInt(size);
                System.out.println("Selected: "+controller.contestantList.remove(index));
                this.attackIndex = index;
            }
            }

    public void contestantDefenseRandom(GameController controller){
        int size = controller.contestantList.size();
        Random rand = new Random();

        while(size > 0) {
            int index = rand.nextInt(size);
            this.defenseIndex = index;
            if (defenseIndex != attackIndex);
                System.out.println("Selected: "+controller.contestantList.remove(index));
        }


        }
    }


