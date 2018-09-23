package hungergames;

import hungergames.Controllers.GameController;
import hungergames.models.Contestant.Contestant;

public class Main {

    public static void main(String[] args) {
        // write your code here
        GameController masterBrain = new GameController();
        masterBrain.assignDistrictPlayers();
        masterBrain.assignCareerPlayers();

    }


}
