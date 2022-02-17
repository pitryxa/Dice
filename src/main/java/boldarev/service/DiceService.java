package boldarev.service;

import boldarev.model.Dice;
import boldarev.model.SixSidedDice;
import boldarev.model.TwentySidedDice;

public class DiceService {

    public Dice rollSixSidedDice() {
        return new SixSidedDice();
    }

    public Dice rollTwentySidedDice() {
        return new TwentySidedDice();
    }
}