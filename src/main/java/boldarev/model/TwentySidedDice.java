package boldarev.model;

import java.util.Random;

import static boldarev.model.DiceType.SIX_SIDES;
import static boldarev.model.DiceType.TWENTY_SIDES;

public class TwentySidedDice extends Dice {

    public TwentySidedDice() {
        super(new Random().nextInt(TWENTY_SIDES.getSidesAmount()) + 1);
        diceType = TWENTY_SIDES;
    }

    public TwentySidedDice(Integer value) {
        super(value);
        diceType = TWENTY_SIDES;
    }
}
