/*
Simulate a dice roll using Math.random() and display the outcome (1 to 6)
 */

public class _70_DiceRoll {

    int roll() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }
    public static void main(String[] args) {
        _70_DiceRoll dice = new _70_DiceRoll();
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }
    }
}
