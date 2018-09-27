package hungergames.Controllers;
import hungergames.models.Contestant.CareerContestant;
import hungergames.models.Contestant.Contestant;
import hungergames.models.Contestant.DistrictContestant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameController {

    protected List<Contestant> contestantList = new ArrayList<Contestant>();

    private Contestant Attacker;
    private Contestant Opponent;
    private int indexO;
    private int indexA;

    // create coin for coinflip on attack level
    private enum Coin {Attacker, Opponent}

    public void assignDistrictPlayers() {

        // ADD 75% (18 District contestants and 6 Career Contestants
        for (int i = 0; i < 18; i++) {
            Contestant player = new DistrictContestant();
            contestantList.add(player);
            player.setNumber(i + 1);
            player.setName("District Contestant " + player.getNumber());

            if ((i % 2 == 0)) {
                player.setFemale(true);
            } else {
                player.setFemale(false);
            }
            System.out.println(player.getName() + " " + player.getHealthLevel() + " "
                    + player.isFemale() + " " + player.getAttackLevel() + " " + player.getDefenseLevel() + " "
                    + player.isHasWeapon());
        }
    }

    public void assignCareerPlayers() {

        // ADD 25% (6 Career Contestants)
        for (int i = contestantList.size(); i < 24; i++) {
            Contestant player = new CareerContestant();
            contestantList.add(player);
            player.setNumber(i + 1);
            player.setName("Career Contestant " + player.getNumber());
            if ((i % 2 == 0)) {
                player.setFemale(true);
            } else {
                player.setFemale(false);
            }
            System.out.println(player.getName() + " " + player.getHealthLevel() + " "
                    + player.isFemale() + " " + player.getAttackLevel() + " " + player.getDefenseLevel() + " "
                    + player.isHasWeapon());
        }
    }

    public void coinFlip() {
        // initiate coinflip
        Random randomNum = new Random();
        int result = randomNum.nextInt(2);
        int heads = 0;
        int tails = 1;
        Coin coinFlip;

        if (result == 0) {
            coinFlip = Coin.Attacker;
            Attacker.setWinner(true);
            System.out.println("Attacker wins: " + Attacker.getNumber());
            // If attacker wins --> put attacker back in the List. Opponent will not be put back as it
            // is already removed.
            contestantList.add(Attacker);
        } else {
            coinFlip = Coin.Opponent;
            Opponent.setWinner(true);
            System.out.println("Opponent wins: " + Opponent.getNumber());
            // If opponent wins --> put opponent back in the List. Attacker will not be put back as it
            // is already removed.
            contestantList.add(Opponent);
        }
    }

    public void normalFight()
    {
        while (Attacker.isAlive() && Opponent.isAlive())
        {
            int damageA = (Attacker.getAttackLevel() - Opponent.getDefenseLevel());
            System.out.println("Attacker : " + Attacker.getName() + " does " + damageA + " damage to "
                    + Opponent.getName());
            int damageO = (Opponent.getAttackLevel() - Attacker.getDefenseLevel());
            System.out.println("Opponent : " + Opponent.getName() + " does " + damageO + " damage to "
                    + Attacker.getName());
            Opponent.receiveDamage(damageA);
            System.out.println("Opponent : " + Opponent.getName() + " still has " + Opponent.getHealthLevel() + " health.");
            Attacker.receiveDamage(damageO);
            System.out.println("Attacker : " + Attacker.getName() + " still has " + Attacker.getHealthLevel() + " health.");

            if(!Opponent.isAlive())
            {
                contestantList.add(Attacker);
                Attacker.regenerate();
                System.out.println(Attacker.getName() + " wins the match\n");
                break;
            }
            else if(!Attacker.isAlive())
            {
                contestantList.add(Opponent);
                Opponent.regenerate();
                System.out.println(Opponent.getName() + " wins the match\n");
                break;
            }
        }
    }


    public void battle() {
        int day = 1;
        while (contestantList.size() > 1) {
            System.out.println("Welcome to day " + day++ + " of the hungergames");
            selectFighters();
//            coinFlip();
            normalFight();
        }
        System.out.println(contestantList.get(0).getName() + " is the lone survivor!");
        if(contestantList.size() < 1){
            System.out.println("THERE ARE NO SURVIVORS");
        }

    }

        public void selectFighters () {
            // select contestant from Contestantlist --> name it as contestant1 - Attacker
            // select contestant from Constestantlist --> name it as contestant2 - Defense
            // hier moet een random order gepickt worden voor een array.
            int size = contestantList.size();
            // random select from list for Attacker
            Random randA = new Random();
            int indexA = randA.nextInt(size-1);
            // random select from list for Opponent
            Random randO = new Random();
            int indexO = randO.nextInt(size-1);

            Contestant contestant1 = contestantList.get(indexA);
            contestant1.setAttacker(true);
            System.out.println("Selected Attacker: " + contestant1.getNumber());
            // remove from index, because attacker and opponent may not be the same
            contestantList.remove(indexA);

            Contestant contestant2 = contestantList.get(indexO);
            contestant2.setOpponent(true);
            System.out.println("Selected Opponent: " + contestant2.getNumber());
            // remove from index, because opponent and attacker may not be the same
            contestantList.remove(indexO);

            this.Attacker = contestant1;
            this.indexA = indexA;
            this.Opponent = contestant2;
            this.indexO = indexO;
        }


        public List<Contestant> getContestantList () {
            return contestantList;
        }

        public void setContestantList (List < Contestant > contestantList) {
            this.contestantList = contestantList;
        }
    }


