package boldarev.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public abstract class Dice {
    private final int value;
    public DiceType diceType;
}
