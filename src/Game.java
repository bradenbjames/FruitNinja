import fruitNinjaHelper.cs331Blade;
import fruitNinjaHelper.cs331FruitNinjaGame;
import fruitNinjaHelper.cs331ScoreController;

public class Game extends cs331FruitNinjaGame {
    cs331ScoreController cs;
    cs331Blade b;

    // You may need to add constructor
    public Game(cs331ScoreController cs, cs331Blade b) {
        this.cs = cs;
        this.b = b;
        this.addBlade(b);
    }

    public void updateChoppable(IChoppable o) {
        o.move();
        // Your code goes here
        if (b.checkIntersection(o)) {
            this.cs.addToScore(o.chop());
        }
    }

    @Override
    public IChoppable launchItem() {
        // YOUR code goes here

        switch ((int) (Math.random() * 5)) {
            case 0:
                Apple a = new Apple();
                return a;
            case 1:
                Lemon l = new Lemon();
                return l;
            case 2:
                Pear p = new Pear();
                return p;
            case 3:
                Peach pe = new Peach();
                return pe;
            case 4:
                Bomb b = new Bomb();
                return b;
            default:
        }
        return null;
    }

    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
