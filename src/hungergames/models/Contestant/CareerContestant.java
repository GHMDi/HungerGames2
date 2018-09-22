package hungergames.models.Contestant;

public class CareerContestant extends Contestant {
    private boolean hasWeapon = true;

    public int Saw(int attackLevel){
        setAttackLevel(getAttackLevel()+20);
        setHasWeapon(true);
        return attackLevel;
    }



    public CareerContestant (){

    }

}
