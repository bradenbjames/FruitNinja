import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;

public class Peach extends cs331Fruit implements IChoppable {
    private int pointValue = 5;

    public Peach() {
        this.setImage(Constants.PEACH_PATH);
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