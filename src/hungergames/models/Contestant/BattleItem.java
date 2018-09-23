package hungergames.models.Contestant;

public class BattleItem {

    private String name;
    private int attackPower;
    private int defensePower;


    public BattleItem (String name, int attackPower, int defense)
    {
        setAttackPower(attackPower);
        setDefensePower(defense);
        this.attackPower = attackPower;
        this.defensePower = defense;
        this.name = name;
        new BattleItem(name,attackPower,defense);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }
}
