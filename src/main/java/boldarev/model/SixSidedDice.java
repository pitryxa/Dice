package boldarev.model;

import java.util.Random;

import static boldarev.model.DiceType.SIX_SIDES;

public class SixSidedDice extends Dice {

    public SixSidedDice() {
        super(new Random().nextInt(SIX_SIDES.getSidesAmount()) + 1);
        diceType = SIX_SIDES;
    }

    public SixSidedDice(int value) {
        super(value);
        diceType = SIX_SIDES;
    }
}
