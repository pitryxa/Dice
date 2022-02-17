package boldarev;

import boldarev.model.Dice;
import boldarev.service.DiceService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    private static final int limit = 10_000;
    private static final DiceService diceService = new DiceService();

    public static void main(String[] args) {

        List<Dice> diceList = Stream.generate(diceService::rollSixSidedDice).limit(limit).collect(Collectors.toList());

        Map<Integer, Double> diceMap = diceList.stream()
                .collect(Collectors.groupingBy(Dice::getValue,
                        Collectors.collectingAndThen(Collectors.toList(), list -> (double) Math.round((double) list.size() / limit * 10_000) / 100)));

        System.out.println(diceMap);
    }
}
