package hungergames;

import hungergames.Controllers.GameController;
import hungergames.models.Contestant.Contestant;

public class Main {

    public static void main(String[] args) {
        GameController masterBrain = new GameController();
        masterBrain.assignPlayers();
        masterBrain.battle();

    }


}
