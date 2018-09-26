package hungergames.models.Contestant;

import java.util.concurrent.ThreadLocalRandom;

public class CareerContestant extends Contestant {
    private boolean hasWeapon = true;

    public CareerContestant (){
        super();
        setHasWeapon(true);

        if (isHasWeapon()){
            setAttackLevel(getAttackLevel()+10);
            setDefenseLevel(getDefenseLevel()+5);
        }
    }

}
