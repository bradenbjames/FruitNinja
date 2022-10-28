import fruitNinjaHelper.cs331FruitNinjaGame;
import fruitNinjaHelper.cs331ScoreController;

public class Game extends cs331FruitNinjaGame {
    cs331ScoreController cs;

    // You may need to add constructor
    public Game() {
        // ????
    }

    public void updateChoppable(Object o) {
        // Your code goes here

    }

    @Override
    public Object launchItem() {
        // YOUR code goes here
        Bomb b = new Bomb();
        int lower = 0;
        int upper = 4;
        int r = (int) (Math.random() * (upper - lower)) + lower;
        System.out.println(r);
        switch (r) {
            case 0:
                b.moveBomb();

                return b;
            case 1:
            case 2:
            case 3:
            case 4:
            default:
        }
        // Bomb b = new Bomb();
        // Pear p = new Pear();
        // Apple a = new Apple();
        // Peach pe = new Peach();
        // Lemon l = new Lemon();
        return b;
    }

    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
