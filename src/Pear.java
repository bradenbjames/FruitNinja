import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;

public class Pear extends cs331Fruit implements IChoppable {
    private int pointValue = 3;

    public Pear() {
        this.setImage(Constants.PEAR_PATH);
        this.ripen();
        this.wash();
    }

    public int chop() {
        this.splash();
        this.chopGraphically();
        return this.pointValue;

    }

    @Override
    public void move() {
        this.moveFruit();
        // TODO Auto-generated method stub

    }
}
