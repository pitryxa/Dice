package boldarev.model;

public enum DiceType {
    SIX_SIDES(6),
    TWENTY_SIDES(20);

    private final int sidesAmount;

    DiceType(int i) {
        sidesAmount = i;
    }

    public int getSidesAmount() {
        return sidesAmount;
    }
}
