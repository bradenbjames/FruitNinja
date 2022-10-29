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
        int lower = 0;
        int upper = 4;
        int r = (int) (Math.random() * (upper - lower)) + lower;
        System.out.println(r);
        switch (r) {
            case 0:
                Bomb a = new Bomb();
                a.moveBomb();
                a.explode();
                return a;
            case 1:
                Pear b = new Pear();
                b.ripen();
                b.wash();
                return b;
            case 2:
                Apple c = new Apple();
                c.ripen();
                c.wash();
                return c;
            case 3:
                Lemon d = new Lemon();
                d.ripen();
                d.wash();
                return d;
            case 4:
                Peach e = new Peach();
                e.ripen();
                e.wash();
                return e;
            default:
        }
        // Bomb b = new Bomb();
        // Pear p = new Pear();
        // Apple a = new Apple();
        // Peach pe = new Peach();
        // Lemon l = new Lemon();
        return null;
    }

    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
