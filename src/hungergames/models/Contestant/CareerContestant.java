package hungergames.models.Contestant;

public class CareerContestant extends Contestant {
    private boolean hasWeapon = true;

    public CareerContestant (){
        // needs to be solved how to connect the old attacklevels with the new attacklevels.
        isHasWeapon();
        System.out.println("Old Attacklevel " + getAttackLevel());
        setAttackLevel(getAttackLevel()+10);
        System.out.println("New Attacklevel " + getAttackLevel());
    }

}
