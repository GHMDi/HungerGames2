package hungergames.models.Contestant;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Contestant {
//    made Contestant abstract as only DistrictContestant and CareerContestant are allowed to be created
    private int attackLevel;
    private int defenseLevel;
    private int healthLevel;
    private boolean female = true;
    private int number;
    private String name;
    private boolean alive = true;
    private boolean hasWeapon;
    private boolean attacker;
    private boolean opponent;
    private boolean winner;

    public Contestant (){
//        Created base contestant with all necessary info, random attack & defense and health 100
        setHealthLevel(100);
        setAttackLevel(ThreadLocalRandom.current().nextInt(10, 30));
        setDefenseLevel(ThreadLocalRandom.current().nextInt(5, 10));
        setFemale(true);
        this.setAttackLevel(attackLevel);
    }

//    Create function to regenerate health at 100 during sleep
    public void regenerate(){
        setHealthLevel(100);
    }

//    Create method to receive damage, which is used in battle()
    public void receiveDamage(int damage)
    {
        healthLevel -= damage;
        if(healthLevel <= 0)
            alive = false;
    }


    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isHasWeapon() {
        return hasWeapon;
    }

    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

    public boolean isAttacker() {
        return attacker;
    }

    public void setAttacker(boolean attacker) {
        this.attacker = attacker;
    }

    public boolean isOpponent() {
        return opponent;
    }

    public void setOpponent(boolean opponent) {
        this.opponent = opponent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
}
